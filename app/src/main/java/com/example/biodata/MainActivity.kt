package com.example.biodata

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import com.example.biodata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.BTAlamat.setOnClickListener { alamat() }
        binding.BTEmail.setOnClickListener { email() }
        binding.BTTelepon.setOnClickListener { telepon() }

        setContentView(binding.root)

    }

    fun alamat() {
        val gmmIntentUri = Uri.parse("geo:-7.040904,110.469417")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)
    }

    fun email() {
        val intent = Intent(Intent.ACTION_VIEW)
        val data = Uri.parse(
            "mailto:"
                    + "111202012893@mhs.dinus.ac.id"
        )
        intent.data = data
        startActivity(intent)
    }

    fun telepon() {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:0895806437790")
        startActivity(intent)
    }


}