package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import fragment.Electronics;

/**
 * Created by wolfsoft4 on 21/8/18.
 */

public class TablayoutPromoteAdapter extends FragmentStatePagerAdapter {
    int mnooftabs;


    public TablayoutPromoteAdapter(FragmentManager fm, int tabcount) {
        super(fm);
        this.mnooftabs = tabcount;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Electronics tab1=new Electronics();
                return tab1;
            case 1:
                Electronics tab2=new Electronics();
                return tab2;
            case 2:
                Electronics tab3=new Electronics();
                return tab3;
            case 3:
                Electronics tab4=new Electronics();
                return tab4;




        default:
        return null;
    }

    }

    @Override
    public int getCount() {
        return mnooftabs;
    }
}
