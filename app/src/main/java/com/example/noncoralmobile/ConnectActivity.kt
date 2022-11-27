package com.example.noncoralmobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ConnectActivity: AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var modeList : ArrayList<Modes>
    private lateinit var modeAdapter: ModeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        modeList = ArrayList()
        modeList.add(Modes("test5", "10:00 am", "5:00 pm", "All"))
        modeList.add(Modes("test2", "11:00 am", "1:00 pm", "A"))
        modeList.add(Modes("test3", "11:00 am", "1:00 pm", "A"))

        modeAdapter = ModeAdapter(modeList)
        recyclerView.adapter = modeAdapter
    }
}