package com.kkndesasendang.sendangsmartlearning.ui.rvAdapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.RankingModel;

import java.util.ArrayList;
import java.util.Locale;

public class RankingListAdapter extends RecyclerView.Adapter<RankingListAdapter.RankingListViewHolder> {
    private ArrayList<RankingModel> rankingList = new ArrayList<>();

    public void updateDataset(ArrayList<RankingModel> dataset) {
        rankingList = dataset;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RankingListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_generic_list, parent, false);
        return new RankingListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RankingListViewHolder holder, int position) {
        holder.bindTo(rankingList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return rankingList.size();
    }

    public static class RankingListViewHolder extends RecyclerView.ViewHolder {
        private TextView rankingText;

        public RankingListViewHolder(@NonNull View itemView) {
            super(itemView);
            rankingText = itemView.findViewById(R.id.listItemText);
        }

        public void bindTo(RankingModel ranking, int position) {
            rankingText.setText(String.format(Locale.getDefault(), "Ranking %d: %s - %d poin", position + 1, ranking.getParticipantName(), ranking.getParticipantScore()));
        }
    }
}
