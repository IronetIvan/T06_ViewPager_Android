package com.example.t06_viewpager_android.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.t06_viewpager_android.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTres extends Fragment {


    public FragmentTres() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tres, container, false);
    }

}
