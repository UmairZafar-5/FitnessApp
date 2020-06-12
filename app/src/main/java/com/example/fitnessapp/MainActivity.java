package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void gotoMenu(View v){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);

    }
    public void gotoRating(View v){
        Intent intent = new Intent(this, Rating.class);
        startActivity(intent);

    }
    public void gotoWebsite(View v){
        Intent intent = new Intent(this, Website.class);
        startActivity(intent);

    }
    public void gotoAbout(View v){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);

    }


}
