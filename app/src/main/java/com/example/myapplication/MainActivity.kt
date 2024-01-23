package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var napis = findViewById<TextView>(R.id.tekst)
        napis.text = "Nie kliknięty"

        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            napis.text = "Kliknąłeś"
        }
    }



}