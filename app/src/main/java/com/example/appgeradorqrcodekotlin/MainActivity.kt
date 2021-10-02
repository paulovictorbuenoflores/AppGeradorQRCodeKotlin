package com.example.appgeradorqrcodekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.google.zxing.qrcode.QRCodeWriter

class MainActivity : AppCompatActivity() {
    var edit_main_nome_qrcode :EditText?=null
    var img_main_qrcode:ImageView?=null
    var bt_main_gerar_qrcode:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponent()
        isFormulario()


    }


    private fun isFormulario() {
        bt_main_gerar_qrcode!!.setOnClickListener {

            if(TextUtils.isEmpty(edit_main_nome_qrcode!!.text.toString())){
                edit_main_nome_qrcode!!.error="*"
                edit_main_nome_qrcode!!.requestFocus()

            }else{
                geraQRCode(edit_main_nome_qrcode!!.text.toString())

            }

        }
    }

    private fun geraQRCode(conteudoQRCode:String) {
        val qrCode=QRCodeWriter()

        try {
            val bitMatrix=qrCode.encode(conteudoQRCode, BarcodeFormat.QR_CODE, 196,196)

        }catch (e: WriterException){}

    }

    private fun initComponent() {
       edit_main_nome_qrcode=findViewById(R.id.edit_main_nome_qrcode)
       img_main_qrcode=findViewById(R.id.img_main_qrcode)
       bt_main_gerar_qrcode=findViewById(R.id.bt_main_gerar_qrcode)
    }
}