package com.example.t06_viewpager_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.t06_viewpager_android.adaptadores.AdaptadorFragments;
import com.example.t06_viewpager_android.fragments.FragmentDos;
import com.example.t06_viewpager_android.fragments.FragmentTres;
import com.example.t06_viewpager_android.fragments.FragmentUno;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager viewpager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        rellenarPager();
    }

    private void rellenarPager() {
        ArrayList<Fragment> lista = new ArrayList<>();
        lista.add(new FragmentUno());
        lista.add(new FragmentDos());
        lista.add(new FragmentTres());
        AdaptadorFragments adaptadorFragments = new AdaptadorFragments(getSupportFragmentManager(),0,lista);

        viewpager.setAdapter(adaptadorFragments);
    }

    private void instancias() {
        toolbar = findViewById(R.id.toolbar);
        viewpager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabLayout);
        setSupportActionBar(toolbar);
        tabLayout.setupWithViewPager(viewpager);

    }
}
