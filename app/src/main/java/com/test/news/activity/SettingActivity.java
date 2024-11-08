package com.test.news.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.test.news.R;
import com.test.news.base.BaseActivity;
import com.test.news.databinding.ActivitySettingBinding;

// TODO:设置
public class SettingActivity extends BaseActivity<ActivitySettingBinding> implements View.OnClickListener {

    @Override
    protected void initClick() {
        super.initClick();
        getBinding().ivBack.setOnClickListener(this);
        getBinding().rlAbout.setOnClickListener(this);
        getBinding().rlMain.setOnClickListener(this);
        getBinding().rlCollection.setOnClickListener(this);
    }

    @Override
    protected int initLayout() {
        return R.layout.activity_setting;
    }

    @Override
    protected ActivitySettingBinding onCreateViewBinding(@NonNull LayoutInflater layoutInflater) {
        return ActivitySettingBinding.inflate(layoutInflater);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
            case R.id.rl_main:
                finish();
                break;
            case R.id.rl_about:
                startActivity(new Intent(SettingActivity.this, AboutActivity.class));
                break;
            case R.id.rl_collection:
                startActivity(new Intent(SettingActivity.this, CollectionActivity.class));
                break;
        }
    }
}