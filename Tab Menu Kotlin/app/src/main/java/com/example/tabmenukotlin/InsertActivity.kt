package com.example.tabmenukotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout

class InsertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)


        val tabTitles = arrayOf("Home", "Insert")
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> launchHomeActivity()
                    1 -> launchInsertActivity()
                }

    }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }

    private fun launchHomeActivity() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun launchInsertActivity() {
//        startActivity(Intent(this, MainActivity::class.java))
    }
}