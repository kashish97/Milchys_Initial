package com.example.kashishgupta.myapplication;

import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {



        Button btn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            btn = (Button) findViewById(R.id.button3);

            btn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    // Intent code for open new activity through intent.

                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    startActivity(intent);
                    new connector();
                }
            });

        }
        public class abc extends connector{
            public void connector(){
                System.out.print("hello");
            }
        }
    }

