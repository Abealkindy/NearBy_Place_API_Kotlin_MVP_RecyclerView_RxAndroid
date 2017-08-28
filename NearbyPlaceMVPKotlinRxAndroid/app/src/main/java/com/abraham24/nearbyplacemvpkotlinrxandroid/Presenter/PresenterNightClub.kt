package com.abraham24.nearbyplacemvpkotlinrxandroid.Presenter

import com.abraham24.nearbyplacemvpkotlinrxandroid.Init.InitRetrofit
import com.abraham24.nearbyplacemvpkotlinrxandroid.Model.ModelNightClub
import com.abraham24.nearbyplacemvpkotlinrxandroid.POJO.ResponseJSON
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by KOCHOR on 8/25/2017.
 */
class PresenterNightClub {

    var model: ModelNightClub? = null

    constructor(model: ModelNightClub?) {
        this.model = model
    }

    fun getNightClub (location: String, radius: Int, type: String, key: String) {
        InitRetrofit()
                .getInstant()
                .request_nearby(location, type, radius, key)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe({

                    t: ResponseJSON? ->

                    var data = t?.results
                    var pesan = t?.status

                    if (data?.size!! > 0) {
                        model!!.success(data, pesan!!)
                    } else {
                        model?.error(pesan!!)
                    }
                })
    }

    fun getLaundry(location: String, radius: Int, type: String, key: String) {
        InitRetrofit()
                .getInstant()
                .request_nearby(location, type, radius, key)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe({

                    t: ResponseJSON? ->

                    var data = t?.results
                    var pesan = t?.status

                    if (data?.size!! > 0) {
                        model!!.success(data, pesan!!)
                    } else {
                        model?.error(pesan!!)
                    }
                })
    }

    fun getZoo (location: String, radius: Int, type: String, key: String) {
        InitRetrofit()
                .getInstant()
                .request_nearby(location, type, radius, key)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe({

                    t: ResponseJSON? ->

                    var data = t?.results
                    var pesan = t?.status

                    if (data?.size!! > 0) {
                        model!!.success(data, pesan!!)
                    } else {
                        model?.error(pesan!!)
                    }
                })
    }
}