package com.bibliographer.researchbible.presentation.selectBibleBook.adapter

import androidx.recyclerview.widget.DiffUtil
import com.bibliographer.researchbible.domain.GospelEntity
import com.bibliographer.researchbible.domain.NewsBlockEntity

object GospelDiffCallback : DiffUtil.ItemCallback<GospelEntity>() {
    override fun areItemsTheSame(oldItem: GospelEntity, newItem: GospelEntity): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: GospelEntity, newItem: GospelEntity): Boolean =
        oldItem == newItem
}