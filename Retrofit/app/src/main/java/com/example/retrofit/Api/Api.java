package com.example.retrofit.Api;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;
// dar in class mi khahim yek instance ya nemooneh az retrofot begirim
public class Api {
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    public static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {
        if (retrofit == null){

          retrofit = new Retrofit.Builder().baseUrl(BASE_URL).
                  addConverterFactory(GsonConverterFactory.create()).build();

        }

        return retrofit;
    }
}