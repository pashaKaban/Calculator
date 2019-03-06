package ru.startandroid.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.lang.Double.parseDouble
import kotlin.math.sqrt
import kotlin.text.StringBuilder


class SimpleCalculate : AppCompatActivity(),LISTOPERATION {
    //override обязательно.0

    override var globalsign = 0.0
    override var sign = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_calculate)
    }

    override fun onClickOne(view: View)
    {
        pasteTextInView(this,"1",R.id.textView2,R.id.textView3)
    }

    override fun onClickTwo(view: View) {
        pasteTextInView(this,"2",R.id.textView2,R.id.textView3)
    }

    override fun onClickThree(view: View) {
        pasteTextInView(this,"3",R.id.textView2,R.id.textView3)
    }

    override fun onClickFour(view: View) {
        pasteTextInView(this,"4",R.id.textView2,R.id.textView3)
    }

    override fun onClickFive(view: View) {
        pasteTextInView(this,"5",R.id.textView2,R.id.textView3)
    }

    override fun onClickSix(view: View) {
        pasteTextInView(this,"6",R.id.textView2,R.id.textView3)
    }

    override fun onClickSeven(view: View) {
        pasteTextInView(this,"7",R.id.textView2,R.id.textView3)
    }

    override fun onClickEight(view: View) {
        pasteTextInView(this,"8",R.id.textView2,R.id.textView3)
    }

    override fun onClickNine(view: View) {
        pasteTextInView(this,"9",R.id.textView2,R.id.textView3)
    }

    override fun onClickZero(view: View) {
        pasteTextInView(this,"0",R.id.textView2,R.id.textView3)
    }

    override fun onClickPoint(view: View) {
        pastePoint(this,R.id.textView2,R.id.textView3)
    }

    override fun onClickSqrt(view: View) {
       sqrt(this,R.id.textView2,R.id.textView3)
    }

    override fun onClickPercent(view: View) {
        percent(this,R.id.textView2,R.id.textView3)
    }

    override fun onClickReverce(view: View) {
       reverce(this,R.id.textView2,R.id.textView3)
    }

    override fun onClickDelete(view: View) {
        delete(this,R.id.textView2,R.id.textView3)
    }

    override fun onClickFullDelete(view: View) {
        setTextInView(this,R.id.textView2,R.id.textView3,"","")
    }

    override fun onClickMinus(view: View) {
        minus(this,R.id.textView2,R.id.textView3)
    }

    override fun onClickPlus(view: View) {
        plus(this,R.id.textView2,R.id.textView3)
    }

    override fun onClickMultiplication(view: View) {
        multiplication(this,R.id.textView2,R.id.textView3)
    }

    override fun onClickDivision(view: View) {
        division(this,R.id.textView2,R.id.textView3)
    }

    override fun onClickEqually(view: View) {
        var strDouble = 0.0
        var calculateType: TextView = findViewById(R.id.textView2)
        val fixOperation: TextView = findViewById(R.id.textView3)
        if (!calculateType.getText().toString().equals("")) {
            var slogaemoe2 = StringBuilder(calculateType.getText().toString())
            if (slogaemoe2.indexOf(".") == 0)
                slogaemoe2 = reduct(slogaemoe2)
            if (sign.contains("-")) {

                strDouble = globalsign - parseDouble(slogaemoe2.toString())
                val formatValue = "%.2f".format(strDouble).toDouble()
                calculateType.setText(formatValue.toString())
                val stringOperationMinus = globalsign.toString() + sign + slogaemoe2 + "="
                fixOperation.setText(stringOperationMinus)
                sign = ""
            }
            if (sign.contains("+")) {
                strDouble = globalsign + parseDouble(slogaemoe2.toString())
                calculateType.setText(strDouble.toString())
                val stringOperationPlus = globalsign.toString() + sign + slogaemoe2 + "="
                fixOperation.setText(stringOperationPlus)
                sign = ""
            }
            if (sign.contains("*")) {
                strDouble = globalsign * parseDouble(slogaemoe2.toString())
                calculateType.setText(strDouble.toString())
                val stringOperationMultiplication = globalsign.toString() + sign + slogaemoe2 + "="
                fixOperation.setText(stringOperationMultiplication)
                sign = ""
            }
            if (sign.contains("/")) {
                if (parseDouble(calculateType.getText().toString()) != 0.0) {
                    strDouble = globalsign / parseDouble(slogaemoe2.toString())
                    calculateType.setText(strDouble.toString())
                    val stringOperationDivision = globalsign.toString() + sign + slogaemoe2 + "="
                    fixOperation.setText(stringOperationDivision)
                    sign = ""
                } else
                    calculateType.setText("Division on  zero")
            }
        } else{
            calculateType.setText("")
            fixOperation.setText("Input digite")
        }
    }
}



