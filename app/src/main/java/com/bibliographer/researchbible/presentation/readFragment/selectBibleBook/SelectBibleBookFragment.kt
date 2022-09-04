package com.bibliographer.researchbible.presentation.selectBibleBook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bibliographer.researchbible.databinding.FragmentSelectBibleBookBinding
import com.bibliographer.researchbible.domain.GospelEntity
import com.bibliographer.researchbible.presentation.selectBibleBook.adapter.GospelAdapter

class SelectBibleBookFragment : Fragment() {

    private var _binding: FragmentSelectBibleBookBinding? = null
    val binding: FragmentSelectBibleBookBinding
        get() = _binding ?: throw RuntimeException("FragmentSelectBibleBookBinding is null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSelectBibleBookBinding.inflate(inflater, container, false)



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = GospelAdapter(requireContext())
        binding.rvGospels.adapter = adapter
        val listOfGospel = listOf(
        GospelEntity(0, "Евангелие от Матфея"),
        GospelEntity(1, "Евангелие от Марка"),
        GospelEntity(2, "Евангелие от Луки"),
        GospelEntity(3, "Евангелие от Иоанна")
        )

        adapter.submitList(listOfGospel)
    }
}