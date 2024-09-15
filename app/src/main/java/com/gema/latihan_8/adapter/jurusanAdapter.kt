package com.gema.latihan_8.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.gema.latihan_8.DetailImageActivity
import com.gema.latihan_8.MainActivity
import com.gema.latihan_8.R
import com.gema.latihan_8.RecycleCardJurusan
import com.gema.latihan_8.model.ModelMovie

class jurusanAdapter(
    private val getActivity: RecycleCardJurusan,
    private val jurusanlist: List<ModelMovie>
) : RecyclerView.Adapter<jurusanAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtjurusan: TextView = itemView.findViewById(R.id.txtjurusan)
        val imgjurusan: ImageView = itemView.findViewById(R.id.imgjurusan)
        val cardview: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nview = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemcard, parent, false)
        return MyViewHolder(nview)
    }

    override fun getItemCount(): Int {
        return jurusanlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Set data
        holder.txtjurusan.text = jurusanlist[position].title
        holder.imgjurusan.setImageResource(jurusanlist[position].image)

        // Set OnClickListener pada CardView
        holder.cardview.setOnClickListener {
            // Intent untuk membuka DetailImageActivity
            val intent = Intent(getActivity, DetailImageActivity::class.java)

            // Kirim data gambar ke DetailImageActivity
            intent.putExtra("imageResId", jurusanlist[position].image)

            // Mulai activity baru
            getActivity.startActivity(intent)
        }
    }
}