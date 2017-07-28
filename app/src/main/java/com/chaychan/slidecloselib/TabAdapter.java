package com.chaychan.slidecloselib;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author ChayChan
 * @date 2017/7/28  20:40
 */

public class TabAdapter extends FragmentPagerAdapter {

    private List<ContentFragment> mFragments;
    private String[] mTitles;

    public TabAdapter(FragmentManager fm, List<ContentFragment> fragments,String[] titles) {
        super(fm);
        mFragments = fragments;
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
