package ru.mvlikhachev.mvvmcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var counter : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter = findViewById(R.id.counterTextView)
    }

    override fun onStart() {
        super.onStart()
        object : CountDownTimer(20000, 1000){
            override fun onFinish() {
                TODO("Not yet implemented")
            }

            override fun onTick(p0: Long) {
                counter.text = (p0 / 1000).toString()
            }
        }.start()
    }
}