package atekAssignDayOne;

import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.HashMap;
import java.util.Map;

public class ApiController {
    static Retrofit retrofit;
    static ApiController apiController;
    public  ApiController()
    {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://10.13.3.8:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static  synchronized ApiController getInstance()
    {
        if(apiController == null)
          apiController =  new ApiController();
        return apiController;
    }
    public ApiCalls getApi()
    {
        return retrofit.create(ApiCalls.class);
    }

}
