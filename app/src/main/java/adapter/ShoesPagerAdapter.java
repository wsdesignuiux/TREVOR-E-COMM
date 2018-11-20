package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import fragment.Shoes_Four;
import fragment.Shoes_One;
import fragment.Shoes_Three;
import fragment.Shoes_Two;

/**
 * Created by wolfsoft on 10/11/2015.
 */
public class ShoesPagerAdapter extends FragmentStatePagerAdapter {



    public ShoesPagerAdapter(FragmentManager fm) {
        super(fm);

    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Shoes_One tab1 = new Shoes_One();
                return tab1;

            case 1:
                Shoes_Two tab6 = new Shoes_Two();
                return tab6;


            case 2:
                Shoes_Three tab2 = new Shoes_Three();
                return tab2;

            case 3:
                Shoes_Four tab3 = new Shoes_Four();
                return tab3;



            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}