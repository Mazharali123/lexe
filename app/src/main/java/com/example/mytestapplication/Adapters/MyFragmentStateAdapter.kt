package com.example.mytestapplication.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mytestapplication.CallFragment
import com.example.mytestapplication.ChatFragment
import com.example.mytestapplication.StatusFragment

class MyFragmentStateAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return  when (position){
            0 -> ChatFragment()
            1 -> StatusFragment()
            2 -> CallFragment()
            else -> ChatFragment()
        }
    }

    override fun getItemCount(): Int {
        return  3;
    }

}