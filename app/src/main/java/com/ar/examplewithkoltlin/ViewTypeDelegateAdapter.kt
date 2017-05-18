package com.ar.examplewithkoltlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by alandolfi on 18/5/17.
 */
interface ViewTypeDelegateAdapter {
    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}