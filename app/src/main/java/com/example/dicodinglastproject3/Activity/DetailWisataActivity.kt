package com.example.dicodinglastproject3.Activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dicodinglastproject3.R

//adapter
class DetailWisataActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_OPERASI = "extra_operasi"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

//        val bundle: Bundle? = intent.extras
//        val tName: String? = bundle?.getString(EXTRA_NAME)
//        val tImg: Int? = bundle?.getInt(EXTRA_PHOTO,0)
//        val tDetail: String? = bundle?.getString(EXTRA_DETAIL)
//        val tOperasi: String? = bundle?.getString(EXTRA_OPERASI)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO,0)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tOperasi = intent.getStringExtra(EXTRA_OPERASI)

        //mengarahkan ke layout
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val tvOperasi: TextView = findViewById(R.id.tv_item_operasi)
        val btnShare : Button = findViewById(R.id.btn_set_share)

        //Log
        Log.d("Bundle", "tName: $tName")
        Log.d("Bundle", "tImg: $tImg")
        Log.d("Bundle", "tDetail: $tDetail")
        Log.d("Bundle", "tOpearsi: $tOperasi")

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Wisata"
        //ada tombol back
        actionbar.setDisplayHomeAsUpEnabled(true)

        tvName.text = tName
        tvDetail.text = tDetail
        tvOperasi.text = tOperasi

        Glide.with(this)
                .load(tImg)
                .apply(RequestOptions())
                .into(imgSetPhoto)

        btnShare.setOnClickListener {

            val link = "https://www.javatravel.net/tempat-wisata-surabaya"
            val Share = Intent()
            Share.action = Intent.ACTION_SEND
            Share.putExtra(Intent.EXTRA_TEXT,"Lihat lebih detail lagi pada link berikut ini: $link")

            Share.type = "text/plain"
            startActivity(Intent.createChooser(Share, "Share To:"))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}