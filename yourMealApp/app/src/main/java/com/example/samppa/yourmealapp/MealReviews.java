package com.example.samppa.yourmealapp;


import android.widget.EditText;
import android.widget.RatingBar;




public class MealReviews  {

    String reviewer;
    String dish;
    String review;
    float stars;



    public MealReviews() {

    }

    public void setDetails (EditText et1,EditText et2,EditText et3, RatingBar rb) {

        //editTextReviewer
        EditText editReviewer = et1;
        //editTextMeal
        EditText editMeal = et2;
        //editTextReview
        EditText editReview = et3;
        //ratingBar
        RatingBar ratingBar = rb;

        reviewer = editReviewer.getText().toString();
        review = editReview.getText().toString();
        dish = editMeal.getText().toString();
        stars = ratingBar.getRating();




        System.out.println("Arvostelu: " + review + " Arvostelija:  " + reviewer + " Ruoka: " + dish + " Tähdet: " + stars);
    }
}
