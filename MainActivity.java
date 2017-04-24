package com.example.alex.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String memory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        memory = "";
    }

    public void OnePressed(View view)
    {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "1";
        result.setText(memory);
    }

    public void TwoPressed(View view)
    {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "2";
        result.setText(memory);
    }

    public void ThreePressed(View view)
    {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "3";
        result.setText(memory);
    }

    public void FourPressed(View view)
    {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "4";
        result.setText(memory);
    }

    public void FivePressed(View view)
    {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "5";
        result.setText(memory);
    }

    public void SixPressed(View view)
    {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "6";
        result.setText(memory);
    }

    public void SevenPressed(View view)
    {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "7";
        result.setText(memory);
    }

    public void EightPressed(View view)
    {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "8";
        result.setText(memory);
    }

    public void NinePressed(View view)
    {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "9";
        result.setText(memory);
    }

    public void ZeroPressed(View view)
    {
        TextView result = (TextView) findViewById(R.id.result_text);
        memory += "0";
        result.setText(memory);
    }
}