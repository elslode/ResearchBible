package com.bibliographer.researchbible.presentation.selectBibleBook.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.bibliographer.researchbible.databinding.ItemGospelBinding
import com.bibliographer.researchbible.databinding.ItemNewsBinding
import com.bibliographer.researchbible.domain.GospelEntity
import com.bibliographer.researchbible.domain.NewsBlockEntity

class GospelAdapter(
    val context: Context
) : ListAdapter<GospelEntity, GospelViewHolder>(GospelDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GospelViewHolder {
        val binding = ItemGospelBinding.inflate(
            LayoutInflater.from(context),
            parent,
            false
        )
        return GospelViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GospelViewHolder, position: Int) {
        val binding = holder.binding
        val gp = getItem(position)
        with(binding) {
            with(gp) {
                binding.tvGospelName.text = gp.nameOfBookOfBible
            }
        }
    }
}