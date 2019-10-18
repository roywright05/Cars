package com.example.cars.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cars.Model.CarDetails;
import com.example.cars.R;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private ArrayList<CarDetails> mCarDetails;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setContent();
        setArrayAdapter();
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

        mCarDetails.add( new CarDetails(R.drawable.audirs4,
                "2019 Audi RS4",
                "The A4 body with an amazing interior and a 420hp engine " +
                        "This beast goes from 0 - 60 in under 4.5 seconds.  Swift and Sexy. " +
                        "\nMSRP: Pending") );

        mCarDetails.add( new CarDetails(R.drawable.bmw_4_series,
                "2018 BMW 435i",
                "The 4 series coupe is one of the latest in the German " +
                        "auto companies line of sporty, luxurious cars.  The " +
                        "435i comes with a 3.0 L 6-cylinder engine that pushes 300hp. " +
                        "\nMSRP: $48,150 ") );

        mCarDetails.add( new CarDetails(R.drawable.vw_gti,
                "2019 Volkswagen Golf GTI",
                "This stylish hatchback is one of our favorites.  The GTI gives" +
                        " us speed, style and practicality, all at a reasonable price. " +
                        "This Golf model comes with a 4-cylinder, 220hp engine. " +
                        "\nMSRP: $28,415") );



    }
}
