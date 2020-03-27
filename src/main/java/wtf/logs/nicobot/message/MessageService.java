package wtf.logs.nicobot.message;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.time.LocalDateTime;

public interface MessageService {

    @GET("/messages")
    Call<MessageResponse> readMessages(@Query("start_date") LocalDateTime startDate,
                            @Query("start") Integer start,
                            @Query("limit") Integer limit);

    @POST("/messages")
    Call<Void> saveMessages(@Body MessageRequest messages);
}
