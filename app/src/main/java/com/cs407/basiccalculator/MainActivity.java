package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFunction(View view) {
        EditText firstNum = (EditText) findViewById(R.id.firstNumber);
        int firstNumber = Integer.parseInt(firstNum.toString());
        EditText secondNum = (EditText) findViewById(R.id.secondNumber);
        int secondNumber = Integer.parseInt(secondNum.toString());
        int sum = firstNumber + secondNumber;
        String sumStr = Integer.toString(sum);
        //goToActivity(sum);
        Toast.makeText(MainActivity.this, sum, Toast.LENGTH_LONG).show();
    }

    public void goToActivity(String sum) {
        Log.i("INFO", sum);
        Intent intent = new Intent(this, SolutionActivity.class);
        intent.putExtra("result", sum);
        startActivity(intent);
    }
}