package com.smartherd.recyclerviewdemo.adapters

import android.content.Context
import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView
import com.smartherd.recyclerviewdemo.R
import com.smartherd.recyclerviewdemo.models.RetrofitModel

class SwipeAdapter(val context: Context, private var userDetailsList:ArrayList<String>): RecyclerView.Adapter<SwipeAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SwipeAdapter.MyHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.singlerow_2,parent,false)
        return SwipeAdapter.MyHolder(v)
    }

    override fun onBindViewHolder(holder: SwipeAdapter.MyHolder, position: Int) {
        holder.IdTxt.text     =  userDetailsList[position]
    }

    override fun getItemCount(): Int {
        return  userDetailsList.size
    }

    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var IdTxt     = itemView.findViewById<MaterialTextView>(R.id.mtid)!!

    }
}