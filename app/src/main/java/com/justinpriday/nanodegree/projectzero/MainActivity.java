package com.justinpriday.nanodegree.projectzero;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button project1Button;
    private Button project2Button;
    private Button project3Button;
    private Button project4Button;
    private Button project5Button;
    private Button project6Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        project1Button = (Button)findViewById(R.id.project1Button);
        project2Button = (Button)findViewById(R.id.project2Button);
        project3Button = (Button)findViewById(R.id.project3Button);
        project4Button = (Button)findViewById(R.id.project4Button);
        project5Button = (Button)findViewById(R.id.project5Button);
        project6Button = (Button)findViewById(R.id.project6Button);

        project1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch my Spotify Streamer App", Toast.LENGTH_SHORT).show();
            }
        });

        project2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch my Scores App", Toast.LENGTH_SHORT).show();
            }
        });

        project3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch my Library App", Toast.LENGTH_SHORT).show();
            }
        });

        project4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch my Build It Bigger App", Toast.LENGTH_SHORT).show();
            }
        });

        project5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch my XYZ Reader App", Toast.LENGTH_SHORT).show();
            }
        });

        project6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
