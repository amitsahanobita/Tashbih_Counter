package com.example.tasbihcounter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    private var score=0
    private var _liveScore = MutableLiveData<Int>()
    val liveScore:LiveData<Int> = _liveScore

    fun increase(){
        score++
        _liveScore.postValue(score)
    }
    fun decrease(){
        if (score >0)
            score--
        _liveScore.postValue(score)
    }
    fun reset (){
        score =0
        _liveScore.postValue(score)
    }

}