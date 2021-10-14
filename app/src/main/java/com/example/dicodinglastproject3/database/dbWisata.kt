package com.example.dicodinglastproject3.database

import com.example.dicodinglastproject3.Model.ModelWisata
import com.example.dicodinglastproject3.R

object dbWisata {
    private val NamaWisata= arrayOf(
        "Air Mancur Menari",
        "Ekowisata Mangrove",
        "Monumen Kapal Selam",
        "Masjid Muhammad Cheng Hoo",
        "Masjid Nasional Al-Akbar",
        "Museum De Javasche Bank",
        "Monumen Bambu Runcing",
        "House of Sampoerna",
        "Tugu Pahlawan",
        "Taman Bungkul"
    )

    private val DetailWisata = arrayOf(
        "Air Mancur Menari merupakan objek wisata yang terletak di daerah Kenjeran. Tempat ini merupakan spot bagus untuk mengambil foto selfie. Karena terdapat jembatan megah yang di bangun di sepanjang Pantai Kenjeran. Dari jembatan inilah Anda dapat menikmati kecantikan Air Mancur Menari pada malam hari.",
        "Ekowisata Mangrove ini begitu digemari oleh para wisatawan karena dapat merasakan daerah hijau di tengah cuaca panas Surabaya yang terik.",
        "Monumen Kapal Selam ini begitu edukatif, mengingat monumen kapal selam merupakan KRI Pasopati 410 yang ikut dalam operasi Trikora. Untuk lebih mengenal tentang sejarahnya, para pengunjung disuguhkan sebuah film pendek tentang pertempuran Laut Aru.",
        "Masjid Muhammad Cheng Hoo Surabaya selalu ramai oleh pengunjung. Meski wisata rohani, Anda pun dapat mengabadikan momen dengan berfoto di tempat ini karena terdapat desain Tiongkok yang bercampur denga Arab yang membuatnya begitu indah.",
        "Masjid yang sudah dibangun sejak tahun 1995 ini memang memiliki gaya arsitektur yang menarik. Bahkan sejak Anda tiba di pintu gerbangnya, Anda sudah akan dibuat terpukau dengan desainnya.",
        "Surabaya memang memiliki banyak wisata sejarah yang begitu menarik untuk dikunjungi. Dan Museum De Javasche Bank menjadi saksi bisu awal mula dunia perbankan yang ada di Indonesia. Bangunan satu ini dikenal juga sebagai cagar budaya karena menyimpan banyak peninggalan bersejarah yang tentunya tidak bernilai harganya.",
        "Monumen Bambu Runcing ini tentunya dapat dijadikan tempat edukasi untuk anak-anak hinga pelajar unutk memperdalam sejarah. Mengingat bambu runcing sendiri merupakan senjata ampuh para pahlawan untuk mengusir penjajah.",
        "House of Sampoerna ini menjadi destinasi menarik bagi wisatawan yang berkunjung ke Kota Surabaya. Tempat ini memiliki pajangan yang edukatif dan juga unik tentang perkembangan industri rokok Sampoerna mulai awal hingga saat ini.",
        "Tempat wisata selanjutnya merupakan ikon Kota Pahlawan yang begitu populer, yaitu Tugu Pahlawan. Tempat ini dipenuhi oleh tanaman hijau yang rindang yang cocok untuk dijadikan tempat singgah setelah berkeliling Kota Surabaya. Anda dapat bersantai sambil menikmati Tugu Pahlawan yang telah berdiri sejak masa penjajahan.",
        "Tempat wisata selanjutnya adalah Taman Bungkul yang namanya terinspirasi dari seorang Sunan yang bernama Ki Ageng Supo. Beliau merupakan seorang penyebar agama Islam di Kota Pahlawan tersebut. Panggilan dari Ki Ageng Supo sendiri ialah Sunan Bungkul, yang menginspirasi masyarakat untuk menanam tanaman di tempat tersebut."
    )

    private val  OperasiWisata = arrayOf(
        "00.00-24.00",
        "07.30–18.00",
        "09.00–17.00",
        "00.00-24.00",
        "00.00-24.00",
        "08.00-16.00",
        "00.00-24.00",
        "00.00-24.00",
        "07.00–15.00",
        "00.00-24.00"
    )

    private val PhotoWisata = intArrayOf(
        R.drawable.air_mancur_menari_surabaya,
        R.drawable.mangrove_surabaya,
        R.drawable.kapal_selam_surabaya,
        R.drawable.cheng_hoo_surabaya,
        R.drawable.al_akbar_surabaya,
        R.drawable.javasche_bank_surabaya,
        R.drawable.bambu_runcing_surabaya,
        R.drawable.sampurnahouse_surabaya,
        R.drawable.tupal_surabaya,
        R.drawable.taman_bungkul_surabaya
    )

    val listData:ArrayList<ModelWisata>
        get()
        {
            val list = arrayListOf<ModelWisata>()
            for(position in NamaWisata.indices)
            {
                val WisataSurabaya = ModelWisata()
                WisataSurabaya.nama = NamaWisata[position]
                WisataSurabaya.detail = DetailWisata[position]
                WisataSurabaya.operasi = OperasiWisata[position]
                WisataSurabaya.photo = PhotoWisata[position]
                list.add(WisataSurabaya)
            }
            return list
        }
}