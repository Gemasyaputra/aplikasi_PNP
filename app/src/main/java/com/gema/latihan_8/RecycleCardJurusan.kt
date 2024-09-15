package com.gema.latihan_8

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gema.latihan_8.adapter.jurusanAdapter
import com.gema.latihan_8.model.ModelMovie

class RecycleCardJurusan : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var jurusanAdapter : jurusanAdapter? = null
    private var jurusanlist = mutableListOf<ModelMovie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_card_jurusan)



        jurusanlist = ArrayList()
        recyclerView = findViewById(R.id.rvjurusanlist) as RecyclerView
        jurusanAdapter = jurusanAdapter(this , jurusanlist)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this ,2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter =jurusanAdapter

        prepareJurusanList()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun prepareJurusanList() {
        var jurusan = ModelMovie("akutansi", R.drawable.akutansi)
        jurusanlist.add(jurusan)
        jurusan = ModelMovie("bahasa inggris", R.drawable.bing)
        jurusanlist.add(jurusan)
        jurusan = ModelMovie(" teknik elektro", R.drawable.elektro)
        jurusanlist.add(jurusan)
        jurusan = ModelMovie("teknik mesin", R.drawable.mesin)
        jurusanlist.add(jurusan)
        jurusan = ModelMovie("teknologi Informasi", R.drawable.ti)
        jurusanlist.add(jurusan)
        jurusan = ModelMovie("teknik sipil", R.drawable.sipil)
        jurusanlist.add(jurusan)

        jurusanAdapter!!.notifyDataSetChanged()
    }
}