package com.example.yeongpyo.testcodeapp;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        View content_main = findViewById(R.id.content_main);
        ViewFlipper flipper = content_main.findViewById(R.id.viewFlipper);


        /*ArrayList<View> Viewarr = new ArrayList<>();
        View view;
        view = LayoutInflater.from(this).inflate(R.layout.img_item, null, false);
        view.setBackgroundResource(android.R.drawable.sym_def_app_icon);
        view = LayoutInflater.from(this).inflate(R.layout.img_item, null, false);
        view.setBackgroundResource(android.R.drawable.sym_def_app_icon);
        view = LayoutInflater.from(this).inflate(R.layout.img_item, null, false);
        view.setBackgroundResource(android.R.drawable.sym_def_app_icon);
        view = LayoutInflater.from(this).inflate(R.layout.img_item, null, false);
        view.setBackgroundResource(android.R.drawable.sym_def_app_icon);
        for (View v : Viewarr) {
            flipper.addView(v);
        }*/
        ImageView imgview;
        imgview = new ImageView(this);
        imgview.setImageResource(android.R.drawable.sym_def_app_icon);
        flipper.addView(imgview);
        imgview = new ImageView(this);
        imgview.setImageResource(android.R.drawable.ic_menu_view);
        flipper.addView(imgview);
        imgview = new ImageView(this);
        imgview.setImageResource(android.R.drawable.ic_menu_compass);
        flipper.addView(imgview);
        imgview = new ImageView(this);
        imgview.setImageResource(android.R.drawable.sym_action_email);
        flipper.addView(imgview);
        imgview = new ImageView(this);
        imgview.setImageResource(android.R.drawable.sym_call_incoming);
        flipper.addView(imgview);


        flipper.setAutoStart(true);
        flipper.setFlipInterval(1000);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
