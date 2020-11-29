package com.kkndesasendang.sendangsmartlearning.ui.rvAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kkndesasendang.sendangsmartlearning.R
import com.kkndesasendang.sendangsmartlearning.model.GamaselaMaterialModel
import kotlinx.android.synthetic.main.item_generic_list.view.*

class MaterialListAdapter(): RecyclerView.Adapter<MaterialListAdapter.MaterialListViewHolder>() {
    private var topics: Array<out GamaselaMaterialModel> = emptyArray()

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClick(topic: GamaselaMaterialModel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MaterialListAdapter.MaterialListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_generic_list, parent, false)
        return MaterialListViewHolder(view)
    }

    override fun onBindViewHolder(holder: MaterialListAdapter.MaterialListViewHolder, position: Int) {
        holder.bind(topics[position])
    }

    override fun getItemCount(): Int {
        return topics.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    fun updateDataset(topics: Array<out GamaselaMaterialModel>) {
        this.topics = topics
        notifyDataSetChanged()
    }

    inner class MaterialListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: GamaselaMaterialModel) {
            itemView.listItemText.text = item.materialName
            itemView.setOnClickListener { onItemClickCallback.onItemClick(item)}
        }
    }
}