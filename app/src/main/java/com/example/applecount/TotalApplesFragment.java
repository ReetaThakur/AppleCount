package com.example.applecount;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TotalApplesFragment extends Fragment {
    private EditText totalApples;
    private TextView showApples;
    private Button go;
    private Listener listener;
    int count=10;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_total_apples, container, false);
    }

    @Override
    public void onAttach(@NonNull  Context context) {
        super.onAttach(context);
        listener= (Listener) context;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        totalApples = view.findViewById(R.id.edttotalApples);
        showApples = view.findViewById(R.id.tvshowapples);
        go = view.findViewById(R.id.btnGo);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                listener.click();

            }
        });
    }
}