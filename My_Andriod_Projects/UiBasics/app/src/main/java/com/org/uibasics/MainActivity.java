package com.org.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
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
        EditText email = findViewById(R.id.Email);

        TextView t1= findViewById(R.id.Result);
        t1.setText("Email: "+email.getText().toString());

        EditText password = findViewById(R.id.Pass);


        TextView t2= findViewById(R.id.Result2nd);
        t2.setText("Password: "+ "Maa nai Batoun ga");
    }
}