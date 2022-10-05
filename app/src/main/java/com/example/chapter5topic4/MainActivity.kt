package com.example.chapter5topic4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Snackbar.make(btn_eng, R.string.txt_sapaan, Snackbar.LENGTH_LONG).setAction(R.string.sb_deflang){
            setLocale("id")
        } .show()

        btn_eng.setOnClickListener {
            setLocale("en")
        }
        btn_idn.setOnClickListener {
            setLocale("id")
        }
        btn_kor.setOnClickListener {
            setLocale("ko")
        }
    }

    fun setLocale(lang:String){
        val lokal = Locale(lang)
        val conf = resources.configuration
        conf.locale = lokal
        resources.updateConfiguration(conf, resources.displayMetrics)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}