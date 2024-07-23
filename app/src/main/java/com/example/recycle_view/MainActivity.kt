package com.example.recycle_view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle_view.adapter.CustomAdapter
import com.example.recycle_view.data.ItemsViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its ids
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        // this create a vertical layout manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemViewModel

        val data = ArrayList<ItemsViewModel>()

        // this loop will create 20 Views containing
        // the image with the count of view

        for (i in 1..20){
            data.add(
                ItemsViewModel(R.drawable.ic_baseline_folder_shared_24, "Item $i"),
            )
        }

        // this will pass the ArrayList to our adapter

        val adapter = CustomAdapter(data)

        // setting the Adapter with the recycleView

        recyclerView.adapter = adapter
    }
}
