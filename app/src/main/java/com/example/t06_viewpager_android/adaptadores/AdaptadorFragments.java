package com.example.t06_viewpager_android.adaptadores;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class AdaptadorFragments extends FragmentPagerAdapter {

    private ArrayList<Fragment> listaFragments;
    private String[] nombres= new String[]{"Fragment1","Fragment2", "Fragment3"};


    public AdaptadorFragments(@NonNull FragmentManager fm, int behavior, ArrayList<Fragment> listaFragments) {
        super(fm, behavior);
        this.listaFragments = listaFragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listaFragments.get(position);
    }

    @Override
    public int getCount() {
        return listaFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return nombres[position];
    }
}
