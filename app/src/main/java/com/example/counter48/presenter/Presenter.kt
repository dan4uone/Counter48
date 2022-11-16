package com.example.counter48.presenter

import com.example.counter48.model.CounterModel
import com.example.counter48.view.CounterView


class Presenter {

    val model = CounterModel()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.updateCount(model.getCount().toString() )
        if (model.getCount() == +10){
            view.showToastPlus()
        }else if (model.getCount() == +15) {
            view.getColor()
        }

    }
fun attachView(view: CounterView) {
this.view = view


}


}