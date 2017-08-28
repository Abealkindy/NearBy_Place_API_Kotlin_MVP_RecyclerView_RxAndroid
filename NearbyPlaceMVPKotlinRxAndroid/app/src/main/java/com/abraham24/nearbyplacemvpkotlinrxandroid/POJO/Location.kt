package com.abraham24.nearbyplacemvpkotlinrxandroid.POJO

import com.google.gson.annotations.SerializedName


class Location {

    @SerializedName("lat")
    var lat: Double? = null
    @SerializedName("lng")
    var lng: Double? = null

}
