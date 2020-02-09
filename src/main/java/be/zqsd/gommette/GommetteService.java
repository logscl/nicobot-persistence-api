package be.zqsd.gommette;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GommetteService {

    @GET("/scores/gommettes")
    Call<GommetteResponse> currentYearGommettes();

    @GET("/scores/gommettes/{year}")
    Call<GommetteResponse> gommettesByYear(@Path("year") int year);

    @GET("/scores/gommettes/{year}/{userId}")
    Call<GommetteResponse> gommettesByYearForUser(@Path("year") int year, @Path("userId") String userId);

    @POST("/scores/gommettes")
    Call<Void> addGommette(@Body GommetteRequest gommette);
}
