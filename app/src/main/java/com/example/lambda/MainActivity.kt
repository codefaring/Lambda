package com.example.lambda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lambda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 파라미터 2개를 받아서 반환하는 add 함수
        fun add1(x: Int, y: Int): Int {
            return x + y
        }

        // add1를 add2처럼 스코프와 return을 생략할 수 있다.
        fun add2(x: Int, y: Int) = x + y

        // var 변수명 { 파라미터1 이름: 타입, 파라미터2 이름: 타입 -> 코드 }
        var lambdaTest = { x: Int, y: Int -> x + y }

        var num1: Int = 2
        var num2: Int = 8


        val showUp = ActivityMainBinding.inflate(layoutInflater)
        setContentView(showUp.root)

        showUp.btn.setOnClickListener {
            showUp.textView.text = "람다식 적용! $num1 + $num2 = ${lambdaTest(num1,num2)}"
        }
    }
}