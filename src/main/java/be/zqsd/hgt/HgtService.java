package be.zqsd.hgt;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface HgtService {

    @GET("/scores/hgt/{channel}")
    Call<HgtResponse> currentWeekScores(@Path("channel") String channel);

    @GET("/scores/hgt/{channel}/{year}")
    Call<HgtResponse> scoresByYear(@Path("channel") String channel, @Path("year") int year);

    @GET("/scores/hgt/{channel}/{year}/{week}")
    Call<HgtResponse> scoresByWeek(@Path("channel") String channel, @Path("year") int year, @Path("week") int week);

    @POST("/scores/hgt/{channel}")
    Call<Void> addScore(@Path("channel") String channel, @Body HgtRequest scores);

}
