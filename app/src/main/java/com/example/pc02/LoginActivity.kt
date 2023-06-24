package com.example.pc02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import com.example.pc02.R.id.btn_RegCuenta
import com.example.pc02.R.id.btn_crearCuenta

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnRegCuenta: Button = findViewById(btn_crearCuenta)
        btnRegCuenta.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java).apply { }
            startActivity(intent)
        }
    }
}