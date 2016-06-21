package com.justinpriday.nanodegree.projectzero;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View V) {
        switch(V.getId()) {
            case R.id.project1Button:
//                Toast.makeText(getApplicationContext(),"This button will launch my Spotify Streamer App", Toast.LENGTH_SHORT).show();
                //Launch com.justinpriday.nonodegree.projectTwo
//                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.package.address");
//                startActivity(launchIntent);
                startActivity(getPackageManager().getLaunchIntentForPackage("com.justinpriday.nonodegree.projectTwo"));
                break;

            case R.id.project2Button:
//                Toast.makeText(getApplicationContext(),"This button will launch my Scores App", Toast.LENGTH_SHORT).show();
                //barqsoft.footballscores
                startActivity(getPackageManager().getLaunchIntentForPackage("barqsoft.footballscores"));
                break;

            case R.id.project3Button:
//                Toast.makeText(getApplicationContext(),"This button will launch my Library Streamer App", Toast.LENGTH_SHORT).show();
                //it.jaschke.alexandria
                startActivity(getPackageManager().getLaunchIntentForPackage("it.jaschke.alexandria"));
                break;

            case R.id.project4Button:
//                Toast.makeText(getApplicationContext(),"This button will launch my Build It Bigger Streamer App", Toast.LENGTH_SHORT).show();
                //com.udacity.gradle.builditbigger.free
                startActivity(getPackageManager().getLaunchIntentForPackage("com.udacity.gradle.builditbigger.free"));
                break;

            case R.id.project5Button:
//                Toast.makeText(getApplicationContext(),"This button will launch my Make Your App Material App", Toast.LENGTH_SHORT).show();
                //com.example.xyzreader
                startActivity(getPackageManager().getLaunchIntentForPackage("com.example.xyzreader"));
                break;

            case R.id.project6Button:
//                Toast.makeText(getApplicationContext(),"This button will launch my Go Ubiquitous App", Toast.LENGTH_SHORT).show();
                //com.example.android.sunshine.app
                startActivity(getPackageManager().getLaunchIntentForPackage("com.example.android.sunshine.app"));
                break;

            case R.id.project7Button:
                Toast.makeText(getApplicationContext(),"This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

