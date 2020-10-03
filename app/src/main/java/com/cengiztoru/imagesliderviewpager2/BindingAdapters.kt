package com.cengiztoru.imagesliderviewpager2

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso


/**
 * Created by Cengiz TORU on 03/10/2020.
 * cengiz.toru@tsoft.com.tr
 */

@BindingAdapter("app:loadImage")
fun loadImage(imageView: ImageView, url: String) {
    Picasso.get().load(url).into(imageView)
}