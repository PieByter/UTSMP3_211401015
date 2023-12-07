package com.example.utsmp3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val categoryList: List<CategoryItem>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage: ImageView = itemView.findViewById(R.id.category_item_images)
        val categoryName: TextView = itemView.findViewById(R.id.category_item_list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val categoryItem = categoryList[position]

        // Set data to views
        holder.categoryImage.setImageResource(categoryItem.imageResId)
        holder.categoryName.text = categoryItem.name
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }
}