package com.example.practicaformulario

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nombre=intent.getStringExtra("nombre")
        val ingnombre = findViewById<TextView>(R.id.Ingnombre)
        ingnombre.text = nombre ?:"sin nombre"

        val edad=intent.getStringExtra("edad")
        val ingedad = findViewById<TextView>(R.id.Ingedad)
        ingedad.text = edad ?:"sin edad"

        val sexo=intent.getStringExtra("sexo")
        val ingsexo = findViewById<TextView>(R.id.Ingsexo)
        ingsexo.text = sexo ?:"sin sexo"

        val nacionalidad=intent.getStringExtra("nacionalidad")
        val ingnacionalidad = findViewById<TextView>(R.id.Ingnacionalidad)
        ingnacionalidad.text = nacionalidad ?:"sin nacionalidad"

        val telefono=intent.getStringExtra("telefono")
        val ingtelefono = findViewById<TextView>(R.id.Ingtelefono)
        ingtelefono.text = telefono ?:"sin telefono"

        val correo=intent.getStringExtra("correo")
        val ingcorreo = findViewById<TextView>(R.id.Ingcorreo)
        ingcorreo.text = correo ?:"sin correo"

    }

    fun regresar(view: View){
        finish()
    }
}