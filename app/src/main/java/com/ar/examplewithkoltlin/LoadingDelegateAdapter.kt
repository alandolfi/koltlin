package com.ar.examplewithkoltlin

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by alandolfi on 18/5/17.
 */

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.new_item_loading)) {
    }
}
