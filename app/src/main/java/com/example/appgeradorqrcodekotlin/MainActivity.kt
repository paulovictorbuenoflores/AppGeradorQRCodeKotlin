package com.example.appgeradorqrcodekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var edit_main_nome_qrcode :EditText?=null
    var img_main_qrcode:ImageView?=null
    var bt_main_gerar_qrcode:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    initComponent()
    bt_main_gerar_qrcode!!.setOnClickListener {

    }

    }

    private fun initComponent() {
       edit_main_nome_qrcode=findViewById(R.id.edit_main_nome_qrcode)
       img_main_qrcode=findViewById(R.id.img_main_qrcode)
       bt_main_gerar_qrcode=findViewById(R.id.bt_main_gerar_qrcode)
    }
}