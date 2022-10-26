package com.yusud.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cikarmaIslemi(40,25)

        //Butona bu şekildede yetki verilir.
        button.setOnClickListener {
            val toplamaSonucu = toplamaIslemi(10,40)
            textSonuc.text = "Sonuc : ${toplamaSonucu}"
        }
    }

    fun cikarmaIslemi(x: Int, y: Int){
        textSonuc.text = "Sonuç: ${x-y}"
    }

    fun toplamaIslemi(a: Int, b: Int) : Int{
        return a + b
    }

    //Butona bu şekildede yetki verilir.
   /* fun degistir(view : View){
        val toplamaSonucu = toplamaIslemi(10,50)
        textSonuc.text = "Sonuc: ${toplamaSonucu}"
    }*/

}