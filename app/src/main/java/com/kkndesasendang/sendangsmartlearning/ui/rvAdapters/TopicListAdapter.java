package com.kkndesasendang.sendangsmartlearning.ui.rvAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.GamaselaTopicModel;

import java.util.ArrayList;

public class TopicListAdapter extends RecyclerView.Adapter<TopicListAdapter.TopicListViewHolder> {
    private ArrayList<GamaselaTopicModel> topics = new ArrayList<>();

    private OnItemClickCallback mOnItemClickCallback;

    public interface OnItemClickCallback {
        void onItemClick(GamaselaTopicModel data, View view);
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        mOnItemClickCallback = onItemClickCallback;
    }

    public void updateDataset(ArrayList<GamaselaTopicModel> dataset) {
        topics = dataset;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TopicListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_generic_list, parent, false);
        return new TopicListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicListViewHolder holder, int position) {
        holder.bindTo(topics.get(position));
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }

    public class TopicListViewHolder extends RecyclerView.ViewHolder {
        private TextView tvMaterialList;

        public TopicListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMaterialList = itemView.findViewById(R.id.listItemText);
        }

        public void bindTo(final GamaselaTopicModel topic) {
            tvMaterialList.setText(topic.getTopicName());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mOnItemClickCallback.onItemClick(topic, view);
                }
            });
        }
    }
}
