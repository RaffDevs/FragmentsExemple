package com.example.fragments.adataper

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragments.FirstFragment
import com.example.fragments.SecondFragment

class TabsAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        print(position)
        return when(position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> throw Error()
        }
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

}