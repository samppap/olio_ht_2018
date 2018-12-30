package com.example.samppa.yourmealapp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Food {

    private String dish;
    private double price;
    private String day;



    public Food (String d, double p, String dt) {
        dish = d;
        price = p;
        day = dt;



    }

@Override
    public String toString() {
        return "\nPäivä: " + getDay() + "\nRuoka: " + getDish() + "\nHinta: " + getPrice() + "€\n";

    }

    /*public ArrayList setFoodDetailsToArray () {
        Food food = new Food(dish, price, day,restaurant);

        foodMenu.add(food);
        foodMenu.add(food);

        //String menu = foodMenu.toString();
        return foodMenu;
    }*/



    public String getDish () {
        return dish;
    }
    public double getPrice () {
        return price;
    }
    public String getDay () {
        return day;
    }
    


}
