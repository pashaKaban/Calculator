package ru.startandroid.calculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.Spinner
import android.widget.TextView
import java.lang.String.valueOf

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
     fun ChooseTypeCalculate(view: View) {
        val calculateType: TextView = findViewById(R.id.textView) //as TextView
        val spinner: Spinner = findViewById(R.id.spinner)
        val valueType: String = valueOf(spinner.getSelectedItem())
        calculateType.setText(valueType)
        when(valueType) {
            "Обычный"->{
                val intent_ = Intent(this, SimpleCalculate::class.java)
                startActivity(intent_)
                }
            "Инженерный"->{
                val intent1_ = Intent(this, IngeneerCalculate::class.java)
                startActivity(intent1_)
            }
        }
    }
}
