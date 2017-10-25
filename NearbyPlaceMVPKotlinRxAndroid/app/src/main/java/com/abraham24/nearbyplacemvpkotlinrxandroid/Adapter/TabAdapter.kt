package com.abraham24.nearbyplacemvpkotlinrxandroid.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.widget.Switch
import com.abraham24.nearbyplacemvpkotlinrxandroid.Fragment.Laundry
import com.abraham24.nearbyplacemvpkotlinrxandroid.Fragment.NightClub
import com.abraham24.nearbyplacemvpkotlinrxandroid.Fragment.Zoo

/**
 * Created by KOCHOR on 8/25/2017.
 */
class TabAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return NightClub()
        } else if (position == 1) {
            return Laundry()
        } else {
            return Zoo()
        }

    }

    override fun getCount(): Int {

        return 3

    }
}