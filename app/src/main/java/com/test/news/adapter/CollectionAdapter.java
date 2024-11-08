package com.test.news.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.test.news.R;
import com.test.news.db.Collection;
import com.test.news.http.News;
import com.test.news.utils.Tools;

import java.util.ArrayList;
import java.util.List;

// TODO:收藏适配器
public class CollectionAdapter extends RecyclerView.Adapter<CollectionAdapter.ViewHolder> {

    private final Context context;
    private List<Collection> dataList = new ArrayList<>();

    public CollectionAdapter(Context context, List<Collection> newList) {
        this.context = context;
        this.dataList = newList;
    }

    public void setList(List<Collection> newList) {
        this.dataList = newList;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_collection, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        Collection collection = dataList.get(position);

        String img1=collection.getPic();
        if (!TextUtils.isEmpty(img1)){
            Glide.with(context).load(img1).into(holder.ivIcon);
        }else {
            holder.ivIcon.setImageResource(R.drawable.ic_new);
        }

        holder.tvTitle.setText(collection.getTitle());
        holder.tvTime.setText(collection.getDate());

        holder.ivDelete.setOnClickListener(v -> {
            if (listener!=null){
                listener.onDelete(position);
            }
        });

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
        private final TextView tvTime;
        private final ImageView ivDelete;

        public ViewHolder(View itemView) {
            super(itemView);
            rlMain = itemView.findViewById(R.id.rl_main);
            ivIcon = itemView.findViewById(R.id.iv_pic);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvTime = itemView.findViewById(R.id.tv_time);
            ivDelete=itemView.findViewById(R.id.iv_delete);
        }
    }

    private OnClickListener listener;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    public interface OnClickListener {
        void onClick(int pos);
        void onDelete(int pos);
    }

}
