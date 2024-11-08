package com.test.news.activity;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.test.news.R;
import com.test.news.adapter.CollectionAdapter;
import com.test.news.adapter.NewSAdapter;
import com.test.news.base.BaseActivity;
import com.test.news.databinding.ActivityCollectionBinding;
import com.test.news.db.Collection;
import com.test.news.db.DbController;

import java.util.ArrayList;
import java.util.List;

// TODO:收藏
public class CollectionActivity extends BaseActivity<ActivityCollectionBinding> {

    private DbController dbController;
    private List<Collection> dataList = new ArrayList<>();
    private CollectionAdapter adapter;

    @Override
    protected void initData() {
        super.initData();
        dbController = DbController.getInstance(this);
        initAdapter();
    }

    @Override
    protected void initClick() {
        super.initClick();
        getBinding().ivBack.setOnClickListener(view -> finish());
    }

    @Override
    protected int initLayout() {
        return R.layout.activity_collection;
    }

    @Override
    protected ActivityCollectionBinding onCreateViewBinding(@NonNull LayoutInflater layoutInflater) {
        return ActivityCollectionBinding.inflate(layoutInflater);
    }

    private void initAdapter() {
        dataList = dbController.searchAll();
        if (dataList.size() > 0) {
            getBinding().tvShow.setVisibility(View.GONE);
        } else {
            getBinding().tvShow.setVisibility(View.VISIBLE);
        }
        if (adapter == null) {
            adapter = new CollectionAdapter(this, dataList);
            getBinding().rvData.setLayoutManager(new LinearLayoutManager(this,
                    LinearLayoutManager.VERTICAL, false));
            getBinding().rvData.setAdapter(adapter);
        } else {
            adapter.setList(dataList);
            adapter.notifyDataSetChanged();
        }

        adapter.setListener(new CollectionAdapter.OnClickListener() {
            @Override
            public void onClick(int pos) {
                Intent intent = new Intent(CollectionActivity.this, NewsActivity.class);
                intent.putExtra("collection", dataList.get(pos));
                intent.putExtra("type", 1);
                startActivity(intent);
            }

            @Override
            public void onDelete(int pos) {
                dbController.delete(dataList.get(pos).getTitle());
                initAdapter();
                Toast.makeText(CollectionActivity.this, "删除成功", Toast.LENGTH_SHORT).show();
            }
        });
    }
}