package com.example.calculadora20

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = Calcular
        val Resultado = Resultado
        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val Nota2 = Integer.parseInt(Nota2.text.toString())
            val media = (nota1 + Nota2)/ 2
            val Faltas = Integer.parseInt(Faltas.text.toString())



            if (media >=6 && Faltas <=10){
                Resultado.setText("aluno foi aprovado"+ "\n" + "Nota final:"+ media+"\n"+ "Faltas:"+Faltas)
                Resultado.setTextColor(Color.GREEN)
        }
        else{
                Resultado.run {
                    setText("aluno foi reprovado"+ "\n" + "Nota final:"+ media+"\n"+ "Faltas:"+Faltas)
                    setTextColor(Color.MAGENTA)
                }
            }
    }
}
}