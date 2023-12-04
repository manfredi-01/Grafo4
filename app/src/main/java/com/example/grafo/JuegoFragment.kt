package com.example.grafo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.grafo.databinding.FragmentJuegoBinding

class JuegoFragment : Fragment() {
    var _enlace: FragmentJuegoBinding?=null
    val enlace
        get()=_enlace!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _enlace= FragmentJuegoBinding.inflate(inflater, container,false)
        return enlace.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        enlace.botonGanar.setOnClickListener {
            if(!enlace.campoNivel.text.toString().isNullOrEmpty() && !enlace.campoPuntos.text.toString().isNullOrEmpty()){
                findNavController().navigate(JuegoFragmentDirections.actionJuegoFragmentToGanaFragment(
                    enlace.campoNivel.text.toString().toInt(),
                    enlace.campoPuntos.text.toString().toInt()
                ))
            }
        }
        enlace.botonPerder.setOnClickListener {
            findNavController().navigate(JuegoFragmentDirections.actionJuegoFragmentToPierdeFragment(
                enlace.campoMensaje.text.toString()
            ))
        }
    }
}