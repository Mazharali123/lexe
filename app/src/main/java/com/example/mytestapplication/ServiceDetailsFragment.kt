package com.example.mytestapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytestapplication.Adapters.MyFragmentStateAdapter
import com.example.mytestapplication.databinding.FragmentServiceDetailsBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class ServiceDetailsFragment : Fragment() {

    private var _binding: FragmentServiceDetailsBinding? = null;
    private val binding get() = _binding!!;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentServiceDetailsBinding.inflate(inflater, container, false)

        val tab_layout = binding.tabLayout
        val myAdapter = MyFragmentStateAdapter(requireActivity())
        binding.pager.adapter = myAdapter

        TabLayoutMediator(tab_layout, binding.pager) { tab: TabLayout.Tab, position: Int ->
            when (position) {
                0 -> {
                    tab.text = "Chats"
                    tab.setIcon(R.drawable.menu)
                }

                1 -> {
                    tab.text = "Status"
                    tab.setIcon(R.drawable.star_)
                }

                2 -> {
                    tab.text = "Calls"
                    tab.setIcon(R.drawable.baseline_phone)
                }
            }
        }.attach()


        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null;
    }
}