package com.dtc.tecttalk


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.dtc.tecttalk.adapters.AdapterPopularFood
import com.dtc.tecttalk.models.ModelFood
import kotlinx.android.synthetic.main.fragment_popular.view.*

class FoodFragment : Fragment() {

    private lateinit var mRecyclerAdapter: AdapterPopularFood

    private var foods: ArrayList<ModelFood> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_popular, container, false)

        foods.add(ModelFood("Paket 1","Bakso","Rp. 7.000",R.drawable.bakso1))
        foods.add(ModelFood("Paket 2","Bakso + Keju","Rp. 10.000",R.drawable.bakso1))
        foods.add(ModelFood("Paket 3","Bakso + Mozarella","Rp. 12.000",R.drawable.bakso1))

        val mLayoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
        view.rvPopularFood.setHasFixedSize(true)
        view.rvPopularFood.layoutManager = mLayoutManager
        mRecyclerAdapter = AdapterPopularFood(foods)
        view.rvPopularFood.adapter = mRecyclerAdapter
        return view
    }


}
