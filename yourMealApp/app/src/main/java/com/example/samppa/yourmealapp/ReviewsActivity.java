package com.example.samppa.yourmealapp;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReviewsActivity extends AppCompatActivity {

    Context context = this;
    private TextView textView;
    private Spinner spinner;




    String[] SavedFiles;
    private Menu menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        textView = (TextView) findViewById(R.id.textViewReviews);

        spinner = (Spinner) findViewById(R.id.spinnerFiles);

        ShowSavedFiles();

        addListenerToSpinner();



        ShowSavedFiles();

    }
    //get files that are shown in spinner
    private void ShowSavedFiles() {
        SavedFiles = getApplicationContext().fileList();
        ArrayAdapter<String> adapter
                = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                SavedFiles);

        spinner.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }



    //get file name and set file to textView
    public void addListenerToSpinner() {
        spinner = (Spinner) findViewById(R.id.spinnerFiles);
        textView = (TextView) findViewById(R.id.textViewReviews);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long arg3) {

                String result = parent.getItemAtPosition(pos).toString();
                FileInputStream fis;
                String content = "";
                try {
                    String file = result;
                    fis = openFileInput(file);
                    byte[] input = new byte[fis.available()];
                    while (fis.read(input) != -1) {
                    }
                    content += new String(input);
                    JSONObject jsonObject = new JSONObject(content);
                    String dish = jsonObject.getString("dish");
                    String review = jsonObject.getString("review");
                    int stars = jsonObject.getInt("stars");

                    String print = ("Ruoka: " + dish + "\nArvostelu: " + review + "\nTähdet: " + stars);

                    String res = result;

                    textView.setText(print);


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                //textView.setText(result);


            }

            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });

    }

    public void deleteSelectedFile (View v) {
        spinner = (Spinner) findViewById(R.id.spinnerFiles);
        textView = (TextView) findViewById(R.id.textViewReviews);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long arg3) {

                String result = parent.getItemAtPosition(pos).toString();


                File file = new File(context.getFilesDir().getPath() + "/" + result);
                file.delete();

                //textView.setText(result + " poistettu");







            }

            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });

    }

}
