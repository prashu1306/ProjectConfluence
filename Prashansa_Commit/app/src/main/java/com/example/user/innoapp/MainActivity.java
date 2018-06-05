package com.example.user.innoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void eventdetails(View view)
    {
        Intent intent = new Intent(MainActivity.this,activity_details.class);
        startActivity(intent);
    }
    public void proshow(View view)
    {
        Intent intent = new Intent(MainActivity.this,ProshowPage.class);
        startActivity(intent);
    }
    public void help(View view)
    {
        Intent intent = new Intent(MainActivity.this,FaqandHelp.class);
        startActivity(intent);
    }

}
