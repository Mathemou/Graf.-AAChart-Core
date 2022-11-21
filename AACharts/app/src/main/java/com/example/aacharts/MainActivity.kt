package com.example.aacharts

import Adapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager2 = findViewById<ViewPager2>(R.id.viewpager)

        val adapter = Adapter(supportFragmentManager, lifecycle)
        adapter.addFragment(GraficoHorasMaradona())
        adapter.addFragment(GraficoHorasGuiguer())
        adapter.addFragment(GraficoHorasGuiguerEMaradona())
        adapter.addFragment(GraficoGraficos())
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager2.adapter = adapter
    }
}