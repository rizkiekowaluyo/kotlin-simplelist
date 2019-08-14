package com.wicara.rizki.myapplication

import android.content.ClipData
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewHeroAdapter(private val listHero:ArrayList<Hero>) : RecyclerView.Adapter<CardViewHeroAdapter.CardViewHolder>(){

    private lateinit var onItemClickListener: OnItemClickListener

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClickListener = onItemClickListener
    }

    override fun onCreateViewHolder(viewGroup : ViewGroup, viewType : Int): CardViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_cardview_hero,viewGroup,false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder : CardViewHolder, position : Int) {
        val (name,from,photo) = listHero[position]
        Glide.with(holder.itemView.context)
                .load(photo)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvFrom.text = from

        holder.btnFavorite.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Favorite " + listHero[position].name, Toast.LENGTH_SHORT).show()
        }
        holder.itemView.setOnClickListener{onItemClickListener.onItemClick(listHero.get(holder.getAdapterPosition()))}
    }

    override fun getItemCount(): Int {
        return listHero.size
    }


    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvFrom: TextView = itemView.findViewById(R.id.tv_item_from)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)

    }

    interface OnItemClickListener {
        fun onItemClick(data: Hero)
    }
}