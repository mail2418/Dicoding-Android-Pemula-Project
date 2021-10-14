package com.example.dicodinglastproject3.Activity

import com.example.dicodinglastproject3.R

import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutMeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aboutme)

        val actionbar = supportActionBar
        actionbar!!.title = "About Me"
        //ada tombol back
        actionbar.setDisplayHomeAsUpEnabled(true)

        val myImage : Int = R.drawable.foto_formal
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)

        Glide.with(this)
                .load(myImage)
                .apply(RequestOptions().override(300,300))
                .into(imgSetPhoto)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
