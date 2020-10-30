package ru.mvlikhachev.mvvmcounter.ViewModel

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val liveData = MutableLiveData<String>()

    init {
        start()
    }


    fun start() {
        object : CountDownTimer(20000, 1000){
            override fun onFinish() {
                TODO("Not yet implemented")
            }

            override fun onTick(p0: Long) {
                liveData.value = (p0 / 1000).toString()
            }
        }.start()
    }
}