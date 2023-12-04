package com.example.grafo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.grafo.databinding.FragmentPierdeBinding

class PierdeFragment : Fragment() {
    var _enlace: FragmentPierdeBinding?=null
    val enlace
        get()=_enlace!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _enlace= FragmentPierdeBinding.inflate(inflater, container,false)
        return enlace.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let{
            val datos=PierdeFragmentArgs.fromBundle(it)
            Toast.makeText(context,datos.mensaje,Toast.LENGTH_SHORT).show()
        }
    }

}