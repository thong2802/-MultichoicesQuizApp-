package com.example.multichoicesquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import com.example.multichoicesquiz.DBHelper.DBHelper
import com.example.multichoicesquiz.adapter.CategoryAdapter
import com.example.multichoicesquiz.commom.SpaceItemDecoration
import kotlinx.android.synthetic.main.cagoryactivity_main.*

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cagoryactivity_main)

        toolbar.title = "Multichoices Quiz"
        setSupportActionBar(toolbar)
        recyclerView_category.setHasFixedSize(true)
        recyclerView_category.layoutManager = GridLayoutManager(this, 2)

        var adapter = CategoryAdapter(this, DBHelper.getInstance(this).allCategories)
        recyclerView_category.addItemDecoration(SpaceItemDecoration(4))
        recyclerView_category.adapter = adapter
    }
}