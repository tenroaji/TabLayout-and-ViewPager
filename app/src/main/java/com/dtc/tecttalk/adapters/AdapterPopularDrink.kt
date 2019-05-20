package com.dtc.tecttalk.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dtc.tecttalk.R
import com.dtc.tecttalk.models.ModelDrink
import kotlinx.android.synthetic.main.view_popular_drink.view.*


class AdapterPopularDrink(private val data: ArrayList<ModelDrink>): RecyclerView.Adapter<AdapterPopularDrink.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val mView   = LayoutInflater.from(parent.context).inflate(R.layout.view_popular_drink, parent, false)
        return MyViewHolder(mView)
    }

    override fun getItemCount(): Int {
        return data!!.size
    }

    override fun onBindViewHolder(parent: MyViewHolder, i: Int) {
        parent.itemView.tvNameDrink.text = data[i].drinkName
        parent.itemView.tvDescription.text = data[i].description
        parent.itemView.tvPrice.text = data[i].price
        parent.itemView.img.setImageResource(data[i].image)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}