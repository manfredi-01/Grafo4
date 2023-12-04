package com.example.grafo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.grafo.databinding.FragmentGanaBinding

class GanaFragment : Fragment() {
    var _enlace: FragmentGanaBinding?=null
    val enlace
        get()=_enlace!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _enlace= FragmentGanaBinding.inflate(inflater, container,false)
        return enlace.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let{
            val datos=GanaFragmentArgs.fromBundle(it)
            Toast.makeText(context,"Nivel ${datos.nivel} - ${datos.puntos} puntos", Toast.LENGTH_LONG).show()
        }

    }
}