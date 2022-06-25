package com.example.iprism;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ViewFlipper;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    SearchView searchView;

    ViewFlipper viewFlipper;

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.searchView);
        searchView.setMaxWidth(Integer.MAX_VALUE);

        viewFlipper = findViewById(R.id.vfFirst);
        viewFlipper.setInAnimation(MainActivity.this, R.anim.slide_right);
        viewFlipper.setOutAnimation(MainActivity.this, R.anim.slide_left);
        viewFlipper.setAutoStart(true);
        viewFlipper.startFlipping();

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//        switch (item.getItemId()) {
//            case R.id.home:
//                getSupportFragmentManager().beginTransaction().replace(R.id.)
//        }
        return false;
    }
}