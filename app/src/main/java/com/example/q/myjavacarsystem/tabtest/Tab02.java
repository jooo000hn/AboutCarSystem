package com.example.q.myjavacarsystem.tabtest;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.q.myjavacarsystem.R;

import androidx.fragment.app.Fragment;


public class Tab02 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        return inflater.inflate(R.layout.tabtest_02, container, false);
    }
}