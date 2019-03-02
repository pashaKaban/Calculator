package ru.startandroid.calculator

import android.view.View

interface LISTOPERATION {

    // по умолчанию спецификатор доступа final public
    fun onClickOne(view: View)
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
    fun getTextFromView():StringBuilder
    fun pasteTextInView(string:String)
    fun setTextInView(string:String,string1:String)



}