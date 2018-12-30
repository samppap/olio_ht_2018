package com.example.samppa.yourmealapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.Contacts.SettingsColumns.KEY;

public class UserActivity extends AppCompatActivity {
    private final String KEY1 = "Nimi";
    private final String KEY2 = "Nimimerkki";
    private final String KEY3 = "Sähköpostiosoite";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        final EditText editTextUserName = (EditText) findViewById(R.id.editTextUserName);
        final EditText editTextNickName = (EditText) findViewById(R.id.editTextNickName);
        final EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);

        editTextUserName.setText(getUsername());
        editTextNickName.setText(getNickname());
        editTextEmail.setText(getEmail());


        Button button = (Button) findViewById(R.id.buttonSaveUser);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveUsername(editTextUserName.getText().toString());
                saveNickname(editTextNickName.getText().toString());
                saveEmail(editTextEmail.getText().toString());

            }
        });

    }


    private String getUsername() {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        String savedValue = sharedPref.getString(KEY1, "Nimi"); //the 2 argument return default value

        return savedValue;
    }
    private String getNickname() {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        String savedValue = sharedPref.getString(KEY2, "Nimimerkki"); //the 2 argument return default value

        return savedValue;
    }

    private String getEmail() {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        String savedValue = sharedPref.getString(KEY3, "Sähköpostiosoite"); //the 2 argument return default value

        return savedValue;
    }


    private void saveUsername(String text) {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY1, text);
        editor.apply();
    }

    private void saveNickname(String text) {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY2, text);
        editor.apply();
    }

    private void saveEmail(String text) {
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY3, text);
        editor.apply();
    }


}



