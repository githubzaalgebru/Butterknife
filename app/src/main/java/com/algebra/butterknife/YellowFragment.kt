package com.algebra.butterknife

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_yellow.view.*

class YellowFragment : Fragment( ) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragment = inflater.inflate( R.layout.fragment_yellow, container, false )

        fragment.bToast.setOnClickListener {
            Toast
                .makeText( activity, "Toast from extension", Toast.LENGTH_LONG )
                .show( )
        }

        return fragment
    }

}