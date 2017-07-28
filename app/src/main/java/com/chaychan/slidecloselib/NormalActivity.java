package com.chaychan.slidecloselib;

import android.content.Intent;
import android.view.View;

public class NormalActivity extends BaseActivity {

    @Override
    protected void initView() {
        setContentView(R.layout.activity_normal);
    }

    @Override
    protected void initData() {

    }

    public void open(View view){
        Intent intent = new Intent(this, ViewPagerActivity.class);
        startActivity(intent);
    }
}
