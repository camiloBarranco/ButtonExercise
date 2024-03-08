package com.example.buttonexercise;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button clickButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButton = findViewById(R.id.clickButton);

        clickButton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("Click", "Se ha dado click en el botón");
            }
        });
    }
}