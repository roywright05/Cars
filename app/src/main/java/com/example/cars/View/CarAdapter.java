package com.example.cars.View;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cars.Model.CarBodyTypes;
import com.example.cars.Model.CarDetails;
import com.example.cars.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    private ArrayList<CarBodyTypes> carList;

    public static class CarViewHolder extends RecyclerView.ViewHolder{

        ImageView carImage;
        TextView tvCarModel, tvCarDetails;
        CircleImageView mCircleImageView;

        public CarViewHolder(@NonNull View itemView) {
            super(itemView);

            carImage = itemView.findViewById(R.id.ivCar);
            tvCarModel = itemView.findViewById(R.id.tvCarName);
            tvCarDetails = itemView.findViewById(R.id.tvCarDescription);
            mCircleImageView = itemView.findViewById(R.id.circle_image);
        }
    }

    public CarAdapter(ArrayList<CarBodyTypes> carList) {
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

        CarBodyTypes details = carList.get(position);

        //set get

        holder.carImage.setImageResource(details.getSmallImage());  //.setImageResource(details.getImageResource());
        holder.tvCarModel.setText(details.getCarBodyType());  //.setText(details.getCarModel());
        holder.tvCarDetails.setText(details.getCarCategory());  //.setText(details.getModelDescription());
        //holder.mCircleImageView.setImageResource(R.drawable.audirs4);

    }

    @Override
    public int getItemCount() {
        return carList.size();
    }
}
