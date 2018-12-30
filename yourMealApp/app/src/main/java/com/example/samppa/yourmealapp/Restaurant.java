package com.example.samppa.yourmealapp;

import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class Restaurant {

    String name;
    private int day;
    private int month;
    ArrayList<Object> menu = new ArrayList<>();




    // Date 01.01 menus
    private Food food01011UP = new Food("Kalakeitto", 2.60, "01.01.2018");
    private Food food01012UP = new Food("Lihapullat ja perunamuusi", 2.60, "01.01.2018");
    private Food food01011HH = new Food("Makkarakeitto", 2.60, "01.01.2018");
    private Food food01012HH = new Food("Nakkimestarin kastike ja keitetyt perunat", 2.60, "01.01.2018");
    private Food food01011GH = new Food("Kanahampurilainen", 2.60, "01.01.2018");
    private Food food01012GH = new Food("Lehtipihvi ja ranskalaiset", 2.60, "01.01.2018");

    // Date 02.01 menus
    private Food food02011UP = new Food("Nakkikeitto", 2.60, "02.01.2018");
    private Food food02012UP = new Food("Uunimakkarat ja perunamuusi", 2.60, "02.01.2018");
    private Food food02011HH = new Food("Hernekeitto", 2.60, "02.01.2018");
    private Food food02012HH = new Food("Lihapullat ja perunamuusi", 2.60, "02.01.2018");
    private Food food02011GH = new Food("Juustohampurilainen", 2.60, "02.01.2018");
    private Food food02012GH = new Food("Wienin leike ja rankalaiset", 4.60, "02.01.2018");


    public Restaurant ( ) {
        
    }
    public Restaurant (String n) {
        name = n;


    }



    public void getName (TextView t) {
        TextView text = t;

        text.setText(name);
    }

    public void printMenu () { // TODO TextView t, TextView tv
        //TextView header = t;
        //TextView menu = tv;

        //header.setText(name + "\nRuokalista:\n"); //TODO tarvitaan kaksi TextView komponenttia activityssa

        //System.out.print(food01011UP.setFoodDetailsToArray());



        /*for (int i = 0; i<foodMenu.size();i++) {
            menu.setText(""); //TODO katso arraylist to setText
        }*/

    }



    public ArrayList createMenu (TextView tv) {




         if (name.equals("Ravintola UkkoPekka") ) {

             TextView textView1 = tv;
            /*File.toJson(food01011UP);

            File.toJson(food02011UP);
            File.toJson(food01012UP);*/
            //File.fromJson();
            menu.add(name);
            menu.add(food01011UP);
            menu.add(food01012UP);
            menu.add(food02011UP);
            menu.add(food02012UP);
            File.menuToJsonFile(menu,"ruokalistaUP.json");
            textView1.setText(menu.toString());


            //menu.add(food02012UP);
        } else if (name.equals("Ravintola Hieno Helma")) {


             TextView textView2 = tv;
            menu.add(name);
            menu.add(food01011HH);
            menu.add(food01012HH);
            menu.add(food02011HH);
            menu.add(food02012HH);
            File.menuToJsonFile(menu,"ruokalistaHH.json");
            textView2.setText(menu.toString());

        } else if (name.equals("Ravintola Grill House")) {



             TextView textView3 = tv;
            menu.add(name);
            menu.add(food01011GH);
            menu.add(food01012GH);
            menu.add(food02011GH);
            menu.add(food02012GH);
            File.menuToJsonFile(menu,"ruokalistaGH.json");
            textView3.setText(menu.toString());
        }

        return menu;
       // String foodMenu = menu.toString();
       // return foodMenu;


    }


}
