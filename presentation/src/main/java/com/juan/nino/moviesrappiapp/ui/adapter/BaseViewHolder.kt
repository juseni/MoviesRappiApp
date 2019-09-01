package com.juan.nino.moviesrappiapp.ui.adapter

import android.view.View

/**
 * @author Juan Sebastian Niño
 */

abstract class BaseViewHolder<T>(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {

    abstract fun onBind(item: T)
}