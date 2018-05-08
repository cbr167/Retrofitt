package com.example.bhagy.retrofit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bhagy.retrofit.model.List;
import com.example.bhagy.retrofit.model.Response;
import com.example.bhagy.retrofit.model.Weather;

/**
 * Created by bhagy on 5/6/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.WeatherViewHolder> {

    private java.util.List<Response> responseList;
    private java.util.List<Weather> weatherList;

    public RecyclerAdapter(java.util.List<Response> responseList) {

        this.responseList = responseList;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

        holder.descriptionText.setText(responseList.get(position).getCnt());
        holder.descriptionText.setText(responseList.get(position).getCod());
    }

    @Override
    public int getItemCount() {
        return responseList.size();
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder {

        TextView allText;
        TextView descriptionText;

        public WeatherViewHolder(View itemView) {
            super(itemView);

            allText = itemView.findViewById(R.id.all);
            descriptionText = itemView.findViewById(R.id.description);
        }
    }
}
