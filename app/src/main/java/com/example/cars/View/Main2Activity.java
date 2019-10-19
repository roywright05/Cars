package com.example.cars.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.cars.Model.CarDetails;
import com.example.cars.R;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<CarDetails> mCarDetails;
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

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int position = Integer.parseInt(etInsert.getText().toString());

                if (position % 2 == 0){
                    addCar(position);
                }else if (position == 3){

                    addTruck(position);
                }else{

                    addSuv(position);
                }

            }
        });

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

    public void setButtonClicks(){
        insert = findViewById(R.id.btnInsert);
        insert.setOnClickListener(this);

        remove = findViewById(R.id.btnRemove);
        remove.setOnClickListener(this);
    }

    public void addCar(int position) {

            mCarDetails.add(position,
                    new CarDetails
                            (R.drawable.tesla,
                                    "2020 Tesla Model T",
                                    "Elon Musk's signature brand comes with " +
                                            "improved technology, a quiet engine, and a beautiful " +
                                            "interior.  Oh, did we mention the Lamborghini doors? " +
                                            "\nMSRP: $65,000"));

            mAdapter.notifyItemInserted(position);

    }

    public void addTruck(int position){

        mCarDetails.add(position,
                new CarDetails
                        (R.drawable.ford_f150,
                                "2019 Ford F-150",
                                "The gold standard for pick ups. " +
                                        "The F-150 is a top seller, two decades running. " +
                                        "With unrivaled towing ability and legendary reliability " +
                                        "makes this a must have. \nMSRP: $34,550"));
        mAdapter.notifyItemInserted(position);
    }

    public void addSuv(int position){

        mCarDetails.add(position, new CarDetails(
                R.drawable.porsche,
                "2020 Porche Macan",
                "The luxury SUV to top all others. The Macan is " +
                        "impeccable from bumper to bumper.  With its powerful engine " +
                        "smooth ride and a plethora of luxurious features, this SUV is " +
                        "where you want to spend your hard earned fortune. \n" +
                        "MSRP: $50,500"
        ));

        mAdapter.notifyItemInserted(position);
    }

    public void removeCar(int position){
        mCarDetails.remove(position);
        mAdapter.notifyItemRemoved(position);
    }

    @Override
    public void onClick(View view) {

//        setButtonClicks();
//        etInsert = view.findViewById(R.id.etInsert);
//        int position1 = Integer.parseInt(etInsert.getText().toString());
//        etRemove = view.findViewById(R.id.etRemove);
//        int position2 = Integer.parseInt(etRemove.getText().toString());
//
//        switch (view.getId()){
//
//            case R.id.btnInsert:
//                addCar(position1);
//                mAdapter.notifyItemInserted(position1);
//                break;
//            case R.id.btnRemove:
//                removeCar(position2);
//                break;
//
//                default:
//                    break;
  //      }

    }
}
