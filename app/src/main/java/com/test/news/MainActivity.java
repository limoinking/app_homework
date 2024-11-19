package com.test.news;

import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.test.news.activity.NewsActivity;
import com.test.news.activity.SettingActivity;
import com.test.news.adapter.NewSAdapter;
import com.test.news.base.BaseActivity;
import com.test.news.databinding.ActivityMainBinding;
import com.test.news.http.News;
import com.test.news.http.OkHttpUtil;
import com.test.news.utils.Constants;
import com.test.news.utils.Tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

// TODO:主界面
public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    protected void initData() {
        super.initData();
        sendRequest("top");
        initLocalData();//次数用完可请求本地json数据
    }

    private void initLocalData() {
        String json = Tools.getJson(this);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        News news = gson.fromJson(json, News.class);
        if (news.getResult() != null) {
            newList.clear();
            newList.addAll(news.getResult().getData());
            handler.sendEmptyMessage(1);
        }
    }

    @Override
    protected void initClick() {
        super.initClick();
        getBinding().tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        sendRequest("top");
                        break;
                    case 1:
                        sendRequest("keji");
                        break;
                    case 2:
                        sendRequest("jiankang");
                        break;
                    case 3:
                        sendRequest("caijing");
                        break;
                    case 4:
                        sendRequest("yule");
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        getBinding().ivSetting.setOnClickListener(view ->
                startActivity(new Intent(this, SettingActivity.class)));
    }

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected ActivityMainBinding onCreateViewBinding(@NonNull LayoutInflater layoutInflater) {
        return ActivityMainBinding.inflate(layoutInflater);
    }

    private void sendRequest(String type) {

        OkHttpUtil.sendHttpRequest(Constants.JUHE_URL + "?type=" + type + "&key=" + Constants.JUHE_KEY + "&page=" + 3, new Callback() {
            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                if (response.isSuccessful()) {
                    String responseBody = response.body().string();

                    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
                    News news = gson.fromJson(responseBody, News.class);

                    if (news.getReason().contains("超过每日可允许请求次数!")) {
                        handler.sendEmptyMessage(0);
                        return;
                    }
                    if (news.getResult() != null) {
                        newList.clear();
                        newList.addAll(news.getResult().getData());
                        newList.addAll(news.getResult().getData());
                        newList.addAll(news.getResult().getData());
                        newList.addAll(news.getResult().getData());
                        newList.addAll(news.getResult().getData());
                        newList.addAll(news.getResult().getData());
                        newList.addAll(news.getResult().getData());
                        newList.addAll(news.getResult().getData());
                        handler.sendEmptyMessage(1);
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                e.printStackTrace();
            }
        });
    }


    List<News.Result.Data> newList = new ArrayList<>();
    private NewSAdapter newSAdapter;

    private void initAdapter() {

        if (newSAdapter == null) {
            newSAdapter = new NewSAdapter(this, newList);
            getBinding().rvData.setLayoutManager(new LinearLayoutManager(this,
                    LinearLayoutManager.VERTICAL, false));
            getBinding().rvData.setAdapter(newSAdapter);
        } else {
            newSAdapter.setList(newList);
            newSAdapter.notifyDataSetChanged();
        }

        newSAdapter.setListener(pos -> {
            Intent intent = new Intent(this, NewsActivity.class);
            intent.putExtra("news", newList.get(pos));
            startActivity(intent);
        });
    }

    Handler handler = new Handler(msg -> {
        switch (msg.what) {
            case 0:
                Toast.makeText(this, "超过每日可允许请求次数!", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                initAdapter();
                break;
        }
        return false;
    });

}