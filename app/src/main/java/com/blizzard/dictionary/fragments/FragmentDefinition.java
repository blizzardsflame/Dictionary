package com.blizzard.dictionary.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.blizzard.dictionary.R;
import com.blizzard.dictionary.WordMeaningActivity;

public class FragmentDefinition extends Fragment {
    public FragmentDefinition() {
        //Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_definition, container, false);//Inflate Layout

        Context context = getActivity();
        TextView text = (TextView) view.findViewById(R.id.textViewD);

        String en_definition = ((WordMeaningActivity) context).enDefinition;

        text.setText(en_definition);
        if (en_definition == null) {
            text.setText("No definition found");
        }


        return view;
    }
}
