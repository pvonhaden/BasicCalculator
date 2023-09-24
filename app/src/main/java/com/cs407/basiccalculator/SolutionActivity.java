package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SolutionActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);
        TextView resultTextView = findViewById(R.id.textView);

        Intent intent=getIntent();
        float result = intent.getFloatExtra("result",0);
        String formattedResult = String.format("%.2f", result);
        resultTextView.setText("" + formattedResult);



    }
}