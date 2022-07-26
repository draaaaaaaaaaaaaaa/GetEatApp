package com.daffa.geteat

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.daffa.geteat.FoodData.listData

class ListFoodAdapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {


        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_food, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .into(holder.imgPhoto)
        holder.tvName.text = food.name
        holder.tvDetail.text = food.detail
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context,ActivityDetail ::class.java)
            intent.putExtra(ActivityDetail.FOOD_DATA, listFood[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tvname)
        var tvDetail: TextView = itemView.findViewById(R.id.tvdetail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)


    }
}