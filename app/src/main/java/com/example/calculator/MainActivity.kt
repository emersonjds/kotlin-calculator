package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.math.*

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

//       DOT
        btDot.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            if (!value.contains(".")) {
                tvMain.text = value + btDot.text.toString()
            }
        })

        btPlus.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            if (value != "") {
                tvMain.text = value + btPlus.text.toString()
            }
        })

        btMin.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            val last: Char = value[value.length - 1];
            if (last != '-') {
                tvMain.text = value + btMin.text.toString()
            }
        })

        btDiv.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            if (value != "") {
                tvMain.text = value + btDiv.text.toString()
            }
        })


        btSqrt.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            val res: Double = sqrt(value.toDouble())
            val result: String = res.toString();
            tvMain.text = result
        })

        btEqual.setOnClickListener(View.OnClickListener {
            val value = tvMain.text.toString()
            val replaceString: String = value.replace('÷', '/').replace('×', '*');
            val result: Double = eval(replaceString)
            val res: String = result.toString()
            tvMain.text = res;
            tvSec.text = value;
        })

        btAc.setOnClickListener(View.OnClickListener {
            tvMain.text = ""
            tvSec.text = ""
        })

        btC.setOnClickListener(View.OnClickListener {

            val value: String = tvMain.text.toString()
            if (value != "") {
                tvMain.text = value.substring(0, value.length - 1)
            }
        })

        bt1.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            tvMain.text = "$value("
        })

        bt2.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            tvMain.text = "$value)"
        })


        btPi.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            tvMain.text = value + pi
            tvSec.text = btPi.text
        })

        btSin.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            tvMain.text = "$value+sin"
        })


        btCos.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            tvMain.text = "$value+cos"
        })

        btTan.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            tvMain.text = "$value+tan"
        })

        btSquare.setOnClickListener(
                View.OnClickListener {
                    val value: String = tvMain.text.toString()
                    val vDouble: Double = value.toDouble()
                    val doubleResult = vDouble * vDouble
                    tvMain.text = doubleResult.toString()
                    tvSec.text = "$vDouble²"
                },
        )

        btFat.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            val valueInt = value.toInt()
            val fact: Long = findFactorial(valueInt)
            tvMain.text = fact.toString()
            tvSec.text = "$fact !"
        })

        btInv.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            tvMain.text = "$value ^ (-1)"
        })

        btLn.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            tvMain.text = "$value ln"
        })

        btLog.setOnClickListener(View.OnClickListener {
            val value: String = tvMain.text.toString()
            tvMain.text = "$value log"
        })

    }


}


fun findFactorial(num: Int): Long {
    return if (num == 1 || num == 0) {
        1
    } else {
        num * ( findFactorial(num - 1))
    }
}

private fun eval(str: String): Double {
    return object : Any() {
        var pos = -1
        var ch = 0
        fun nextChar(){
            ch = if (++pos < str.length) {
                str.indexOf(pos)
            } else -1
        }

        fun eat(charToEat: Int): Boolean {
            while (ch == ' '.toInt()) nextChar()
            if (ch == charToEat) {
                nextChar()
                return true
            }
            return false
        }

        fun parse(): Double {
            nextChar()
            val x = parseExpression()
            if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
            return x
        }

        fun parseExpression(): Double {
            var x = parseTerm()
            while (true) {
                when {
                    eat('+'.toInt()) -> x += parseTerm() // addition
                    eat('-'.toInt()) -> x -= parseTerm() // subtraction
                    else -> return x
                }
            }
        }

        fun parseTerm(): Double {
            var x = parseFactor()
            while (true) {
                when {
                    eat('*'.toInt()) -> x *= parseFactor() // multiplication
                    eat('/'.toInt()) -> x /= parseFactor() // division
                    else -> return x
                }
            }
        }

        fun parseFactor(): Double {
            if (eat('+'.toInt())) return parseFactor() // unary plus
            if (eat('-'.toInt())) return -parseFactor() // unary minus
            var x: Double
            val startPos = pos
            if (eat('('.toInt())) { // parentheses
                x = parseExpression()
                eat(')'.toInt())
            } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) { // numbers
                while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()
                x = str.substring(startPos, pos).toDouble()
            } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) { // functions
                while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                val func = str.substring(startPos, pos)
                x = parseFactor()
                x = if (func == "sqrt") sqrt(x) else if (func == "sin") sin(Math.toRadians(x)) else if (func == "cos") cos(Math.toRadians(x)) else if (func == "tan") tan(Math.toRadians(x)) else if (func == "log") Math.log10(x) else if (func == "ln") Math.log(x) else throw RuntimeException("Unknown function: $func")
            } else {
                throw RuntimeException("Unexpected: " + ch.toChar())
            }
            if (eat('^'.toInt())) x = x.pow(parseFactor()) // exponentiation
            return x
        }
    }.parse()
}

