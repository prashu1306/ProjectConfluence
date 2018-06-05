package com.example.user.innoapp;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import uk.co.senab.photoview.PhotoViewAttacher;


public class ImageOnClick extends AppCompatActivity {
    String url;
    ImageView imageview;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_on_click);
        Intent intent =getIntent();
         url =intent.getStringExtra("imgg");
         imageview = (ImageView)findViewById(R.id.imgviewonclick);
       // PhotoViewAttacher photoViewAttacher = new PhotoViewAttacher(imageview);
       // photoViewAttacher.update();
         Glide.with(ImageOnClick.this).load(url).into(imageview);
         toolbar =(Toolbar)findViewById(R.id.tool);
         toolbar.setTitle("Proshow name");
        setSupportActionBar(toolbar);

    }



}
