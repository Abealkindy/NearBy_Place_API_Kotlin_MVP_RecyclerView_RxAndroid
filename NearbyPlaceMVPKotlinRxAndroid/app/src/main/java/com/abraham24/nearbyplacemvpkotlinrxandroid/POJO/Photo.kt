package com.abraham24.nearbyplacemvpkotlinrxandroid.POJO

import com.google.gson.annotations.SerializedName


class Photo {

    @SerializedName("height")
    var height: Long? = null
    @SerializedName("html_attributions")
    var htmlAttributions: List<Any>? = null
    @SerializedName("photo_reference")
    var photoReference: String? = null
    @SerializedName("width")
    var width: Long? = null

}
