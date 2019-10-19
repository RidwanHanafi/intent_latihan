package com.example.intent_latihan

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_kedua.*
import org.w3c.dom.Text

class ActivityKedua : AppCompatActivity() {

    lateinit var hdatanim : TextView
    lateinit var hdatanama : TextView
    lateinit var hdatanilai : TextView
    lateinit var hasil : String
    lateinit var ket : TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        hdatanim = findViewById(R.id.h_datanim)
        hdatanama = findViewById(R.id.h_datanama)
        hdatanilai = findViewById(R.id.h_datanilai)
        ket = findViewById(R.id.hasil2)

        if (R.id.h_datanilai >= 80){
            hasil = "A"
        }else if(R.id.h_datanilai >= 60){
            hasil = "B"
        }else if(R.id.h_datanilai >= 40){
            hasil = "C"
        }else if(R.id.h_datanilai >= 20){
            hasil = "D"
        }else if(R.id.h_datanilai >= 0){
            hasil = "E"
        }


        hdatanim.setText(intent.getStringExtra("datanim"))
        hdatanama.setText(intent.getStringExtra("datanama"))
        hdatanilai.setText(intent.getStringExtra("datanilai"))
        ket.text="Keterangan    : "+hasil





    }
}
