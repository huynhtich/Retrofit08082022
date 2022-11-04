package com.example.retrofit08082022;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tichhv on 11/4/2022.
 **/
public interface ApiService {
    @GET("KhoaPhamTraining/json/tien/demo1.json")
    Call<Demo1DTO> getDemo1();
}
