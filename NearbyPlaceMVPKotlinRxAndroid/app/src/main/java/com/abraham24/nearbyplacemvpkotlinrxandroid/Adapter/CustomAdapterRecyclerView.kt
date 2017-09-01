package com.abraham24.nearbyplacemvpkotlinrxandroid.Adapter

import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.abraham24.nearbyplacemvpkotlinrxandroid.POJO.Result
import com.abraham24.nearbyplacemvpkotlinrxandroid.R
import com.bumptech.glide.Glide

/**
 * Created by KOCHOR on 8/25/2017.
 */
class CustomAdapterRecyclerView : RecyclerView.Adapter<CustomAdapterRecyclerView.ViewHolder> {

    var data: List<Result>? = null
    var c: FragmentActivity? = null

    constructor(c: FragmentActivity, data: List<Result>?) {
        this.data = data
        this.c = c
    }

    override fun getItemCount(): Int {

        return data!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.textNama?.setText(data?.get(position)!!.name)

       try {
var photoreference = data?.get(position)!!.photos?.get(0)!!.photoReference
var url = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=" + photoreference + "&key=AIzaSyDN7RJFmImYAca96elyZlE5s_fhX-MMuhk"

Glide.with(c)
.load(url)
.into(holder?.gambar)
} catch (e: Exception) {
Glide.with(c)
.load(data?.get(position)!!.icon)
.into(holder?.gambar)
}

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var inflater = LayoutInflater.from(c).inflate(R.layout.wadah, parent, false)

        return ViewHolder(inflater)
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        var textNama = itemView?.findViewById<View>(R.id.text_view_wadah) as TextView
        var gambar = itemView?.findViewById<View>(R.id.image_view_wadah) as ImageView
    }
}
