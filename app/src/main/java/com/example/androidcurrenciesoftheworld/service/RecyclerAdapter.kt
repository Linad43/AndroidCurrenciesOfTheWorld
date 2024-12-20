package com.example.androidcurrenciesoftheworld.service

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidcurrenciesoftheworld.R
import com.example.androidcurrenciesoftheworld.model.Currencies
import javax.inject.Inject


class RecyclerAdapter (
//    @Inject val currencies: MutableList<Currencies?>,
) : RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {
    private var currencies = arrayListOf<Currencies>()
    fun setCurrencies(currencies: ArrayList<Currencies>){
        this.currencies = currencies
        notifyDataSetChanged()
    }

    class RecyclerViewHolder(
        itemView: View,
    ) : RecyclerView.ViewHolder(itemView) {
        val countryTV = itemView.findViewById<TextView>(R.id.countryTV)
        val nameTV = itemView.findViewById<TextView>(R.id.nameTV)
        val symbolTV = itemView.findViewById<TextView>(R.id.symbolTV)
        val imageIV = itemView.findViewById<ImageView>(R.id.imageIV)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): RecyclerViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item, parent, false)
        return RecyclerViewHolder(itemView)
    }

    override fun getItemCount(): Int = currencies.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val currencies = currencies[position]
        holder.countryTV.text = currencies.country
        holder.nameTV.text = currencies.name
        holder.symbolTV.text = currencies.symbol
        holder.imageIV.setImageResource(currencies.image)
    }
}