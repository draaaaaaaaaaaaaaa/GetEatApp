package com.daffa.geteat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.daffa.geteat.databinding.ActivityDetailBinding

class ActivityDetail : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataFood = intent.getParcelableExtra<Food>(FOOD_DATA) as  Food
        Glide.with(this).load(dataFood.photo).into(binding.imgHome)
        binding.apply {
            FoodName.text = dataFood.name
            descDetail.text = dataFood.detail
        }
    }

    companion object {
        const val FOOD_DATA = "0"
    }

}