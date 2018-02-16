package com.aim.retrofitdemo;


import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Ildi on 2/14/2018.
 */

public class ServiceGenerator {


    private static final String BASE_URL = "https://developer.github.com/v3/";

    /* version 2
    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    private static HttpLoggingInterceptor logging = new HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY);


    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    public static <S> S createService(
            Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    } */

    private static RestAdapter.Builder builder = new RestAdapter.Builder().setEndpoint(BASE_URL)
                                                                            .setClient(new OkClient(new OkHttpClient()));

    public static <S> S createService(Class<S> serviceClass){
        RestAdapter adapter = builder.build();
        return adapter.create(serviceClass);
    }


}
