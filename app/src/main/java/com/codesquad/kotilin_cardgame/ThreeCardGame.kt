package com.codesquad.kotilin_cardgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
class ThreeCardGame : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_threecard_game, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}