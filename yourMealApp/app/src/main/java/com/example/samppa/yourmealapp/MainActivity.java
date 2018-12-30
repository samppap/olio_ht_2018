package com.example.samppa.yourmealapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new File (this);


        // main activity textviews
        TextView textviewUP = (TextView) findViewById(R.id.textViewUP);
        TextView textviewHH = (TextView) findViewById(R.id.textViewHH);
        TextView textviewGH = (TextView) findViewById(R.id.textViewGH);

        // call menu method --> set text to main activity textviews
        University university = new University();
        university.menu(textviewUP,textviewHH,textviewGH);








    }

    /** Called when the user taps the "Arvostele" button */
    //Starts new activity called ReviewMealActivity
    public void openNewRewiew(View view) {

        Intent intent = new Intent(this, ReviewMealActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the "Arvostele" button */
    //Starts new activity called ReviewsActivity
    public void openRewiews(View view) {

        Intent intent = new Intent(this, ReviewsActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the "Käyttäjä" button */
    //Starts new activity called UserActivity
    public void openUserDetails(View view) {

        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }
}
