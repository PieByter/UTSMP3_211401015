package com.example.utsmp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmp3.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerViewAdapter: ListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.bottomNav
        val navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val categoryList = listOf(
            CategoryItem(R.drawable.category_1, "Yoga"),
            CategoryItem(R.drawable.category_2, "Gym"),
            CategoryItem(R.drawable.category_3, "Cardio"),
            CategoryItem(R.drawable.category_4, "Stretch"),
            CategoryItem(R.drawable.category_5, "Full Body"),
            CategoryItem(R.drawable.category_1, "Yoga lv2"),
            CategoryItem(R.drawable.category_2, "Gym lv2"),
            CategoryItem(R.drawable.category_3, "Cardio lv2"),
            CategoryItem(R.drawable.category_4, "Stretch lv2"),
            CategoryItem(R.drawable.category_5, "Full Body lv2"),
        )

        val adapter = ListAdapter(categoryList)
        recyclerView.adapter = adapter
    }
}