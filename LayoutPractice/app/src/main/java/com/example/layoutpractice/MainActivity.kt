package com.example.layoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    //뷰 생성됐을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //그릴 xml 뷰 파일을 연결 시켜줌(설정)
        setContentView(R.layout.activity_main)
    }
}