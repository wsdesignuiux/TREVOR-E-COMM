package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Details;
import fragment.Price;

/**
 * Created by wolfsoft4 on 18/8/18.
 */

public class ProductDetailPagerAdapter extends FragmentStatePagerAdapter {
    int mnooftabs;

    public ProductDetailPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.mnooftabs = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Price tab1=new Price();
                return tab1;
            case 1:
                Price tab2=new Price();
                return tab2;
            case 2:
                Price tab3=new Price();
                return tab3;
            case 3:
                Price tab4=new Price();
                return tab4;
            case 4:
                Price tab5=new Price();
                return tab5;


            default:
                 return null;
         }
    }

    @Override
    public int getCount() {
        return mnooftabs;
    }
}
