package ru.startandroid.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.lang.Double.parseDouble
import java.lang.Math.pow
import kotlin.math.*
import android.widget.Toast



class IngeneerCalculate : AppCompatActivity(),LISTOPERATION,INGENEER {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingeneer_calculate)

    }

    override var globalsign = 0.0
    override var sign = ""

    override fun onClickOne(view: View)
    {
        pasteTextInView(this,"1",R.id.textView6,R.id.textView7)
    }

    override fun onClickTwo(view: View) {
        pasteTextInView(this,"2",R.id.textView6,R.id.textView7)
    }

    override fun onClickThree(view: View) {
        pasteTextInView(this,"3",R.id.textView6,R.id.textView7)
    }

    override fun onClickFour(view: View) {
        pasteTextInView(this,"4",R.id.textView6,R.id.textView7)
    }

    override fun onClickFive(view: View) {
        pasteTextInView(this,"5",R.id.textView6,R.id.textView7)
    }

    override fun onClickSix(view: View) {
        pasteTextInView(this,"6",R.id.textView6,R.id.textView7)
    }

    override fun onClickSeven(view: View) {
        pasteTextInView(this,"7",R.id.textView6,R.id.textView7)
    }

    override fun onClickEight(view: View) {
        pasteTextInView(this,"8",R.id.textView6,R.id.textView7)
    }

    override fun onClickNine(view: View) {
        pasteTextInView(this,"9",R.id.textView6,R.id.textView7)
    }

    override fun onClickZero(view: View) {
        pasteTextInView(this,"0",R.id.textView6,R.id.textView7)
    }

    override fun onClickPoint(view: View) {
        pastePoint(this,R.id.textView6,R.id.textView7)
    }

    override fun onClickSqrt(view: View) {
        sqrt(this,R.id.textView6,R.id.textView7)
    }

    override fun onClickPercent(view: View) {
        percent(this,R.id.textView6,R.id.textView7)
    }

    override fun onClickReverce(view: View) {
        reverce(this,R.id.textView6,R.id.textView7)
    }

    override fun onClickDelete(view: View) {
        delete(this,R.id.textView6,R.id.textView7)
    }

    override fun onClickFullDelete(view: View) {
        setTextInView(this,R.id.textView6,R.id.textView7,"","")
    }

    override fun onClickMinus(view: View) {
        minus(this,R.id.textView6,R.id.textView7)
    }

    override fun onClickPlus(view: View) {
        plus(this,R.id.textView6,R.id.textView7)
    }

    override fun onClickMultiplication(view: View) {
        multiplication(this,R.id.textView6,R.id.textView7)
    }

    override fun onClickDivision(view: View) {
        division(this,R.id.textView6,R.id.textView7)
    }

    override fun onClickSin(view: View){
       val valueSin=parseDouble(
           getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            sin(valueSin).toString(),sin(valueSin).toString())
    }
    override fun onClickCos(view:View){
        val valueCos=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            cos(valueCos).toString(),cos(valueCos).toString())
    }
    override fun onClickTan(view:View){
        val valueTan=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            tan(valueTan).toString(),tan(valueTan).toString())
    }
    override fun onClickSinH(view:View){
        val valueSinH=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            sinh(valueSinH).toString(),sin(valueSinH).toString())
    }
    override fun onClickCosH(view:View){
        val valueCosH=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            cosh(valueCosH).toString(),cosh(valueCosH).toString())
    }
    override fun onClickTanH(view:View){
        val valueTan=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            tanh(valueTan).toString(),tanh(valueTan).toString())
    }

    override fun onClickPi(view:View){
        setTextInView(this,R.id.textView6,R.id.textView7,"3.141592","3.141592")
    }
    override fun onClickExpInPow(view:View){
        val value=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            exp(value).toString(),exp(value).toString())
    }
    override fun onClickNaturalLog(view:View){
        val value=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            Math.log(value).toString(),Math.log(value).toString())
    }

    override fun onClickTenInPow(view:View){
        val value=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            pow(10.0,value).toString(),pow(10.0,value).toString())
    }
    override fun onClickSinInPow(view:View){
        val valueSin=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            pow(sin(valueSin),-1.0).toString(),pow(sin(valueSin),-1.0).toString())
    }
    override fun onClickCosInPow(view:View){
        val valueCos=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            pow(cos(valueCos),-1.0).toString(),pow(cos(valueCos),1.0).toString())
    }
    override fun onClickTanInPow(view:View){
        val valueCos=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        setTextInView(this,R.id.textView6,R.id.textView7,
            pow(cos(valueCos),-1.0).toString(),pow(cos(valueCos),1.0).toString())
    }
    override fun onClickFactorial(view:View){
        var value=parseDouble(
            getTextFromView(this,R.id.textView6).toString())
        val valueInt=value.toInt()
        val mod=value-valueInt
        if(mod!=0.0){
        val toast = Toast.makeText(this, "Type of value must be Int", Toast.LENGTH_LONG)
            toast.show()
        }
        else
        {
            var fact=1
            var result = 1..value.toInt()
            for (i in result){
             fact= fact*i
                setTextInView(this,R.id.textView6,R.id.textView7, fact.toString(),fact.toString())
        }
        }
    }
    override fun onClickEqually(view: View){
        //можно переменные объявить здесь и поьзоваться без val
       when (sign){
           "root"->{
               val string=getTextFromView(this,R.id.textView6).toString()
               val root =1/ parseDouble(string)
               val value= pow(globalsign, root).toString()
               val resultString="("+ parseDouble(string).toString()+")"+
                       "root"+"("+globalsign.toString()+")"+"="
               setTextInView(this,R.id.textView6,R.id.textView7,value,resultString)
           }
           "log"->{
               val string=getTextFromView(this,R.id.textView6).toString()
               val value= log(globalsign, parseDouble(string)).toString()
               val resultString="log"+"("+value+")"+"="
               setTextInView(this,R.id.textView6,R.id.textView7,value,resultString)
           }
           "pow"->{
               val string=getTextFromView(this,R.id.textView6).toString()
               val value= pow(globalsign, parseDouble(string)).toString()
               val resultString=globalsign.toString()+"^("+ parseDouble(string).toString()+")"+"="
               setTextInView(this,R.id.textView6,R.id.textView7,value,resultString)
           }
           "mod"->{
               val string=getTextFromView(this,R.id.textView6).toString()
               val mod= globalsign%parseDouble(string)
               val value=mod.toString()
               val resultString=globalsign.toString()+"mod"+"("+string+")"+"="
               setTextInView(this,R.id.textView6,R.id.textView7,value,resultString)
           }
           else->{
               val toast=Toast.makeText(this,"Please,input digite",Toast.LENGTH_LONG)
               toast.show()
           }
       }
    }
    //override fun onClickClose(view:View){}
    //override fun onClickOpen(view:View){}
    override fun onClickRoot(view:View)=
        if (!getTextFromView(this,R.id.textView6).equals(""))
        {
            sign="root"
            val string=getTextFromView(this,R.id.textView6).toString()
            setTextInView(this,R.id.textView6,R.id.textView7,"",string)
            globalsign= parseDouble(string)
        }
        else
        {
            val toast=Toast.makeText(this,"Please,input digite",Toast.LENGTH_LONG)
            toast.show()
        }
    override fun onClickLog(view:View)=
        if (!getTextFromView(this,R.id.textView6).equals(""))
        {
            sign="log"
            val string=getTextFromView(this,R.id.textView6).toString()
            setTextInView(this,R.id.textView6,R.id.textView7,"",string)
            globalsign= parseDouble(string)
        }
        else
        {
            val toast=Toast.makeText(this,"Please,input digite",Toast.LENGTH_LONG)
            toast.show()
        }
    override fun onClickXInPowY(view:View)=
        if (!getTextFromView(this,R.id.textView6).equals(""))
    {
        sign="pow"
        val string=getTextFromView(this,R.id.textView6).toString()
        setTextInView(this,R.id.textView6,R.id.textView7,"",string)
        globalsign= parseDouble(string)
    }
    else
        {
            val toast=Toast.makeText(this,"Please,input digite",Toast.LENGTH_LONG)
            toast.show()
        }
    override fun onClickMod(view: View)=
        if (!getTextFromView(this,R.id.textView6).equals(""))
        {
            sign="mod"
          val string=getTextFromView(this,R.id.textView6).toString()
            setTextInView(this,R.id.textView6,R.id.textView7,"",string)
            globalsign= parseDouble(string)
        }
        else
        {
             val toast=Toast.makeText(this,"Please,input digite",Toast.LENGTH_LONG)
            toast.show()
        }



}