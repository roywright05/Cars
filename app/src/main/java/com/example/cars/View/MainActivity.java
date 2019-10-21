package com.example.cars.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.cars.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {

        mButton = view.findViewById(R.id.btnEnter);
        Intent intent = new Intent(this, Main2Activity.class);

        startActivity(intent);

    }
}
