package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFunction(View view) {
        EditText firstNum = (EditText) findViewById(R.id.firstNumber);
        EditText secondNum = (EditText) findViewById(R.id.secondNumber);

        float n1 = Float.parseFloat(firstNum.getText().toString());
        float n2 = Float.parseFloat(secondNum.getText().toString());
        float sum = n1+n2;
        Intent intent = new Intent(this, SolutionActivity.class);
        intent.putExtra("result", sum);
        startActivity(intent);
    }
    public void subtractFunction(View view) {
        EditText firstNum = (EditText) findViewById(R.id.firstNumber);
        EditText secondNum = (EditText) findViewById(R.id.secondNumber);

        float n1 = Float.parseFloat(firstNum.getText().toString());
        float n2 = Float.parseFloat(secondNum.getText().toString());
        float sum = n1-n2;
        Intent intent = new Intent(this, SolutionActivity.class);
        intent.putExtra("result", sum);
        startActivity(intent);
    }

    public void multiplyFunction(View view) {
        EditText firstNum = (EditText) findViewById(R.id.firstNumber);
        EditText secondNum = (EditText) findViewById(R.id.secondNumber);

        float n1 = Float.parseFloat(firstNum.getText().toString());
        float n2 = Float.parseFloat(secondNum.getText().toString());
        float sum = n1*n2;
        Intent intent = new Intent(this, SolutionActivity.class);
        intent.putExtra("result", sum);
        startActivity(intent);
    }

    public void divideFunction(View view) {
        EditText firstNum = (EditText) findViewById(R.id.firstNumber);
        EditText secondNum = (EditText) findViewById(R.id.secondNumber);

        float n1 = Float.parseFloat(firstNum.getText().toString());
        float n2 = Float.parseFloat(secondNum.getText().toString());
        float sum = n1/n2;
        Intent intent = new Intent(this, SolutionActivity.class);
        intent.putExtra("result", sum);
        startActivity(intent);
    }


}