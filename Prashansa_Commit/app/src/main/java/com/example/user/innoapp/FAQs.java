package com.example.user.innoapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.regex.Matcher;

public class FAQs extends AppCompatActivity {
    TextView txt1;
    LinearLayout linearLayout;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);
        txt1=(TextView)findViewById(R.id.text1);
        linearLayout=(LinearLayout)findViewById(R.id.linearlayout);
        toolbar=(Toolbar)findViewById(R.id.toolbarfaq);
        toolbar.setTitle("FAQs");
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        txt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               TextView txt = new TextView(FAQs.this);
               txt.setText("vhujsbdcsnfikus");
                txt.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                ));
            linearLayout.addView(txt);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}
