package com.kkndesasendang.sendangsmartlearning.ui.rvAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kkndesasendang.sendangsmartlearning.R;

import java.util.ArrayList;

public class OptionListAdapter extends RecyclerView.Adapter<OptionListAdapter.OptionListViewHolder> {
    private ArrayList<String> optionList = new ArrayList<>();

    private OnItemClickCallback mOnItemClickCallback;

    public interface OnItemClickCallback {
        void onItemClick(String option, View view);
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        mOnItemClickCallback = onItemClickCallback;
    }

    public void updateDataset(ArrayList<String> dataset) {
        optionList = dataset;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public OptionListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_option_list, parent, false);
        return new OptionListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OptionListViewHolder holder, int position) {
        holder.bindTo(optionList.get(position));
    }

    @Override
    public int getItemCount() {
        return optionList.size();
    }

    public class OptionListViewHolder extends RecyclerView.ViewHolder {
        private TextView tvOptionList;

        public OptionListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvOptionList = itemView.findViewById(R.id.itemOptionText);
        }

        public void bindTo(final String optionText) {
            tvOptionList.setText(optionText);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String option = optionText.substring(0, 1);
                    mOnItemClickCallback.onItemClick(option, view);
                }
            });
        }
    }
}
