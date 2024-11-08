package com.test.news.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.test.news.R;
import com.test.news.base.BaseActivity;
import com.test.news.databinding.ActivityNewsBinding;
import com.test.news.db.Collection;
import com.test.news.db.DbController;
import com.test.news.http.News;
import com.test.news.utils.Tools;

import java.util.Date;

// TODO:新闻 
public class NewsActivity extends BaseActivity<ActivityNewsBinding> {

    private DbController dbController;
    private boolean collection;
    private News.Result.Data data;
    private String title;

    @Override
    protected void initData() {
        super.initData();
        dbController = DbController.getInstance(this);
        initNews();
    }

    @Override
    protected void initClick() {
        super.initClick();
        getBinding().ivBack.setOnClickListener(view -> finish());
        getBinding().ivCollection.setOnClickListener(view -> {
            collection();
        });
    }

    private void collection() {
        collection = dbController.isExist(title);
        if (collection) {
            Toast.makeText(this, "已收藏", Toast.LENGTH_SHORT).show();
        } else {
            dbController.insertOrReplace(new Collection(title, data.getThumbnail_pic_s(),
                    data.getUrl(), Tools.customFormat(new Date(), "yyyy/MM/dd")));
            Toast.makeText(this, "收藏成功！", Toast.LENGTH_SHORT).show();
            getBinding().ivCollection.setImageResource(R.drawable.ic_collection2);
        }
    }

    @Override
    protected int initLayout() {
        return R.layout.activity_news;
    }

    @Override
    protected ActivityNewsBinding onCreateViewBinding(@NonNull LayoutInflater layoutInflater) {
        return ActivityNewsBinding.inflate(layoutInflater);
    }

    private void initNews() {
        int type = getIntent().getIntExtra("type", 0);
        if (type == 1) {
            Collection mCollection = (Collection) getIntent().getSerializableExtra("collection");
            getBinding().webView.loadUrl(mCollection.getUrl());
            title = mCollection.getTitle();
        } else {
            data = (News.Result.Data) getIntent().getSerializableExtra("news");
            getBinding().webView.loadUrl(data.getUrl());
            title = data.getTitle();
        }
        collection = dbController.isExist(title);
        if (collection) {
            getBinding().ivCollection.setImageResource(R.drawable.ic_collection2);
        }
    }
}