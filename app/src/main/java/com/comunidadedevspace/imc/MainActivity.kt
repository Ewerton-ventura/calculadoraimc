package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // recuperar os componentes EditText
        // Criar uma Variavel e associar o componete  de UI  <EditText>
        // recuperar botao
        // colocar acao no botao  setOnClicklistener
        // Recuperar o text digitando no edt peso

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val edtcalular = findViewById<Button>(R.id.botao_calcular)

        edtcalular.setOnClickListener{
           val peso = edtpeso.text
           val altura = edtaltura.text

            println("acao do botao " + altura)

        }

    }
}