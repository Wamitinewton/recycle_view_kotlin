package com.example.recycle_view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle_view.R
import com.example.recycle_view.data.ItemsViewModel

class CustomAdapter(private val mList: List<ItemsViewModel>):
RecyclerView.Adapter<CustomAdapter.ViewHolder>()
{
    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card view design
        // that is used to hold the list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        //sets the image to the imageView from our itemHolder class

        holder.imageView.setImageResource(ItemsViewModel.image)

        // sets the text to the textView from our itemHolder class
        holder.textView.text = ItemsViewModel.text
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}