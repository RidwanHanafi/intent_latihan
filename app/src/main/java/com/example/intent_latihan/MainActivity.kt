package com.example.intent_latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var inim : EditText
    lateinit var inama : EditText
    lateinit var inilai : EditText
    lateinit var iklikbutton : Button


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            inim = findViewById(R.id.nim)
            inama = findViewById(R.id.nama)
            inilai = findViewById(R.id.nilai)
            iklikbutton =findViewById(R.id.buttonklik)

        //Mengirim data
       buttonklik.setOnClickListener(){
           val intent = Intent(this,ActivityKedua::class.java)

           intent.putExtra("datanim", inim.text.toString())
           intent.putExtra("datanama", inama.text.toString())
           intent.putExtra("datanilai", inilai.text.toString())

           startActivity(intent)

        }

    }
}
