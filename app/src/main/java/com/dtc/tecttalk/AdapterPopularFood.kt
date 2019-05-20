package com.dtc.tecttalk

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_popular_food.view.*

/**
 * Created by Sainal on 5/15/2019.
 */

class AdapterPopularFood(private val data: ArrayList<String>): RecyclerView.Adapter<AdapterPopularFood.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val mView   = LayoutInflater.from(parent.context).inflate(R.layout.view_popular_food, parent, false)
        return MyViewHolder(mView)
    }

    override fun getItemCount(): Int {
        return data!!.size
    }

    override fun onBindViewHolder(parent: MyViewHolder, i: Int) {
        parent.itemView.tvName.text = data[i]
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}