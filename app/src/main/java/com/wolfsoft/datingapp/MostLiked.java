package com.wolfsoft.datingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import adapter.MostLikedAdapter;
import modelclass.MostLikedModel;

public class MostLiked extends AppCompatActivity {

    private MostLikedAdapter mostLikedAdapter;
    private RecyclerView recyclerview;
    private ArrayList<MostLikedModel> mostLikedModelArrayList;

    Integer image1[]={R.drawable.ic_like_heart_outline,R.drawable.ic_like_heart_outline,R.drawable.ic_like_heart_outline,R.drawable.ic_like_heart_outline,};
    Integer image2[]={R.drawable.shoes3,R.drawable.shoes3,R.drawable.shoes3,R.drawable.shoes3};
    String  textoffer[]={"75%","25%","30%","25%"};
    String  textprice[]={"$75","$225","$210","$145"};
    String  textshoes[]={"Ninja high top sneackers","Ninja high top sneackers","Ninja high top sneackers","Ninja high top sneackers"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_liked);


//        recycler code is here:

        recyclerview = findViewById(R.id.recyclerview4);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(MostLiked.this, 2);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        mostLikedModelArrayList = new ArrayList<>();

        for (int i = 0; i < image1.length; i++) {
            MostLikedModel view = new MostLikedModel(image1[i], image2[i], textoffer[i], textprice[i], textshoes[i]);
            mostLikedModelArrayList.add(view);
        }

        mostLikedAdapter = new MostLikedAdapter(MostLiked.this,mostLikedModelArrayList);
        recyclerview.setAdapter(mostLikedAdapter);

    }

}
