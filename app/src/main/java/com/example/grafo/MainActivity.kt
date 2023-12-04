package com.example.grafo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    lateinit var controladorNavegacion: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Asigno el toolbar del layout como actionbar
        setSupportActionBar(findViewById(R.id.my_toolbar))

        //Le digo que el actionbar va a estar gestionado por el controlador de navegación
        val fragmentoNavegacion=supportFragmentManager.findFragmentById(R.id.contenedor_navegacion) as NavHostFragment
        controladorNavegacion=fragmentoNavegacion.navController
        setupActionBarWithNavController(controladorNavegacion)
    }

    //Le decimos que cuando pulse 'up' en el action bar, haga lo que hace el controlador de navegación
    //al ejecutar 'up'(y lo que hace el navegador en ese caso es back)
    override fun onSupportNavigateUp(): Boolean {
        return controladorNavegacion.navigateUp()
    }
}