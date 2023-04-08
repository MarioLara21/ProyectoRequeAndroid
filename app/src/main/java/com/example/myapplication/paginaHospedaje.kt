package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class paginaHospedaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_hospedaje)
        val btn_VolverH = findViewById(R.id.btnVolverH) as Button
        btn_VolverH.setOnClickListener {
            val i = Intent(this, PaginaPrincipal::class.java)
            startActivity(i)
        }
    }

}