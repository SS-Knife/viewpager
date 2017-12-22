package com.example.viewpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 郝书逸 on 2017/12/21.
 */

public class fragment extends Fragment {
    private ViewPager viewpager;
    private TabLayout tablayout;
    private List<Fragment> fragments;
    private String[]titles=new String[30];
    private FragAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment1, container, false);
        for (int i = 0; i < titles.length; i++) {
            int num ;
            num = i+1 ;
            titles[i] = "第"+ num +"个";
        }
        this.tablayout = (TabLayout) view.findViewById(R.id.tablayout);
        this.viewpager = (ViewPager) view.findViewById(R.id.viewpager);
        initData();
        return view;
    }
    private void initData() {

        fragments = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            fragments.add(PageFragment.newInstance(titles[i]));
        }
        adapter = new FragAdapter(getChildFragmentManager(),fragments);
        adapter.setTitles(titles);
        tablayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        viewpager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewpager);

    }

}
