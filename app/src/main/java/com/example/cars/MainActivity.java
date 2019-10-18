package com.example.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton;
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
