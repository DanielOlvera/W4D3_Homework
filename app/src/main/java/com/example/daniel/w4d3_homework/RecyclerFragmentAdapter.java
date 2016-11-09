package com.example.daniel.w4d3_homework;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Daniel on 11/9/16.
 */

public class RecyclerFragmentAdapter extends FragmentPagerAdapter {

    final int pageCount = 3;
    private String tabTitles[] = new String[]{"RecyclerV 1", "RecyclerV 2", "RecyclerV 3"};
    private Context context;

    public RecyclerFragmentAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.context = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        return RecyclerFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }
}
