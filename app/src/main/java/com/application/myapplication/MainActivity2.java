package com.application.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sharedPreferences=getSharedPreferences(getString(R.string.app_name),MODE_PRIVATE);
        String mystring=sharedPreferences.getString("name","deafult");
        textView.setText(mystring);
        textView=findViewById(R.id.textView);






    }
}