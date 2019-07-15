package com.jmdevelopers.pokemonapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jmdevelopers.pokemonapp.R
import com.jmdevelopers.pokemonapp.model.Pokemon
import kotlinx.android.synthetic.main.item_pokemon.*

class PokemonListAdapter(internal var pokemonlist: List<Pokemon>, internal var context: Context) :
    RecyclerView.Adapter<PokemonListAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemview=LayoutInflater.from(context).inflate(R.layout.item_pokemon,parent,false)
        return MyViewHolder(itemview)
    }

    override fun getItemCount(): Int {
        return pokemonlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context).load(pokemonlist[position].img).into(holder.img_pokemon)
        holder.nome.text=pokemonlist[position].name
    }

    inner class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        internal var img_pokemon:ImageView
        internal var nome:TextView
        init {
            img_pokemon=itemview.findViewById(R.id.pokemon_image)
            nome=itemview.findViewById(R.id.name_pokemon)
        }


    }

}