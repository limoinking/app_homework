package com.test.news.http;


import okhttp3.OkHttpClient;
import okhttp3.Request;

// TODO:okhttp
public class OkHttpUtil {
    public static void sendHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
