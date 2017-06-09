package com.example.test.myapplication

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.coroutines.experimental.EmptyCoroutineContext.plus

class MainActivity : AppCompatActivity() {

    val a = 10
    val b = 20


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //How to find a view in kotlin
        val btnsubmit = findViewById(R.id.btnSubmit) as Button
        //How to set a clicklistener on a view
        btnsubmit.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "" + addTwoNumbers(a, b), Toast.LENGTH_LONG).show()
        })

    }

    //This is How a function is written in kotlin with return type mentioned
    fun addTwoMembers(a: Int, b: Int): kotlin.Int {
        val c = a + b
        return c

    }

    //Another way to write a function with its description returning a single value
    fun addTwoNumbers(a: Int, b: Int) = a + b
}



