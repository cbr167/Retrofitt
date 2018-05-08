package com.example.bhagy.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.widget.Toast;

import com.example.bhagy.retrofit.model.Response;

import java.util.List;

import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Response> responses;
    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        retrofit2.Call<Response> call = apiInterface.getResponse();

        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(retrofit2.Call<Response> call, retrofit2.Response<Response> response) {
                responses = (List<Response>) response.body();
                recyclerView.setAdapter(recyclerAdapter);
            }

            @Override
            public void onFailure(retrofit2.Call<Response> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"failed",Toast.LENGTH_LONG).show();

            }
        });
    }
}
