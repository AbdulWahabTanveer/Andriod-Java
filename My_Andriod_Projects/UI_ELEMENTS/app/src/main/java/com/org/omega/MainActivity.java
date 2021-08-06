package com.org.omega;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private CheckBox harry, frozen, battleship;
    private RadioGroup MartialStatus;

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
        switch (buttonView.getId()) {
            case R.id.Harry:
                Toast.makeText(MainActivity.this, "Added Harry Potter", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Frozen:
                Toast.makeText(MainActivity.this, "Added Frozen", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Battleship:
                Toast.makeText(MainActivity.this, "Added Battleship", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }}
        else{
            switch (buttonView.getId()) {
                case R.id.Harry:
                    Toast.makeText(MainActivity.this, "Removed Harry Potter", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Frozen:
                    Toast.makeText(MainActivity.this, "Removed Frozen", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.Battleship:
                    Toast.makeText(MainActivity.this, "Removed Battleship", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        harry = findViewById(R.id.Harry);
        harry.setOnCheckedChangeListener(this);
        frozen = findViewById(R.id.Frozen);
        frozen.setOnCheckedChangeListener(this);
        battleship = findViewById(R.id.Battleship);
        battleship.setOnCheckedChangeListener(this);


        MartialStatus = findViewById(R.id.status);

        MartialStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.Single:
                        Toast.makeText(MainActivity.this, "Open Front Camera", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Married:
                        Toast.makeText(MainActivity.this, "Use lemon Max for dishes", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Rehan_Slayer:
                        Toast.makeText(MainActivity.this, "Rehan and Slayer Spotted", Toast.LENGTH_SHORT).show();
                        break;
                }
            }


        });
    }
}
