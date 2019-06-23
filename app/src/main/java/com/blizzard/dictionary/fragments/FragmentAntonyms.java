package com.blizzard.dictionary.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blizzard.dictionary.R;

public class FragmentAntonyms extends Fragment {
    public FragmentAntonyms() {
        //Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_definition, container, false);//Inflate Layout

        return view;
    }
}
