package com.example.samppa.yourmealapp;

import android.widget.TextView;

public class University {
    String name;
    //File file = new File();


    Restaurant restaurant = new Restaurant("Ravintola UkkoPekka");
    Restaurant restaurant2 = new Restaurant("Ravintola Hieno Helma");
    Restaurant restaurant3 = new Restaurant("Ravintola Grill House");


    public University() {
        name = "Kaukaisuuden Yliopisto";
    }

    //calls Restaurant class createMenu method
    public void menu(TextView tv1,TextView tv2, TextView tv3) {
        TextView textView1 = tv1;
        TextView textView2= tv2;
        TextView textView3 = tv3;


        // use this to create new menu files
        restaurant.createMenu(textView1);
        restaurant2.createMenu(textView2);
        restaurant3.createMenu(textView3);



    }



}
