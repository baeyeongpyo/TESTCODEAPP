package com.example.yeongpyo.testcodeapp;

import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

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

        Flipper_Make flipper_make = new Flipper_Make(this, content_main.findViewById(R.id.viewFlipper));

        flipper_make.setImage(
                android.R.drawable.sym_action_call,
                android.R.drawable.sym_action_chat,
                android.R.drawable.sym_action_email,
                android.R.drawable.sym_call_incoming,
                android.R.drawable.sym_call_missed,
                android.R.drawable.sym_contact_card
        );
        flipper_make.setAutoFipper(true);
        flipper_make.setFlipperTime(1500);

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
