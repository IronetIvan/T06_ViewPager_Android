package com.example.t06_viewpager_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
    }

    private void instancias() {
        toolbar = findViewById(R.id.toolbar);
        viewpager = findViewById(R.id.viewpager);
        setSupportActionBar(toolbar);
    }
}
