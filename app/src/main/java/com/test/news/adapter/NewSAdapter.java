package com.test.news.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.test.news.R;
import com.test.news.http.News;
import com.test.news.utils.Tools;

import java.util.ArrayList;
import java.util.List;

// TODO:新闻适配器
public class NewSAdapter extends RecyclerView.Adapter<NewSAdapter.ViewHolder> {

    private final Context context;
    private List<News.Result.Data> dataList = new ArrayList<>();

    public NewSAdapter(Context context, List<News.Result.Data> newList) {
        this.context = context;
        this.dataList = newList;
    }

    public void setList(List<News.Result.Data> newList) {
        this.dataList = newList;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        News.Result.Data aNew = dataList.get(position);

        String img1=aNew.getThumbnail_pic_s();
        String img2=aNew.getThumbnail_pic_s02();
        String img3=aNew.getThumbnail_pic_s03();

        if (!TextUtils.isEmpty(img1)){
            Glide.with(context).load(img1).into(holder.ivIcon);
        }else {
            holder.ivIcon.setImageResource(R.drawable.ic_new);
        }

        holder.tvTitle.setText(aNew.getTitle());
        holder.tvAuthor.setText(aNew.getAuthor_name());
        holder.tvTime.setText(Tools.customFormat(aNew.getDate(), "yyyy/MM/dd"));

        holder.rlMain.setOnClickListener(v -> {
            if (listener!=null){
                listener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final RelativeLayout rlMain;
        private final ShapeableImageView ivIcon;
        private final TextView tvTitle;
        private final TextView tvAuthor;
        private final TextView tvTime;

        public ViewHolder(View itemView) {
            super(itemView);
            rlMain = itemView.findViewById(R.id.rl_main);
            ivIcon = itemView.findViewById(R.id.iv_pic);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvTime = itemView.findViewById(R.id.tv_time);
            tvAuthor=itemView.findViewById(R.id.tv_author);
        }
    }

    private OnClickListener listener;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    public interface OnClickListener {
        void onClick(int pos);
    }

}
