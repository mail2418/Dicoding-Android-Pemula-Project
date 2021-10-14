package com.example.dicodinglastproject3.Adapter

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dicodinglastproject3.Activity.DetailWisataActivity
import com.example.dicodinglastproject3.Model.ModelWisata
import com.example.dicodinglastproject3.R

class ListWisataSurabayaAdapter(private val listWisata: ArrayList<ModelWisata>) :RecyclerView.Adapter<ListWisataSurabayaAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {

        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.activity_rowlist,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wisata = listWisata[position]
        val mContext = holder.itemView.context

        Glide.with(holder.itemView.context)
                .load(wisata.photo)
                .apply(RequestOptions())
                .into(holder.imgPhoto)

        holder.tvNama.text = wisata.nama
        holder.tvDetail.text = wisata.detail

        holder.itemView.setOnClickListener {

            val ToDetail = Intent(mContext,DetailWisataActivity::class.java)
            ToDetail.putExtra(DetailWisataActivity.EXTRA_NAME,wisata.nama)
            ToDetail.putExtra(DetailWisataActivity.EXTRA_PHOTO,wisata.photo)
            ToDetail.putExtra(DetailWisataActivity.EXTRA_DETAIL,wisata.detail)
            ToDetail.putExtra(DetailWisataActivity.EXTRA_OPERASI,wisata.operasi)

            Log.d("Bundle", "tName: ${wisata.nama}")
            Log.d("Bundle", "tImg: ${wisata.photo}")
            Log.d("Bundle", "tDetail: ${wisata.detail}")
            Log.d("Bundle", "tOpearsi: ${wisata.operasi}")

            mContext.startActivity(ToDetail)
        }
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}