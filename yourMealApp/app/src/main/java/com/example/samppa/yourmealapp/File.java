package com.example.samppa.yourmealapp;

import android.content.Context;
import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class File {
    //TODO arraylist --> json, gsonin avulla + tallennus tiedostoon DONE

    private static Context context;




    public File(Context context) {
        this.context = context;
    }



    public static void reviewToJsonFile (MealReviews mealReviews, String fileName) throws IOException {
        Gson gson = new Gson();
        String menuJson = gson.toJson(mealReviews);
        System.out.println(menuJson);


        // write menuJson to file


        try {
            FileWriter file = new FileWriter(context.getFilesDir().getPath() + "/" + fileName, false);
            file.write(menuJson);
            file.flush();
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void menuToJsonFile(ArrayList menu,String fileName) {


        Gson gson = new Gson();
        String menuJson = gson.toJson(menu);



        // write menuJson to file


        try {
            FileWriter file = new FileWriter(context.getFilesDir().getPath() + "/menus/" + fileName, false);
            file.write(menuJson);
            file.flush();
            file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }





}
