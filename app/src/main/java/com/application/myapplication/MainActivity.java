package com.application.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText search;
Button button1,button2;
SharedPreferences sharedPreferences;
SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences=getSharedPreferences(getString(R.string.app_name),MODE_PRIVATE);
     editor=sharedPreferences.edit();
        search=findViewById(R.id.search);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=search.getText().toString();
                editor.putString("name", ""+name);
                editor.apply();



            }
        });





        button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

      startActivity(new Intent(MainActivity.this,MainActivity2.class));



    }
});


    }
}