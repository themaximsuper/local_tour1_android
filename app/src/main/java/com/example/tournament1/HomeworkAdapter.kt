package com.example.tournament1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.homework_item.view.*

class HomeworkViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

class HomeworkAdapter (val tasks: List<Task>) : RecyclerView.Adapter<HomeworkViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeworkViewHolder {
        return HomeworkViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.homework_item, parent, false))
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: HomeworkViewHolder, position: Int) {
        holder.itemView.tesk_text.text = tasks[position].title
    }
}