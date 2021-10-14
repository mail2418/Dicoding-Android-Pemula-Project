package com.example.dicodinglastproject3

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dicodinglastproject3.Activity.AboutMeActivity
import com.example.dicodinglastproject3.Adapter.ListWisataSurabayaAdapter
import com.example.dicodinglastproject3.Model.ModelWisata
import com.example.dicodinglastproject3.database.dbWisata

class MainActivity : AppCompatActivity() {

    private lateinit var rvWisata:RecyclerView
    private var list: ArrayList<ModelWisata> = arrayListOf()

    //activity main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title= "Halaman Utama"

        rvWisata = findViewById(R.id.rv_wisata_surabaya)
        rvWisata.setHasFixedSize(true)

        list.addAll(dbWisata.listData)
        showRecyclerList()
    }

    //recycler list
    private fun showRecyclerList() {
        rvWisata.layoutManager = LinearLayoutManager(this)
        val listWisataSurabaya = ListWisataSurabayaAdapter(list)//adapter
        rvWisata.adapter = listWisataSurabaya

    }

    //menu utama
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    //pindah activity ketika mengklik pilihan
    private fun setMode(selectMode:Int)
    {
        when(selectMode)
        {
            R.id.about_me -> {
                val IAboutMe = Intent(this@MainActivity, AboutMeActivity::class.java)
                startActivity(IAboutMe)
            }
        }
    }
}