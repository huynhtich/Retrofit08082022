package com.example.retrofit08082022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiService apiService = RetrofitClient.getInstance().getApiService();
        callDemo1(apiService);
    }

    private void callDemo1(ApiService apiService) {
        Call<Demo1DTO> callBackDemo1 = apiService.getDemo1();
        callBackDemo1.enqueue(new Callback<Demo1DTO>() {
            @Override
            public void onResponse(Call<Demo1DTO> call, Response<Demo1DTO> response) {
                Demo1DTO demo1DTO = response.body();
                Log.d("BBB", demo1DTO.toString());
            }

            @Override
            public void onFailure(Call<Demo1DTO> call, Throwable t) {

            }
        });
    }

}