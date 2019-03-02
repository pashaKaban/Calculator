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

    protected var globalsign = 0.0
    protected var sign = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_calculate)
    }
    override fun pasteTextInView(string:String) {
        findViewById<TextView>(R.id.textView2).setText(getTextFromView().append(string))
        findViewById<TextView>(R.id.textView3).setText(getTextFromView())
    }
    override fun setTextInView(string:String,string1:String) {
        findViewById<TextView>(R.id.textView2).setText(string)
        findViewById<TextView>(R.id.textView3).setText(string1)
    }
    override fun getTextFromView():StringBuilder {
        return StringBuilder(findViewById<TextView>(R.id.textView2).getText().toString())
    }

    fun reduct(string: StringBuilder): StringBuilder {
        val st = StringBuilder("0")
        if (string.indexOf(".")==0) {
            return st.append(string)
        }
        else{
           return string.append(st)
        }
    }

    override fun onClickOne(view: View) {
        pasteTextInView("1")
    }

    override fun onClickTwo(view: View) {
        pasteTextInView("2")
    }

    override fun onClickThree(view: View) {
        pasteTextInView("3")
    }

    override fun onClickFour(view: View) {
        pasteTextInView("4")
    }

    override fun onClickFive(view: View) {
        pasteTextInView("5")
    }

    override fun onClickSix(view: View) {
        pasteTextInView("6")
    }

    override fun onClickSeven(view: View) {
        pasteTextInView("7")
    }

    override fun onClickEight(view: View) {
        pasteTextInView("8")
    }

    override fun onClickNine(view: View) {
        pasteTextInView("9")
    }

    override fun onClickZero(view: View) {
        pasteTextInView("0")
    }

    override fun onClickPoint(view: View) {
        var getText = getTextFromView()
        if (!getText.contains("."))
        {
            if (getText.indexOf(".") == 0 || getText.indexOf(".") == getText.length - 1)
            {
                getText = reduct(getText.append("."))
                findViewById<TextView>(R.id.textView2).setText(getText)
            }
            else{
                pasteTextInView(".")
            }
        }
        else{
            findViewById<TextView>(R.id.textView3).setText("Sign . already use")
        }
    }

    override fun onClickSqrt(view: View) {
        var calculateType: TextView = findViewById(R.id.textView2)
        val fixOperation: TextView = findViewById(R.id.textView3)
        if (!calculateType.getText().toString().equals("")) {
            var getTextDouble = parseDouble(calculateType.getText().toString())
            if (getTextDouble >= 0) {
                calculateType.setText(sqrt(getTextDouble).toString())
                val fixString = "sqrt(" + getTextDouble.toString() + ")="
                fixOperation.setText(fixString)
            } else
                calculateType.setText("Invalid value in square root")
        } else
            fixOperation.setText("Input digite!")
    }

    override fun onClickPercent(view: View) {
        var calculateType: TextView = findViewById(R.id.textView2)
        val fixOperation: TextView = findViewById(R.id.textView3)
        if (!calculateType.getText().toString().equals("")) {
            var getTextDouble = parseDouble(calculateType.getText().toString())
            if (getTextDouble >= 0) {
                val percent = getTextDouble / 100
                calculateType.setText(percent.toString())
                fixOperation.setText(percent.toString())

            } else
                calculateType.setText("Incorrect input value")
        } else
            fixOperation.setText("Input digite!")
    }

    override fun onClickReverce(view: View) {
        var calculateType: TextView = findViewById(R.id.textView2)
        val fixOperation: TextView = findViewById(R.id.textView3)
        if (!calculateType.getText().toString().equals("")) {
            var getTextDouble = parseDouble(calculateType.getText().toString())
            if (!getTextDouble.equals(0)) {
                val reverce = 1 / getTextDouble
                calculateType.setText(reverce.toString())
                val fixString = "1/" + getTextDouble.toString()
                fixOperation.setText(fixString)
            } else
                calculateType.setText("Invalid value in denominator")
        } else
            fixOperation.setText("Input digite!")
    }

    override fun onClickDelete(view: View) {
        var calculateType: TextView = findViewById(R.id.textView2)
        val fixOperation: TextView = findViewById(R.id.textView3)
        if (!calculateType.getText().toString().equals("")) {
            val getTextDouble = calculateType.getText().toString()
            if (!getTextDouble.equals("")) {
                var stringFormat = getTextDouble.substring(0, getTextDouble.length - 1)
                setTextInView(stringFormat,stringFormat)
            }
        } else
            fixOperation.setText("")
    }

    override fun onClickFullDelete(view: View) {
        var calculateType: TextView = findViewById(R.id.textView2)
        val fixOperation: TextView = findViewById(R.id.textView3)
        calculateType.setText("")
        fixOperation.setText("")
        //globalsign=0.0
        //sign=""
    }

    override fun onClickMinus(view: View) {
        var calculateType: TextView = findViewById(R.id.textView2)
        val fixOperation: TextView = findViewById(R.id.textView3)
        var small = calculateType.getText().toString()
        if (small == null || small.equals("")) {
            val minus = "-"
            calculateType.setText(minus)
            fixOperation.setText(minus)
        } else {
            sign = "-"
            globalsign = parseDouble(small)
            calculateType.setText("")
        }
    }

    override fun onClickPlus(view: View) {
        var calculateType: TextView = findViewById(R.id.textView2)
        val fixOperation: TextView = findViewById(R.id.textView3)
        if (!calculateType.getText().toString().equals("") && !sign.equals("")) {
            var slogaemoe1 = calculateType.getText().toString()
            sign = "+"
            globalsign = parseDouble(slogaemoe1)
            calculateType.setText("")
        } else {
            setTextInView("","Input digite")
        }
    }

    override fun onClickMultiplication(view: View) {
        var calculateType: TextView = findViewById(R.id.textView2)
        val fixOperation: TextView = findViewById(R.id.textView3)
        if (!calculateType.getText().toString().equals("")) {
            var multipl = calculateType.getText().toString()
            sign = "*"
            globalsign = parseDouble(multipl)
            calculateType.setText("")
        } else {
            calculateType.setText("")
            fixOperation.setText("Input digite!")
        }
    }

    override fun onClickDivision(view: View) {
        var calculateType: TextView = findViewById(R.id.textView2)
        val fixOperation: TextView = findViewById(R.id.textView3)
        if (!calculateType.getText().toString().equals("")) {
            var div = calculateType.getText().toString()

            sign = "/"
            globalsign = parseDouble(div)
            calculateType.setText("")
        } else {
            calculateType.setText("")
            fixOperation.setText("Input digite!")
        }
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



