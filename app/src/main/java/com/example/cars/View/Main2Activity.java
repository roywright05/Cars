package com.example.cars.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cars.Model.CarBodyTypes;
import com.example.cars.Model.CarDetails;
import com.example.cars.R;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private ArrayList<CarBodyTypes> mCarDetails;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private Button remove, insert;
    private EditText etInsert, etRemove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setContent();
        setArrayAdapter();
        //setButtonClicks();

        insert = findViewById(R.id.btnInsert);
        remove = findViewById(R.id.btnRemove);

        etInsert = findViewById(R.id.etInsert);
        etRemove = findViewById(R.id.etRemove);



        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int position = Integer.parseInt(etRemove.getText().toString());

                removeCar(position);
            }
        });

    }

    public void setArrayAdapter() {

        // Six lines of code can go here, but 5 are necessary

        mRecyclerView = findViewById(R.id.recyclerview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new CarAdapter(mCarDetails);
        mRecyclerView.setAdapter(mAdapter);
    }

    public void setContent() {

        mCarDetails = new ArrayList<>();

        mCarDetails.add(new CarBodyTypes(R.drawable.sedan,
                "Family Sedans", "Four door vehicles that seat five."));
        mCarDetails.add(new CarBodyTypes(R.drawable.suv,
                "Sports Utility Vehicles", "Higher seating position and more luggage space than sedans."));
        mCarDetails.add(new CarBodyTypes(R.drawable.sports_car,
                "Sports Cars", "Smaller cars with tight handling and quick acceleration."));
        mCarDetails.add(new CarBodyTypes(R.drawable.hatchback,
                "Hatchbacks", "Compact cars with lift-back trunks providing extra versatility and affordability"));
        mCarDetails.add(new CarBodyTypes(R.drawable.coupe,
                "Coupes", "Two door cars for those not wanting too many passengers"));
        mCarDetails.add(new CarBodyTypes(R.drawable.truck,
                "Pick-up Trucks", "Large, high viewing position with excellent hauling capabilities."));
        mCarDetails.add(new CarBodyTypes(R.drawable.luxury_car,
                "Luxury Cars", "Extra refinement and features"));


    }

    public void removeCar(int position){
        mCarDetails.remove(position);
        mAdapter.notifyItemRemoved(position);
    }


}
