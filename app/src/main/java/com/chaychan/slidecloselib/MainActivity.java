package com.chaychan.slidecloselib;

import android.content.Intent;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void initView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initData() {

    }

    @Override
    public boolean enableSlideClose() {
        return false;
    }

    public void open(View view){
        Intent intent = new Intent(this, NormalActivity.class);
        startActivity(intent);
    }
}
