package com.kkndesasendang.sendangsmartlearning.ui.learn.selectGrade;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.Grade;

import java.util.ArrayList;

public class GradeListAdapter extends RecyclerView.Adapter<GradeListAdapter.GradeListViewHolder> {
    private ArrayList<Grade> gradeList;

    public GradeListAdapter(ArrayList<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    @NonNull
    @Override
    public GradeListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grade_list, parent, false);
        return new GradeListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GradeListViewHolder holder, int position) {
        holder.bindTo(gradeList.get(position));
    }

    @Override
    public int getItemCount() {
        return gradeList.size();
    }

    public class GradeListViewHolder extends RecyclerView.ViewHolder {
        private TextView tvGradeName;

        public GradeListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvGradeName = itemView.findViewById(R.id.itemGradeName);
        }

        public void bindTo(Grade grade) {
            tvGradeName.setText(grade.getGradeName());
        }
    }
}
