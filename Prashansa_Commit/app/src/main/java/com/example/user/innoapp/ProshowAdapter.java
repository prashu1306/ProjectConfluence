package com.example.user.innoapp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.Serializable;
import java.util.ArrayList;

public class ProshowAdapter  extends RecyclerView.Adapter<ProshowAdapter.MyViewHolder>implements Serializable {
    ArrayList<ImageUrl> array = new ArrayList<ImageUrl>();
    Activity activity;

    public ProshowAdapter(ArrayList<ImageUrl> array,Context context) {
        this.array = array;
        activity =(Activity)context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_element,parent,false);
        return new MyViewHolder(view,activity,array);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(activity).load(array.get(position).getUrl()).thumbnail(0.5f).into(holder.ImgView);

    }

    @Override
    public int getItemCount() {
        return array.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView ImgView;
        public  ArrayList<ImageUrl>arrayList = new ArrayList<ImageUrl>();
        Context ctx;
        public MyViewHolder(View itemView,Context ctx,ArrayList<ImageUrl> arrayList) {
            super(itemView);
            this.arrayList = arrayList;
            this.ctx= ctx;
            itemView.setOnClickListener(this);

            ImgView=(ImageView)itemView.findViewById(R.id.proshowimage);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            ImageUrl img = this.arrayList.get(position);
            Intent intent = new Intent(this.ctx,ProshowDetails.class);
            intent.putExtra("img",arrayList.get(position).getUrl());
            ctx.startActivity(intent);



        }


    }
}




