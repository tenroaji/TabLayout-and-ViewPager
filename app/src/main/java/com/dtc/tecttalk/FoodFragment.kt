package com.dtc.tecttalk


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.fragment_popular.view.*

class FoodFragment : Fragment() {

    private lateinit var mRecyclerAdapter: AdapterPopularFood

    private var foods: ArrayList<String> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_popular, container, false)

        foods.add("tes1")
        foods.add("tes2")
        foods.add("tes3")
        foods.add("tes4")

        val mLayoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
        view.rvPopularFood.setHasFixedSize(true)
        view.rvPopularFood.layoutManager = mLayoutManager
        mRecyclerAdapter = AdapterPopularFood(foods)
        view.rvPopularFood.adapter = mRecyclerAdapter
        return view
    }


}
