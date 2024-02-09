package com.danielfuentes.chocowallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ProgressBar
import com.danielfuentes.chocowallet.R.id.progressBar

class SplashScreenActivity : AppCompatActivity() {
    lateinit var progressBar:ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        progressBar = findViewById(R.id.progressBar)
        progressBar.visibility = View.GONE
        nextView()
    }
    private fun nextView() {
        object: CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                progressBar.visibility = View.VISIBLE
            }
            override fun onFinish() {
                val intent = Intent(applicationContext, AboutActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.start()
    }
}
