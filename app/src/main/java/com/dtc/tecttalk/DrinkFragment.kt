package com.dtc.tecttalk


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.dtc.tecttalk.adapters.AdapterPopularDrink
import com.dtc.tecttalk.models.ModelDrink
import kotlinx.android.synthetic.main.fragment_popular.view.*

class DrinkFragment : Fragment() {

    private lateinit var mRecyclerAdapter: AdapterPopularDrink

    private var drinks: ArrayList<ModelDrink> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_popular, container, false)

        drinks.add(ModelDrink("Jus Naga","Buah Naga","Rp. 10.000",R.drawable.drink))
        drinks.add(ModelDrink("Jus Naga","Buah Naga","Rp. 10.000",R.drawable.drink))
        drinks.add(ModelDrink("Jus Naga","Buah Naga","Rp. 10.000",R.drawable.drink))
        drinks.add(ModelDrink("Jus Naga","Buah Naga","Rp. 10.000",R.drawable.drink))
        drinks.add(ModelDrink("Jus Naga","Buah Naga","Rp. 10.000",R.drawable.drink))
        drinks.add(ModelDrink("Jus Naga","Buah Naga","Rp. 10.000",R.drawable.drink))

        val mLayoutManager = GridLayoutManager(activity, 2)
        view.rvPopularFood.setHasFixedSize(true)
        view.rvPopularFood.layoutManager = mLayoutManager
        mRecyclerAdapter = AdapterPopularDrink(drinks)
        view.rvPopularFood.adapter = mRecyclerAdapter
        return view
    }


}
