package com.example.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by 郝书逸 on 2017/12/21.
 */

public class FragAdapter extends FragmentPagerAdapter {
    private String[] titles;
    private List<Fragment> Fragments;
    public FragAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        Fragments=fragments;
    }
    public void setTitles(String[] titles) {
        this.titles = titles;
    }
    @Override
    public Fragment getItem(int position) {
        return Fragments.get(position);
    }

    @Override
    public int getCount() {
        return Fragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
   /* @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Fragment fragment ;
        fragment = (Fragment) super.instantiateItem(container,position);
        return fragment;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }*/

}