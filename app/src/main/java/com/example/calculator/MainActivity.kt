package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//
////    //btn numbers
   lateinit var btOne: Button
   lateinit var btTwo: Button
   lateinit var btThree: Button
   lateinit var btFour: Button
   lateinit var btFive: Button
   lateinit var btSix: Button
   lateinit var btSeven: Button
   lateinit var btEight: Button
   lateinit var btNine: Button
   lateinit var btZero: Button

//    btn operations
   lateinit var btDot: Button
   lateinit var btPi: Button
   lateinit var btEqual: Button
   lateinit var btPlus: Button
   lateinit var btMin: Button
   lateinit var btDiv: Button
   lateinit var btMul: Button
   lateinit var btInv: Button
   lateinit var btSqrt: Button
   lateinit var btSquare: Button
   lateinit var btFat: Button
   lateinit var btLn: Button
   lateinit var btCos: Button
   lateinit var btTan: Button
   lateinit var bt1: Button
   lateinit var bt2: Button
   lateinit var btC: Button
   lateinit var btAc: Button
   lateinit var btLog: Button
   lateinit var btSin: Button

   lateinit var tvMain: TextView
   lateinit var tvSec: TextView

   val pi: String = "3.14159265"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
////        operators
       bt1 = findViewById(R.id.bt_1)
       bt2 = findViewById(R.id.bt_2)

       btPi = findViewById(R.id.bt_pi)
       btEqual = findViewById(R.id.bt_equal)
       btPlus = findViewById(R.id.bt_plus)
       btMin = findViewById(R.id.bt_min)
       btMul = findViewById(R.id.bt_mul)
       btDiv = findViewById(R.id.bt_div)
       btInv = findViewById(R.id.bt_inv)
       btSqrt = findViewById(R.id.bt_sqrt)
       btSquare = findViewById(R.id.square)
       btFat = findViewById(R.id.bt_fat)
       btLn = findViewById(R.id.bt_ln)
       btLog = findViewById(R.id.bt_log)
       btSin = findViewById(R.id.bt_sin)
       btCos = findViewById(R.id.bt_cos)
       btTan = findViewById(R.id.bt_tan)
       btDot = findViewById(R.id.bt_dot)


       btAc = findViewById(R.id.bt_ac)
       btC = findViewById(R.id.bt_c)


       numbers
       btOne = findViewById(R.id.bt_one)
       btTwo = findViewById(R.id.bt_two)
       btThree = findViewById(R.id.bt_3)
       btFour = findViewById(R.id.bt_4)
       btFive = findViewById(R.id.bt_5)
       btSix = findViewById(R.id.bt_6)
       btSeven = findViewById(R.id.bt_7)
       btEight = findViewById(R.id.bt_8)
       btNine = findViewById(R.id.bt_9)
       btZero = findViewById(R.id.bt_0)


       tvMain = findViewById(R.id.tvmain)
       tvSec = findViewById(R.id.tvsec)


       btOne.setOnClickListener(View.OnClickListener { tvMain.text = tvMain.text.toString() + "1" })
    }




}