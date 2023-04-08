package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class PaginaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_principal)
        val btn_Alim = findViewById(R.id.btnAlimentacion) as Button
        btn_Alim.setOnClickListener {
            val i = Intent(this, PaginaAlimentacion::class.java)
            startActivity(i)
        }
        val btn_Hosp = findViewById(R.id.btnHospedaje) as Button
        btn_Hosp.setOnClickListener {
            val i = Intent(this, paginaHospedaje::class.java)
            startActivity(i)
        }
    }
}