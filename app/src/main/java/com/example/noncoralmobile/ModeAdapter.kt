package com.example.noncoralmobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ModeAdapter(private val modeList:ArrayList<Modes>)
    : RecyclerView.Adapter<ModeAdapter.ModeViewHolder>(){
        class ModeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            val nameView : TextView = itemView.findViewById(R.id.name)
            val startView : TextView = itemView.findViewById(R.id.start)
            val stopView : TextView = itemView.findViewById(R.id.stop)
            val chView : TextView = itemView.findViewById(R.id.ch)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ModeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ModeViewHolder, position: Int) {
        val mode = modeList[position]
        holder.nameView.text = mode.name
        holder.startView.text = mode.start
        holder.stopView.text = mode.stop
        holder.chView.text = mode.ch
    }

    override fun getItemCount(): Int {
        return modeList.size
    }
}