package com.example.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.security.Key;

public class PageFragment extends Fragment {

    private View mView;

    private static final String key = "EXTRA";

    private String title;

    public static PageFragment  newInstance(String title){
        Bundle bundle = new Bundle();
        bundle.putString(key,title);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    private TextView mTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if (bundle != null) {
            title = bundle.getString(key);
        }
        if (mView == null) {
            mView = inflater.inflate(R.layout.page, container, false);
        }
        mTextView = (TextView) mView.findViewById(R.id.text_fragment);
        mTextView.setText(title + "TAB");
        return mView;
    }

}

