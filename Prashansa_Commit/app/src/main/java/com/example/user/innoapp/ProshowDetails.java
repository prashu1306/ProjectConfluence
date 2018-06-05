package com.example.user.innoapp;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ProshowDetails extends AppCompatActivity {
   Toolbar toolbar;
   CollapsingToolbarLayout collapsingToolbarLayout;
    String url;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proshow_details);
        toolbar =(Toolbar)findViewById(R.id.toolbar1);
        toolbar.setTitle("Proshow Details");
        collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.ctoolbar1);

        imageView =(ImageView)findViewById(R.id.imgvvv1);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        Intent intent = getIntent();
        url = intent.getStringExtra("img");
        Glide.with(ProshowDetails.this).load(url).into(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProshowDetails.this,ImageOnClick.class);
                intent.putExtra("imgg",url);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_proshowdetails,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();
        switch(id)
        {
            case R.id.share :
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, url);
                startActivity(Intent.createChooser(sharingIntent, "Share Image Using"));
                break;

            case R.id.home:
                         finish();
                          break;
        }
        return super.onOptionsItemSelected(item);
    }

}
