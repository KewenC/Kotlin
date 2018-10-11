package com.kewenc.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //函数调用
        sum(1, 2)
        sum2(1, 2)
        sum3(1, 2)
        sum4(1, 2)

        //只读局部变量
        val a : Int = 1
        val b = 2
        val c : Int
        c = 3

        //可变局部变量
        var x = 5
        x += 1

        //字符串使用
        var a2 = 1
        val s1 = "a2 is $a2"
        a2 = 2
        val s2 = "${s1.replace("is", "was")}, but now is $a2"
        println(s2)

        maxOf(99 , 1)
        maxOf2(99 , 1)
    }

    //函数定义
    fun sum(a : Int, b : Int) : Int{
        return a + b
    }
    fun sum2(a : Int, b : Int) = a + b
    fun sum3(a : Int, b : Int) : Unit {
        println("sum of $a and $b is ${a + b}")
    }
    fun sum4(a : Int, b : Int) {
        println("sum of $a and $b is ${a + b}")
    }

    //条件表达式
    private fun maxOf(a : Int, b : Int) : Int {
        if(a > b){
            return a
        } else {
            return b
        }
    }
    private fun maxOf2(a: Int, b: Int) = if (a > b) a else b

    //使用可空值
}
