package ru.mvlikhachev.mvvmcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import ru.mvlikhachev.mvvmcounter.ViewModel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    lateinit var mViewModel : MainActivityViewModel




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

    }

    override fun onStart() {
        super.onStart()
        mViewModel.liveData.observe(this, {
            counterTextView.text = it
        })

    }
}