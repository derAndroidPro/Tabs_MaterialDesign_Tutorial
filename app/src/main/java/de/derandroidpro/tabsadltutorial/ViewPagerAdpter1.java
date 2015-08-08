package de.derandroidpro.tabsadltutorial;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdpter1 extends FragmentPagerAdapter{

    String[] tabtitlearray = {"Erster Tab", "Zweiter Tab"};

    public ViewPagerAdpter1 (FragmentManager manager){

        super(manager);
    }


    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0: return new Fragment1();
            case 1: return new Fragment2();
        }


        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabtitlearray[position];
    }
}
