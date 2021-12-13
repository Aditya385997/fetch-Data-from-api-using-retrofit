package atekAssignDayOne;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;
import java.util.Map;

public interface ApiCalls {

    @POST("api/getConfigurations.php")
    @FormUrlEncoded
    Call<MainModal> getData(@FieldMap Map<String,String> deviceIp);

}
