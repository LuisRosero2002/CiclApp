package com.example.ciclapp.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ciclapp.R

class CustomAdapter:RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    val titles = arrayOf("Codelia","Suscribete","Videos","Youtube")
    val detail = arrayOf("Canal","Accion","De que trata","Plataforma")
    val image = intArrayOf(R.drawable.baseline_home_24,R.drawable.baseline_home_24,R.drawable.baseline_account_circle_24)
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout,viewGroup, false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text =  titles[i]
        viewHolder.itemDetail.text =  detail[i]
        viewHolder.itemImage.setImageResource(image[i])

    }
    override fun getItemCount(): Int {
        return titles.size
    }


    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var itemImage:ImageView
        var itemTitle:TextView
        var itemDetail:TextView

        init {
            itemTitle = itemView.findViewById(R.id.item_title)
            itemImage = itemView.findViewById(R.id.item_img)
            itemDetail = itemView.findViewById(R.id.item_detail)

        }
    }


}