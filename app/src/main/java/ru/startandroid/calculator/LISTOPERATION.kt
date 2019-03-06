package ru.startandroid.calculator

import android.app.Activity
import android.view.View
import android.widget.TextView
import java.lang.Double.parseDouble
import kotlin.math.sqrt

interface LISTOPERATION {
     var globalsign:Double
     var sign:String

    fun reduct(string: StringBuilder): StringBuilder {
        val st = StringBuilder("0")
        if (string.indexOf(".")==0) {
            return st.append(string)
        }
        else{
            return string.append(st)
        }
    }
    fun getTextFromView(activity:Activity,id:Int):StringBuilder {
        return StringBuilder(activity.findViewById<TextView>(id).getText().toString())
    }
    fun pasteTextInView(activity: Activity,string:String,id:Int,id1:Int) {
        activity.findViewById<TextView>(id).setText(getTextFromView(activity,id).append(string))
        activity.findViewById<TextView>(id1).setText(getTextFromView(activity,id))
    }
    fun sqrt(activity: Activity,id: Int,id1: Int)
    {
        var calculateType: TextView = activity.findViewById(id)
        val fixOperation: TextView = activity.findViewById(id1)
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
    fun percent(activity: Activity,id: Int,id1: Int){
        var calculateType: TextView = activity.findViewById(id)
        val fixOperation: TextView = activity.findViewById(id)
        if (!calculateType.getText().toString().equals("")) {
            var getTextDouble = java.lang.Double.parseDouble(calculateType.getText().toString())
            if (getTextDouble >= 0) {
                val percent = getTextDouble / 100
                calculateType.setText(percent.toString())
                fixOperation.setText(percent.toString())

            } else
                calculateType.setText("Incorrect input value")
        } else
            fixOperation.setText("Input digite!")
    }
    fun reverce(activity: Activity,id: Int,id1: Int){
        var calculateType: TextView = activity.findViewById(id)
        val fixOperation: TextView = activity.findViewById(id1)
        if (!calculateType.getText().toString().equals("")) {
            var getTextDouble = java.lang.Double.parseDouble(calculateType.getText().toString())
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

    fun delete(activity: Activity,id:Int,id1:Int){
        var calculateType: TextView = activity.findViewById(id)
        val fixOperation: TextView = activity.findViewById(id1)
        if (!calculateType.getText().toString().equals("")) {
            val getTextDouble = calculateType.getText().toString()
            if (!getTextDouble.equals("")) {
                var stringFormat = getTextDouble.substring(0, getTextDouble.length - 1)
                setTextInView(activity,id,id1,stringFormat,stringFormat)
            }
        } else
            fixOperation.setText("")
    }

    fun pastePoint(activity: Activity,id:Int,id1:Int){
        var getText = getTextFromView(activity,id)
        if (!getText.contains("."))
        {
            if (getText.indexOf(".") == 0 || getText.indexOf(".") == getText.length - 1)
            {
                getText = reduct(getText.append("."))
                activity.findViewById<TextView>(id).setText(getText)
            }
            else{
                pasteTextInView(activity,".",id,id1)
            }
        }
        else{
            activity.findViewById<TextView>(R.id.textView3).setText("Sign . already use")
        }
    }

    fun multiplication(activity: Activity,id: Int,id1: Int){
        var calculateType: TextView = activity.findViewById(id)
       // val fixOperation: TextView = activity.findViewById(id1)
        if (!calculateType.getText().toString().equals("")) {
            var multipl = calculateType.getText().toString()
            sign = "*"
            globalsign = parseDouble(multipl)
            calculateType.setText("")
        } else {
            setTextInView(activity,id,id1,"","Input digite!")
        }
    }
    fun minus(activity: Activity,id: Int,id1: Int){
        var calculateType: TextView = activity.findViewById(id)
        val fixOperation: TextView = activity.findViewById(id1)
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

    fun plus(activity: Activity,id: Int,id1: Int){
        var calculateType: TextView = activity.findViewById(id)
        //val fixOperation: TextView = activity.findViewById(id1)
        if (!calculateType.getText().toString().equals("")) {
            var slogaemoe1 = calculateType.getText().toString()
            sign = "+"
            globalsign = parseDouble(slogaemoe1)
            calculateType.setText("")
        } else {
            setTextInView(activity,id,id1,"","Input digite!")
        }
    }

    fun division(activity: Activity,id: Int,id1: Int){
        var calculateType: TextView = activity.findViewById(id)
        //val fixOperation: TextView = activity.findViewById(id1)
        if (!calculateType.getText().toString().equals("")) {
            var div = calculateType.getText().toString()

            sign = "/"
            globalsign = parseDouble(div)
            calculateType.setText("")
        } else {
            setTextInView(activity,id,id1,"","Input digite!")
        }
    }
    fun setTextInView(activity: Activity,id:Int,id1:Int,string:String,string1:String)
    {
        activity.findViewById<TextView>(id).setText(string)
        activity.findViewById<TextView>(id1).setText(string1)
    }
//метод должен иметь один параметр с типом view
    fun onClickOne(view:View)
    fun onClickTwo(view:View)
    fun onClickThree(view: View)
    fun onClickFour(view:View)
    fun onClickFive(view: View)
    fun onClickSix(view:View)
    fun onClickSeven(view: View)
    fun onClickEight(view:View)
    fun onClickNine(view: View)
    fun onClickZero(view:View)
    fun onClickPoint(view: View)
    fun onClickMinus(view: View)
    fun onClickPlus(view:View)
    fun onClickPercent(view: View)
    fun onClickEqually(view:View)
    fun onClickDivision(view: View)
    fun onClickDelete(view:View)
    fun onClickMultiplication(view: View)
    fun onClickReverce(view:View)
    fun onClickFullDelete(view: View)
    fun onClickSqrt(view:View)




}