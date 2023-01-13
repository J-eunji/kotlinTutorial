package com.example.layoutpractice

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun onBackButtonClicked(view: View) {
        Log.d(TAG, "SecondActivity onBackButtonClicked() called")
        finish()
    }
}