package com.example.cars.View;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cars.Model.CarDetails;
import com.example.cars.R;

import java.util.ArrayList;


public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    private ArrayList<CarDetails> carList;



    public static class CarViewHolder extends RecyclerView.ViewHolder{

        ImageView carImage;
        TextView tvCarModel, tvCarDetails;

        public CarViewHolder(@NonNull View itemView) {
            super(itemView);

            carImage = itemView.findViewById(R.id.ivCar);
            tvCarModel = itemView.findViewById(R.id.tvCarName);
            tvCarDetails = itemView.findViewById(R.id.tvCarDescription);
        }
    }

    public CarAdapter(ArrayList<CarDetails> carList) {
        this.carList = carList;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_items, parent, false);

        CarViewHolder carViewHolder = new CarViewHolder(view);
        return carViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {

        CarDetails details = carList.get(position);

        holder.carImage.setImageResource(details.getImageResource());
        holder.tvCarModel.setText(details.getCarModel());
        holder.tvCarDetails.setText(details.getModelDescription());

    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}
