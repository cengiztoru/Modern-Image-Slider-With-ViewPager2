package com.cengiztoru.imagesliderviewpager2

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.cengiztoru.imagesliderviewpager2.databinding.ItemLocationBinding

class TravelLocationAdapter(private val list: List<TravelLocation>) :
    RecyclerView.Adapter<TravelLocationAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_location,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val item = list[position]
        holder.mBinding.item = item

        holder.mBinding.imageLocation.setOnClickListener {
            Toast.makeText(it.context, "${item.location} Clicked", Toast.LENGTH_SHORT).show()
        }
    }

    class CustomViewHolder(val mBinding: ItemLocationBinding) :
        RecyclerView.ViewHolder(mBinding.root)

    override fun getItemCount() = list.size

}