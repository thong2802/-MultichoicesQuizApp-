package com.example.multichoicesquiz.Interface

import android.view.View

interface IOnRecyclerViewItemClickListener {
    fun onClick(view:View, position:Int)
}