package com.org.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLoginbtnClicked(View view){
        EditText name = findViewById(R.id.Name);

        setContentView(R.layout.activity_login);

        TextView t1= findViewById(R.id.Result);
        t1.setText("Name: "+name.getText().toString());

//        EditText password = findViewById(R.id.Pass);


        TextView t2= findViewById(R.id.Result2nd);
        t2.setText("Password: "+ "Maa Nai Batoun Ga ;)");

        TextView t3= findViewById(R.id.Greeting);
        t3.setText("Hi!, "+ name.getText().toString() +" We are very happy that you are here and we will be" +
                " Pleased to see you again and again soon \nThanks for coming");


    }
}