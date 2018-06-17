package com.example.ouss.firstekotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import kotlinx.android.synthetic.main.activity_main.*
import  java.util.Calendar



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

oussama.setOnClickListener({
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
    var month:Int=Calendar.getInstance().get(Calendar.MONTH)
    //var day:Int=Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    var birsday:List<String> = emptyList()



    try {
        birsday = editText.text!!.toString().split("/", ".", "-")


        if (month < birsday[1].toInt()) {
            var yourAgeIs: String = "you have " + (year - birsday[2]!!.toInt() - 1).toString() + " years " //+ (month-birsday[1]!!.toInt()).toString() + " month "
            textView2.setText(yourAgeIs)
        } else {
            var yourAgeIs: String = "you have " + (year - birsday[2]!!.toInt()).toString() + " years " //+ (month-birsday[1]!!.toInt()).toString() +" month "
            textView2.setText(yourAgeIs)
        }

    }catch (e:Exception){
        Toast.makeText(this,"check your age",Toast.LENGTH_LONG).show()
    }
})


    }



   /* fun click(v:View) {

        var year: Int = Calendar.getInstance().get(Calendar.YEAR)

        var birsday = editText.text!!.toString()!!.toInt()

        textView2.setText((year - birsday)!!.toString())
    }*/
}
