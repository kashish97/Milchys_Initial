package com.example.kashishgupta.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.webkit.WebView;

public class FourthActivity extends AppCompatActivity {

    WebView webview;
    void initviews(){
        webview=(WebView)findViewById(R.id.w1);
        WebViewClient client= new WebViewClient();
        webview.setWebViewClient(client);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdXs7TWy1qp-iSRFfjjzelaen0hJOSRt6qt-rGyMNrNsiN65g/viewform");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        initviews();



    }
}