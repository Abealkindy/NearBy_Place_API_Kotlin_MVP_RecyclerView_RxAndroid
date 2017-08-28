package com.abraham24.nearbyplacemvpkotlinrxandroid.Model

import com.abraham24.nearbyplacemvpkotlinrxandroid.POJO.Result

/**
 * Created by KOCHOR on 8/25/2017.
 */
interface ModelNightClub {

    fun success(data: List<Result>, status: String)

    fun error(error: String)
}