package com.bibliographer.researchbible.presentation.readFragment.aboutBookFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bibliographer.researchbible.R

class AboutBibleBookFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_about_bible_book, container, false)
    }

    companion object {

        const val AAA = "чет новое"
        const val AAA2 = "чет новое 2"

        @JvmStatic
        fun newInstance() =
            AboutBibleBookFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}