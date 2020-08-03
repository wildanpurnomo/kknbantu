package com.kkndesasendang.sendangsmartlearning.ui.learn.selectMaterial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kkndesasendang.sendangsmartlearning.R;
import com.kkndesasendang.sendangsmartlearning.model.MaterialModel;

import java.util.ArrayList;

public class MaterialListAdapter extends RecyclerView.Adapter<MaterialListAdapter.MaterialListViewHolder> {
    private ArrayList<MaterialModel> materialModelList = new ArrayList<>();

    private OnItemClickCallback mOnItemClickCallback;

    interface OnItemClickCallback {
        void onItemClick(MaterialModel data, View view);
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        mOnItemClickCallback = onItemClickCallback;
    }

    public void updateDataset(ArrayList<MaterialModel> dataset) {
        materialModelList = dataset;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MaterialListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_material_list, parent, false);
        return new MaterialListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MaterialListViewHolder holder, int position) {
        holder.bindTo(materialModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return materialModelList.size();
    }

    public class MaterialListViewHolder extends RecyclerView.ViewHolder {
        private TextView tvMaterialList;

        public MaterialListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMaterialList = itemView.findViewById(R.id.itemMaterialName);
        }

        public void bindTo(final MaterialModel materialModel) {
            tvMaterialList.setText(materialModel.getMaterialName());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mOnItemClickCallback.onItemClick(materialModel, view);
                }
            });
        }
    }
}
