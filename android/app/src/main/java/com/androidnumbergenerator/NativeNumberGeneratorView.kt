package com.androidnumbergenerator

import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.facebook.react.uimanager.ThemedReactContext

class NativeNumberGeneratorView : LinearLayout {
    var myContext: ThemedReactContext
    var number: Int = 0

    constructor(context: ThemedReactContext) : super(context) {
        this.myContext = context
        init()
    }

    private fun updateRandomNumberLabel() {
        val randomNumberLabel: TextView = findViewById(R.id.randomNumber)
        randomNumberLabel.text = "" + this.number
    }

    private fun init() {
        inflate(myContext, R.layout.generator_layout, this)

        val randomNumberButton: Button = findViewById(R.id.randomButton)

        randomNumberButton.setOnClickListener {
            this.number = (0 until 100).shuffled().last()
            this.updateRandomNumberLabel()
        }
    }
}