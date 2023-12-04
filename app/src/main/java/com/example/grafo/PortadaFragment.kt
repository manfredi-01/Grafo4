package com.example.grafo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import com.example.grafo.databinding.FragmentPortadaBinding

class PortadaFragment : Fragment() {
    var _enlace: FragmentPortadaBinding?=null
    val enlace
        get()=_enlace!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _enlace= FragmentPortadaBinding.inflate(inflater, container,false)
        return enlace.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        enlace.botonJugar.setOnClickListener {
            //findNavController().navigate(R.id.action_portadaFragment_to_juegoFragment)
            findNavController().navigate(PortadaFragmentDirections.actionPortadaFragmentToJuegoFragment())
        }

        //Asignamos un menú, con su inflado y su acción al pulsar un item
        activity?.addMenuProvider(object: MenuProvider {//tb se puede usa requireActivity()
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.menu_superior,menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                NavigationUI.onNavDestinationSelected(menuItem,findNavController())
                return true
                //return NavigationUI.onNavDestinationSelected(menuItem,findNavController())
                //return menuItem.onNavDestinationSelected(findNavController())

            }

        },viewLifecycleOwner)
    }
}