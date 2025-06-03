package com.example.practicaformulario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var nombre: EditText
    private lateinit var edad: EditText
    private lateinit var sexo: EditText
    private lateinit var nacionalidad: EditText
    private lateinit var telefono: EditText
    private lateinit var correo: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        nombre = findViewById(R.id.textNombre)
        edad = findViewById(R.id.textEdad)
        sexo = findViewById(R.id.textSexo)
        nacionalidad = findViewById(R.id.textNacionalidad)
        telefono = findViewById(R.id.textTelefono)
        correo = findViewById(R.id.textCorreo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        btnclick()
    }
    private fun btnclick(){
        val Inicio = findViewById<Button>(R.id.Confirmacion)
        Inicio.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("nombre", nombre.text.toString())
            intent.putExtra("edad", edad.text.toString())
            intent.putExtra("sexo", sexo.text.toString())
            intent.putExtra("nacionalidad", nacionalidad.text.toString())
            intent.putExtra("telefono", telefono.text.toString())
            intent.putExtra("correo", correo.text.toString())
            startActivity(intent)
        }
    }
}