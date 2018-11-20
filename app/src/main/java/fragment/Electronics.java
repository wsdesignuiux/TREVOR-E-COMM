package fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wolfsoft.datingapp.R;
import java.util.ArrayList;
import adapter.PromoteAdapter;
import modelclass.PromoteModel;

/**
 * Created by wolfsoft4 on 20/8/18.
 */

public class Electronics extends Fragment {


    private PromoteAdapter promoteAdapter;
    private RecyclerView recyclerview;
    private ArrayList<PromoteModel> promoteModelArrayList;

    Integer i1[]={R.drawable.ic_like_heart_outline,R.drawable.ic_like_heart_outline,R.drawable.ic_like_heart_outline,R.drawable.ic_like_heart_outline,};
    Integer i2[]={R.drawable.shoes3,R.drawable.shoes3,R.drawable.s6,R.drawable.shoes3};
    String  txtoffer[]={"75%","25%","30%","25%"};
    String  txtprice[]={"$75","$225","$210","$145"};
    String  txtcutprice[]={"$250","$250","$276","$250"};
    String  txtshoes[]={"Ninja high top sneackers","Ninja high top sneackers","Ninja high top sneackers","Ninja high top sneackers"};




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.electonics,container,false);



        recyclerview = view.findViewById(R.id.recyclerview2);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        promoteModelArrayList = new ArrayList<>();

        for (int i = 0; i < i1.length; i++) {
            PromoteModel promoteModel = new PromoteModel(i1[i],i2[i],txtoffer[i],txtprice[i],txtcutprice[i],txtshoes[i]);
            promoteModelArrayList.add(promoteModel);
        }
        promoteAdapter = new PromoteAdapter(getActivity(),promoteModelArrayList);
        recyclerview.setAdapter(promoteAdapter);
        return view;
    }

}
