package com.dtc.tecttalk.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    var fragmentList : ArrayList<Fragment> = ArrayList()
    var titlePage: ArrayList<String> = ArrayList()

    override fun getItem(p0: Int): Fragment {
        return fragmentList[p0]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titlePage[position]
    }

    fun addFragment(fragment: Fragment, title:String){
        fragmentList.add(fragment)
        titlePage.add(title)
    }
}