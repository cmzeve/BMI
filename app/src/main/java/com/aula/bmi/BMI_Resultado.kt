package com.aula.bmi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BMI_Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_resultado)
    }

    override fun onStart() {
        super.onStart()

        val resultado = findViewById<TextView>(R.id.txt_resultado)

        val result = intent.extras?.getString("result")

        resultado.text = result

       }
}