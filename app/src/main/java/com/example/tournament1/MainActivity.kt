package com.example.tournament1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.calendar_c_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        months.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        days.layoutManager = GridLayoutManager(this, 7)
    }
}