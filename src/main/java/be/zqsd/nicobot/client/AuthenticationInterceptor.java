package be.zqsd.nicobot.client;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

class AuthenticationInterceptor implements Interceptor {

    private final String apiKey;

    AuthenticationInterceptor(String apiKey) {
        this.apiKey = apiKey;
    }

    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        HttpUrl originalUrl = originalRequest.url();

        HttpUrl urlWithToken = originalUrl.newBuilder()
                .addQueryParameter("token", apiKey)
                .build();

        Request requestWithToken = originalRequest.newBuilder()
                .url(urlWithToken)
                .build();

        return chain.proceed(requestWithToken);
    }
}
