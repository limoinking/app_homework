package com.test.news.activity;

import android.view.LayoutInflater;

import androidx.annotation.NonNull;

import com.test.news.R;
import com.test.news.base.BaseActivity;
import com.test.news.databinding.ActivityAboutBinding;

// TODO:关于 
public class AboutActivity extends BaseActivity<ActivityAboutBinding> {

    @Override
    protected void initClick() {
        super.initClick();
        getBinding().ivBack.setOnClickListener(view -> finish());
    }

    @Override
    protected int initLayout() {
        return R.layout.activity_about;
    }

    @Override
    protected ActivityAboutBinding onCreateViewBinding(@NonNull LayoutInflater layoutInflater) {
        return ActivityAboutBinding.inflate(layoutInflater);
    }
}