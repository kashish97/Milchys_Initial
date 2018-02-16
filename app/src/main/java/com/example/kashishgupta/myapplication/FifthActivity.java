package com.example.kashishgupta.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import android.text.method.LinkMovementMethod;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);


        TextView textView = (TextView) findViewById(R.id.textView10);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='facebook.com/milchys'> facebook.com/milchys </a>";
        textView.setText(Html.fromHtml(text));
    }}