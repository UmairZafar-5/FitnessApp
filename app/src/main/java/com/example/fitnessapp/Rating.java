package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        final RatingBar rating=(RatingBar) findViewById(R.id .ratingBar);
        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float value=rating.getRating();
                Toast.makeText(getApplicationContext(),"You give Fitness App " + value + " rating",Toast.LENGTH_LONG).show();
            }
        });
    }
}
