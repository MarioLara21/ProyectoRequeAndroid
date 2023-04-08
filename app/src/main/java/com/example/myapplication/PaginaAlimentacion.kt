package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PaginaAlimentacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_alimentacion)
        val btn_VolverA = findViewById(R.id.btnVolverA) as Button
        val btn_img1 = findViewById(R.id.btnImg1) as ImageButton
        val btn_img2 = findViewById(R.id.btnImg2) as ImageButton
        val btn_img3 = findViewById(R.id.btnImg3) as ImageButton
        val btn_img4 = findViewById(R.id.btnImg4) as ImageButton
        val i = Intent(this, MapsActivity::class.java)
        btn_VolverA.setOnClickListener {
            val i = Intent(this, PaginaPrincipal::class.java)
            startActivity(i)
        }
        btn_img1.setOnClickListener {
            i.putExtra("Latitud", 9.855390)
            i.putExtra("Longitud", -83.912903)
            i.putExtra("Título", "Restaurante Institucional TEC")
            startActivity(i)
        }
        btn_img2.setOnClickListener {
            i.putExtra("Latitud", 9.854233)
            i.putExtra("Longitud", -83.910331)
            i.putExtra("Título", "Soda el Lago TEC")
            startActivity(i)
        }
        btn_img3.setOnClickListener {

            i.putExtra("Latitud", 9.857249)
            i.putExtra("Longitud", -83.910798)
            i.putExtra("Título", "Soda Área Deportiva TEC")
            startActivity(i)
        }
        btn_img4.setOnClickListener {
            i.putExtra("Latitud", 9.853930)
            i.putExtra("Longitud", -83.906945)
            i.putExtra("Título", "Comedor Institucional Este TEC")
            startActivity(i)
        }
    }
}