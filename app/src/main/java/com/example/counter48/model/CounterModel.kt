package com.example.counter48.model

class CounterModel {

    private var count = 0

    fun increment () {
    ++count
    }

    fun dincrement () {
        --count
    }
    fun getCount():Int{
        return count
    }

}