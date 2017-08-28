package com.abraham24.nearbyplacemvpkotlinrxandroid.UI

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import com.abraham24.nearbyplacemvpkotlinrxandroid.Adapter.TabAdapter
import com.abraham24.nearbyplacemvpkotlinrxandroid.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tab_layout.addTab(tab_layout.newTab().setText("Night Club"))
        tab_layout.addTab(tab_layout.newTab().setText("Laundry"))
        tab_layout.addTab(tab_layout.newTab().setText("Cafe"))

        var adapter = TabAdapter(supportFragmentManager)
        viewPager.adapter = adapter

        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))

        tab_layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }


            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.setCurrentItem(tab?.position!!)

            }

        })


    }
}
