package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewImage1(View view) {
        Intent intent = new Intent(this, DisplayImage1Activity.class);
        startActivity(intent);
    }
    public void viewImage2(View view) {
        Intent intent = new Intent(this, DisplayImage2Activity.class);
        startActivity(intent);
    }
    public void viewImage3(View view) {
        Intent intent = new Intent(this, DisplayImage3Activity.class);
        startActivity(intent);
    }
    public void viewImage4(View view) {
        Intent intent = new Intent(this, DisplayImage4Activity.class);
        startActivity(intent);
    }
    public void viewImage5(View view) {
        Intent intent = new Intent(this, DisplayImage5Activity.class);
        startActivity(intent);
    }
    public void exitApp(View view) {
        finish();
        System.exit(0);
    }
}

