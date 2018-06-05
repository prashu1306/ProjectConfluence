package com.example.user.innoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class EventImage extends AppCompatActivity {
    String url;
    ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_image);
        imageview =(ImageView)findViewById(R.id.imgevent);
        Intent intent = getIntent();
       url= intent.getStringExtra("eventimg");
       Glide.with(EventImage.this).load(url).into(imageview);

    }
}
