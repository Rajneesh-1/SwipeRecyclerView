package com.smartherd.recyclerviewdemo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView
import com.smartherd.recyclerviewdemo.R
import com.smartherd.recyclerviewdemo.models.RetrofitModel

//class RetrofitAdapter(val context: Context, private var userDetailsList:MutableList<RetrofitModel>): RecyclerView.Adapter<RetrofitAdapter.MyHolder>(){


    /*override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.singlerow,parent,false)
        return MyHolder(v)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.IdTxt.text     =  userDetailsList[position].id.toString()
        holder.userIdTxt.text =  userDetailsList[position].userId.toString()
        holder.titleTxt.text  =  userDetailsList[position].title
        holder.bodyTxt.text   =  userDetailsList[position].body

    }

    override fun getItemCount(): Int {
        return  userDetailsList.size
    }

    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        zvar userIdTxt = itemView.findViewById<MaterialTextView>(R.id.mtuserid)!!
        var IdTxt     = itemView.findViewById<MaterialTextView>(R.id.mtid)!!
        var titleTxt  = itemView.findViewById<MaterialTextView>(R.id.mttitle)!!
        var bodyTxt   = itemView.findViewById<MaterialTextView>(R.id.mtbody)!!

    }*/
//}