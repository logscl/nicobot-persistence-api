package be.zqsd.nicobot.client;

import be.zqsd.nicobot.gommette.GommetteService;
import be.zqsd.nicobot.hgt.HgtService;
import be.zqsd.nicobot.message.MessageService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;
import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_ENUMS_USING_INDEX;

public class NicobotPersistence {

    private final String url;
    private final String apiKey;
    private final Retrofit client;

    private NicobotPersistence(String url, String apiKey) {
        this.url = url;
        this.apiKey = apiKey;
        this.client = createClient();
    }

    public static NicobotPersistence create(String url, String apiKey) {
        return new NicobotPersistence(url, apiKey);
    }


    private Retrofit createClient() {
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new AuthenticationInterceptor(apiKey))
                .build();

        ObjectMapper mapper = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .disable(WRITE_DATES_AS_TIMESTAMPS)
                .enable(WRITE_ENUMS_USING_INDEX);

        JacksonConverterFactory converter = JacksonConverterFactory.create(mapper);

        return new Retrofit.Builder()
                .addConverterFactory(converter)
                .client(httpClient)
                .baseUrl(url)
                .build();
    }

    public MessageService messageService() {
        return client.create(MessageService.class);
    }
    public HgtService hgtService() {
        return client.create(HgtService.class);
    }
    public GommetteService gommetteService() {
        return client.create(GommetteService.class);
    }
}
