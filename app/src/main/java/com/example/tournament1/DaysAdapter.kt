package com.example.tournament1

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class viewholder : RecyclerView.ViewHolder()

class DaysAdapter(private val dataSet: List<String>, private val view_holder: RecyclerView.ViewHolder = viewholder) :
    RecyclerView.Adapter<viewholder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view_holder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: view_holder, position: Int) {
        TODO("Not yet implemented")
    }
}