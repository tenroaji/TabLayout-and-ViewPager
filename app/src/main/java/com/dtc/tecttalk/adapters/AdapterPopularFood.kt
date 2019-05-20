package com.dtc.tecttalk.adapters

import android.content.Context
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dtc.tecttalk.R
import com.dtc.tecttalk.models.ModelFood
import kotlinx.android.synthetic.main.view_popular_food.view.*

class AdapterPopularFood(private val data: ArrayList<ModelFood>): RecyclerView.Adapter<AdapterPopularFood.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val mView   = LayoutInflater.from(parent.context).inflate(R.layout.view_popular_food, parent, false)
        return MyViewHolder(mView)
    }

    override fun getItemCount(): Int {
        return data?.size
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(parent: MyViewHolder, i: Int) {
        parent.itemView.tvNameFood.text = data[i].foodName
        parent.itemView.tvDescription.text = data[i].description
        parent.itemView.tvPrice.text = data[i].price
        parent.itemView.img.setImageResource(data[i].image)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}