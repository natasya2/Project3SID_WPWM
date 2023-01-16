package com.example.project3sid_wpwm.view

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.project3sid_wpwm.R
import com.example.project3sid_wpwm.model.Photo
import kotlinx.android.synthetic.main.item_list.view.*
import java.util.*

class PhotoListAdapter (var photos: ArrayList<Photo>) :
    RecyclerView.Adapter<PhotoListAdapter.ViewHolder>(){
    fun updatePhotos(newPhotos: List<Photo>){
        photos.clear()
        photos.addAll(newPhotos)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
    )
    override fun getItemCount() = photos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int){

        holder.bind(photos[position])
    }
    class  ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(photos: Photo) {
            val gambar :ImageView =itemView.imageView
            itemView.tvTitle.text = photos.title
            itemView.tvRating.text = photos.rating.toString()
//            Log.e("err",photos.rating)
            itemView.tvLokasi.text = photos.lokasi
            val judul = photos.title.toString()
            itemView.setOnClickListener { view ->
                Toast.makeText(itemView.context,"Hello $judul",Toast.LENGTH_LONG).show()
            }
            val urGambar=photos.thumbnail.toString().filterNot{ it.isWhitespace() }

            Glide.with(itemView.context)
                .load("$urGambar")
                .into(gambar)
//            Glide.with(itemView.context).load(photos.thumbnail).into(itemView.imageView)
        }
    }
}
