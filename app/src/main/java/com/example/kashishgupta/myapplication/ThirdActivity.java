package com.example.kashishgupta.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
Button btn;
Button btn1;
        btn = (Button) findViewById(R.id.button);
        btn1 = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
    }


    public void onClick(View view)
    {
    if(view.getId()==R.id.button){
    Intent i =new Intent(ThirdActivity.this , FourthActivity.class);
    startActivity(i);
    }
        if(view.getId()==R.id.button2){
            Intent i =new Intent(ThirdActivity.this , FifthActivity.class);
            startActivity(i);
        }
}}


