package com.wolfsoft.datingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import com.wolfsoft.datingapp.R;

import java.util.ArrayList;

import adapter.Home_Adapter;
import modelclass.Home_Model;

public class HomeActivity extends AppCompatActivity {

    Integer[] hert = {R.drawable.ic_like_heart_outline,R.drawable.ic_like_heart_outline};
    Integer[] imageshose = {R.drawable.shoes3,R.drawable.shoes3};

    String[] discount = {"25%","10%"};
    String[] text1 = {"$120","$150"};

    private RecyclerView recyclerView;
    private Home_Adapter home_adapter;
    private ArrayList<Home_Model> home_model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );

//        recyclerview code:

        recyclerView = findViewById(R.id.recycle);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomeActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        home_model = new  ArrayList<>();

        for (int i=0;i < hert.length;i++) {
            Home_Model ab = new Home_Model(hert[i],imageshose[i],discount[i],text1[i]);
            home_model.add(ab);
        }

        home_adapter = new Home_Adapter(HomeActivity.this,home_model);
        recyclerView.setAdapter(home_adapter);
    }
}
