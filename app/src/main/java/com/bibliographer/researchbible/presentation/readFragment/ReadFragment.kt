package com.bibliographer.researchbible.presentation.readFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bibliographer.researchbible.R
import com.bibliographer.researchbible.databinding.FragmentReadBinding
import java.lang.RuntimeException


class ReadFragment : Fragment() {

    private var _binding: FragmentReadBinding? = null
    val binding: FragmentReadBinding
        get() = _binding ?: throw RuntimeException("FragmentReadBinding is null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReadBinding.inflate(inflater, container, false)

        return binding.root
    }

    companion object {

    }
}