package com.kewenc.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(a : Int, b : Int) : Int{
        return a + b
    }

    fun sum2(a : Int, b : Int) = a + b
}
