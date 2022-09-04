package com.bibliographer.researchbible.presentation.readFragment.adapter

import androidx.recyclerview.widget.DiffUtil
import com.bibliographer.researchbible.domain.BibleBook

object BibleDiffCallback: DiffUtil.ItemCallback<BibleBook>() {
    override fun areItemsTheSame(oldItem: BibleBook, newItem: BibleBook): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: BibleBook, newItem: BibleBook): Boolean =
        oldItem == newItem

}