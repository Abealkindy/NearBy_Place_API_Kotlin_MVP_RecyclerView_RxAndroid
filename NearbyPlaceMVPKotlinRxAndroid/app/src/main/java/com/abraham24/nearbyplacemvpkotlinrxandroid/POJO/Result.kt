package com.abraham24.nearbyplacemvpkotlinrxandroid.POJO

import com.google.gson.annotations.SerializedName


class Result {

    @SerializedName("alt_ids")
    var altIds: List<AltId>? = null
    @SerializedName("geometry")
    var geometry: Geometry? = null
    @SerializedName("icon")
    var icon: String? = null
    @SerializedName("id")
    var id: String? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("opening_hours")
    var openingHours: OpeningHours? = null
    @SerializedName("photos")
    var photos: List<Photo>? = null
    @SerializedName("place_id")
    var placeId: String? = null
    @SerializedName("reference")
    var reference: String? = null
    @SerializedName("scope")
    var scope: String? = null
    @SerializedName("types")
    var types: List<String>? = null
    @SerializedName("vicinity")
    var vicinity: String? = null

}
