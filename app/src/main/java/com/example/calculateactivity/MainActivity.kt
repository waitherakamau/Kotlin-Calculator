package com.example.calculateactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var btnmultiply:Button
    lateinit var btnmodulus:Button
    lateinit var etnum1:EditText
    lateinit var etnum2:EditText
    lateinit var tvresult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd = findViewById(R.id.btnadd)
        btnsubtract = findViewById(R.id.btnsubtract)
        btnmultiply = findViewById(R.id.btnmultiply)
        btnmodulus = findViewById(R.id.btnmodulus)
        etnum1 = findViewById(R.id.etnum1)
        etnum2 = findViewById(R.id.etnum2)
        tvresult = findViewById(R.id.tvresult)

        btnadd.setOnClickListener {
            var num = etnum1.text.toString().toInt()
            var num2 = etnum2.text.toString().toInt()
            addition(num, num2)
            }
            btnsubtract.setOnClickListener {
                var num = etnum1.text.toString().toInt()
                var num2 = etnum2.text.toString().toInt()
                subtraction(num,num2)
        }
        btnmultiply.setOnClickListener {
            var num = etnum1.text.toString().toInt()
            var num2 = etnum2.text.toString().toInt()
            multiplication(num,num2)
        }
        btnmodulus.setOnClickListener {
            var num = etnum1.text.toString().toInt()
            var num2 = etnum2.text.toString().toInt()
            modulus(num,num2)
        }
    }
        fun addition(num:Int,num2:Int){
            var add=num+num2
            tvresult.text=add.toString()
        }
        fun subtraction(num:Int,num2:Int){
        var subtract=num-num2
        tvresult.text=subtract.toString()

        }
        fun multiplication(num:Int,num2:Int){
        var multiply=num*num2
        tvresult.text=multiply.toString()

        }
       fun modulus(num:Int,num2:Int){
        var moduluss=num%num2
        tvresult.text=moduluss.toString()


    }

}