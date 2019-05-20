package com.dtc.tecttalk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.dtc.tecttalk.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewpager(viewPager)
        tabMenu.setupWithViewPager(viewPager)
    }

    private fun setupViewpager(viewPager: ViewPager?) {
        val adapter = ViewPagerAdapter(supportFragmentManager).apply {
            addFragment(FoodFragment(),"Food")
            addFragment(DrinkFragment(),"Drink")
        }
        viewPager!!.adapter = adapter
    }
}

