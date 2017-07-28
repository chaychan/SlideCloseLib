package com.chaychan.slidecloselib;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends BaseActivity {

    private String[] mTitles = new String[]{
            "消息",
            "好友",
            "动态"
    };

    private List<ContentFragment> mFragments = new ArrayList<>();
    private TabLayout mTabLayout;
    private ViewPager mVpContent;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_view_pager);

        mTabLayout = (TabLayout) findViewById(R.id.tab);
        mVpContent = (ViewPager) findViewById(R.id.vp_content);
    }

    @Override
    protected void initData() {
        initFragments();
    }

    @Override
    public void initListener() {
        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager(), mFragments, mTitles);
        mVpContent.setAdapter(tabAdapter);
        mTabLayout.setupWithViewPager(mVpContent);
    }

    private void initFragments() {
        ContentFragment fragment1 = new ContentFragment();
        Bundle bundle1 = new Bundle();
        bundle1.putString(ContentFragment.TEXT,mTitles[0]);
        fragment1.setArguments(bundle1);

        ContentFragment fragment2 = new ContentFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString(ContentFragment.TEXT,mTitles[1]);
        fragment2.setArguments(bundle2);

        ContentFragment fragment3 = new ContentFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putString(ContentFragment.TEXT,mTitles[2]);
        fragment3.setArguments(bundle3);

        mFragments.add(fragment1);
        mFragments.add(fragment2);
        mFragments.add(fragment3);
    }
}
