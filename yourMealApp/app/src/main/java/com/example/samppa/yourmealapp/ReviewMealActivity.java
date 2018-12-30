package com.example.samppa.yourmealapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

import java.io.IOException;

public class ReviewMealActivity extends AppCompatActivity {

    static int clickcount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_meal);




    }


    public void newReview (View v) {
        clickcount = clickcount + 1;

        MealReviews mealReviews = new MealReviews();

        EditText editReviewer = (EditText) findViewById(R.id.editTextReviewer);
        EditText editMeal = (EditText) findViewById(R.id.editTextMeal);
        EditText editReview = (EditText) findViewById(R.id.editTextReview);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        mealReviews.setDetails(editReviewer,editMeal,editReview,ratingBar);

        try {
            File.reviewToJsonFile(mealReviews,"arvostelu"+clickcount+".json");
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Intent intent = getIntent();
    }
}
