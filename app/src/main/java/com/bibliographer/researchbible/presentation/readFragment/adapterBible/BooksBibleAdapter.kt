package com.bibliographer.researchbible.presentation.readFragment.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.ListAdapter
import com.bibliographer.researchbible.databinding.ItemSelectionBtnBinding
import com.bibliographer.researchbible.domain.BibleBook

class BooksBibleAdapter(
    private val context: Context
): ListAdapter<BibleBook, BibleViewHolder>(BibleDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BibleViewHolder {
        val binding = ItemSelectionBtnBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return BibleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BibleViewHolder, position: Int) {
        val  bible = getItem(position)
        val binding = holder.binding
        with(binding) {
            with(bible) {
                labelSelectBtn.text = this.book
            }
        }

        binding.root.setOnClickListener {
            Log.d(TAG, "onBindViewHolder: BooksBibleAdapter")
        }
    }

    companion object {
        const val TAG = "BibleRead"
    }

}