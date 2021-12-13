package atekAssignDayOne;

import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.net.StandardSocketOptions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainDayOne
{

    public static void main(String [] args)
    {
        DatabaseService db = new DatabaseService();
        db.runQuery();
        Map<String,String> deviceIp = new HashMap<>();
        deviceIp.put("device_ip","10.13.3.201");
        Call<MainModal> mainModalCall = ApiController.getInstance().getApi().getData(deviceIp);
        mainModalCall.enqueue(new Callback<MainModal>() {
            @Override
            public void onResponse(Call<MainModal> call, Response<MainModal> response) {
                //System.out.println(new Gson().toJson(response.body()));
                assert response.body() != null;
                List<FareModal> fares = response.body().getFares();
                //System.out.println(new Gson().toJson(fares));
                List<StationModal> stations = response.body().getStations();
                //System.out.println(new Gson().toJson(stations));
                List<UserModal> users = response.body().getUsers();
                List<ProductsModal> products = response.body().getProducts();
                EquipmentsModal equipmentsModal = response.body().getEquipment();

                db.insertEquipmentsData(equipmentsModal);

                for (FareModal fare : fares)
                    db.insertFareData(fare);
                for (StationModal station : stations) {
                    System.out.println(new Gson().toJson(station));
                    db.insertStationData(station);
                }
                for(UserModal user : users) {
                    System.out.println(new Gson().toJson(user));
                    db.insertUser(user);
                }
                for(ProductsModal product:products)
                {
                    System.out.println(new Gson().toJson(product));
                    db.insertProductData(product);
                }

            }

            @Override
            public void onFailure(Call<MainModal> call, Throwable t) {
                System.err.println(t.getMessage());
            }
        });


    }
}
