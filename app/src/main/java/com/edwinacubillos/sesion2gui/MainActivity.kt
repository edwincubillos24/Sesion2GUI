package com.edwinacubillos.sesion2gui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_guardar.setOnClickListener {
            val nombre = et_nombre.text.toString()
            val cedula = et_cedula.text.toString()
            val correo = et_correo.text.toString()
            val contrasena = et_contrasena.text.toString()
            val rep_contrasena = et_rep_contrasena.text.toString()

            if (contrasena == rep_contrasena) {
                tv_resultado.text = (cedula.toInt() / 0).toString()
            } else {
                tv_resultado.text = getString(R.string.error_contrasenas)
            }
        }



    }
}