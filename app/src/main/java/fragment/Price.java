package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.viewpagerindicator.LinePageIndicator;
import com.wolfsoft.datingapp.R;

import java.util.ArrayList;

import adapter.FromCategoryAdapter;
import adapter.ShoesPagerAdapter;
import modelclass.FRomCategoryModel;

/**
 * Created by wolfsoft4 on 18/8/18.
 */

public class Price extends Fragment {
    private ViewPager viewPager;
    private LinePageIndicator indicator;

    private ShoesPagerAdapter shoesPagerAdapter;


    private FromCategoryAdapter fromCategoryAdapter;
    private RecyclerView recyclerview;
    private ArrayList<FRomCategoryModel> fRomCategoryModelArrayList;

    Integer img1[]={R.drawable.ic_like_heart_outline,R.drawable.ic_like_heart_outline,R.drawable.ic_like_heart_outline,R.drawable.ic_like_heart_outline,};
    Integer img2[]={R.drawable.shoes,R.drawable.shoes2,R.drawable.shoes,R.drawable.shoes2};
    String  offer[]={"75%","25%","30%","25%"};
    String  price[]={"$75","$225","$210","$145"};
    String  shoes[]={"Ninja high top sneackers","Ninja high top sneackers","Ninja high top sneackers","Ninja high top sneackers"};





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.price,container,false);


        viewPager = (ViewPager) view.findViewById(R.id.viewpager);

        LinePageIndicator indicator = (LinePageIndicator) view.findViewById(R.id.indicator);

        shoesPagerAdapter = new ShoesPagerAdapter(getChildFragmentManager());

        viewPager.setAdapter(shoesPagerAdapter);

        indicator.setViewPager(viewPager);

        //shoesPagerAdapter.registerDataSetObserver(indicator.getDataSetObserver());



//        recyclerview code is here

        recyclerview = view.findViewById(R.id.recyclerview3);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        fRomCategoryModelArrayList = new ArrayList<>();

        for (int i = 0; i < img1.length; i++) {
            FRomCategoryModel view1 = new FRomCategoryModel(img1[i],img2[i],offer[i],price[i],shoes[i]);
            fRomCategoryModelArrayList.add(view1);
        }
        fromCategoryAdapter = new FromCategoryAdapter(getActivity(),fRomCategoryModelArrayList);
        recyclerview.setAdapter(fromCategoryAdapter);




        return view;
    }
}
