package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//
// //    //btn numbers
   private lateinit var btOne: Button
   private lateinit var btTwo: Button
   private lateinit var btThree: Button
   private lateinit var btFour: Button
   private lateinit var btFive: Button
   private lateinit var btSix: Button
   private lateinit var btSeven: Button
   private lateinit var btEight: Button
   private lateinit var btNine: Button
   private lateinit var btZero: Button

//    btn operations
   private lateinit var btDot: Button
   private lateinit var btPi: Button
   private lateinit var btEqual: Button
   private lateinit var btPlus: Button
   private lateinit var btMin: Button
   private lateinit var btDiv: Button
   private lateinit var btMul: Button
   private lateinit var btInv: Button
   private lateinit var btSqrt: Button
   private lateinit var btSquare: Button
   private lateinit var btFat: Button
   private lateinit var btLn: Button
   private lateinit var btCos: Button
   private lateinit var btTan: Button
   private lateinit var bt1: Button
   private lateinit var bt2: Button
   private lateinit var btC: Button
   private lateinit var btAc: Button
   private lateinit var btLog: Button
   private lateinit var btSin: Button

   private lateinit var tvMain: TextView
   private lateinit var tvSec: TextView

   val pi: String = "3.14159265"

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      // operators
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
       btSquare = findViewById(R.id.bt_square)
       btFat = findViewById(R.id.bt_fat)
       btLn = findViewById(R.id.bt_ln)
       btLog = findViewById(R.id.bt_log)
       btSin = findViewById(R.id.bt_sin)
       btCos = findViewById(R.id.bt_cos)
       btTan = findViewById(R.id.bt_tan)
       btDot = findViewById(R.id.bt_dot)

       btAc = findViewById(R.id.bt_ac)
       btC = findViewById(R.id.bt_c)

      //  numbers
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

//       btOne.setOnClickListener(View.OnClickListener { tvMain.text = tvMain.text.toString() + "1" })

       btOne.setOnClickListener(View.OnClickListener {
          val value: String = tvMain.text.toString()
          tvMain.text = value + btOne.text.toString()
       })

       btTwo.setOnClickListener(View.OnClickListener {
          val value: String = tvMain.text.toString()
          tvMain.text = value + btTwo.text.toString()
       })

       btThree.setOnClickListener(View.OnClickListener {
          val value: String = tvMain.text.toString()
          tvMain.text = value + btThree.text.toString()
       })

       btFour.setOnClickListener(View.OnClickListener {
          val value: String = tvMain.text.toString()
          tvMain.text = value + btFour.text.toString()
       })

       btFive.setOnClickListener(View.OnClickListener {
          val value: String = tvMain.text.toString()
          tvMain.text = value + btFive.text.toString()
       })

       btSix.setOnClickListener(View.OnClickListener {
          val value: String = tvMain.text.toString()
          tvMain.text = value + btSix.text.toString()
       })

       btSeven.setOnClickListener(View.OnClickListener {
          val value: String = tvMain.text.toString()
          tvMain.text = value + btSeven.text.toString()
       })

       btEight.setOnClickListener(View.OnClickListener {
          val value: String = tvMain.text.toString()
          tvMain.text = value + btEight.text.toString()
       })

       btNine.setOnClickListener(View.OnClickListener {
          val value: String = tvMain.text.toString()
          tvMain.text = value + btNine.text.toString()
       })

       btZero.setOnClickListener(View.OnClickListener {
          val value: String = tvMain.text.toString()
          tvMain.text = value + btZero.text.toString()
       })

    }
}
