package com.abraham24.nearbyplacemvpkotlinrxandroid.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abraham24.nearbyplacemvpkotlinrxandroid.Adapter.CustomAdapterRecyclerView
import com.abraham24.nearbyplacemvpkotlinrxandroid.Model.ModelNightClub
import com.abraham24.nearbyplacemvpkotlinrxandroid.POJO.Result
import com.abraham24.nearbyplacemvpkotlinrxandroid.Presenter.PresenterNightClub

import com.abraham24.nearbyplacemvpkotlinrxandroid.R
import kotlinx.android.synthetic.main.fragment_barber.*


/**
 * A simple [Fragment] subclass.
 */
class Zoo : Fragment(), ModelNightClub {


    var presenter_night_club: PresenterNightClub? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
         var view = inflater!!.inflate(R.layout.fragment_barber, container, false)

        presenter_night_club = PresenterNightClub(this)
        presenter_night_club?.getZoo("-6.1925297,106.8001397", 1000, "cafe", "AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk")

        return view


    }
    override fun success(data: List<Result>, status: String) {
        var adapter = CustomAdapterRecyclerView(activity, data)
        var linear = LinearLayoutManager(activity)
        recycler_view_zoo.adapter = adapter
        recycler_view_zoo.layoutManager = linear
    }

    override fun error(error: String) {
    }
}// Required empty public constructor
