package com.example.applecount;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Listener {
    private FragmentTransaction transaction;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getSupportFragmentManager();
        transaction=manager.beginTransaction();
        TotalApplesFragment totalApplesFragment=new TotalApplesFragment();
        transaction.replace(R.id.frmcontainer,totalApplesFragment,"TotalApples").addToBackStack("5").commit();
    }

    @Override
    public void click() {
        transaction=manager.beginTransaction();
        BuyApplesFragment buyApplesFragment=new BuyApplesFragment();
        transaction.replace(R.id.frmcontainer,buyApplesFragment,"BuyFragment").addToBackStack("").commit();
    }
}