package com.abraham24.nearbyplacemvpkotlinrxandroid.Init

import com.abraham24.nearbyplacemvpkotlinrxandroid.API.ApiService
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by KOCHOR on 8/25/2017.
 */
class InitRetrofit {

    fun getInit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://maps.googleapis.com/maps/api/place/nearbysearch/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()

    }

    fun getInstant(): ApiService {
        return getInit().create(ApiService::class.java)
    }
}