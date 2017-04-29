package com.example.developer.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hello extends AppCompatActivity {
    private final String TAG = "MainActivity";
    private Button btnoi;
    private TextView tviText;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        btnoi = (Button) findViewById(R.id.btn_oi):
        btnoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tviText.setText("Brasil");
            }
        });
    }
}