package com.abraham24.nearbyplacemvpkotlinrxandroid.API

import com.abraham24.nearbyplacemvpkotlinrxandroid.POJO.ResponseJSON
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

/**
 * Created by KOCHOR o9n 8/25/2017.
 */
interface ApiService {

    @GET("json")
    fun request_nearby(
            @Query("location") location: String,
            @Query("type") type: String,
            @Query("radius") radius: Int,
            @Query("key") key: String
    ): Observable<ResponseJSON>
}