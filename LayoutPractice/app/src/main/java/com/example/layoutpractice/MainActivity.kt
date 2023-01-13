package com.example.layoutpractice

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    //뷰 생성됐을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //그릴 xml 뷰 파일을 연결 시켜줌(설정)
        setContentView(R.layout.activity_main)

//        //로그인 버튼 뷰의 클릭 리스너 설정
//        login_btn.setOnClickListener(View.OnClickListener {
//            onLoginButtonClicked()
//        })

        login_btn.setOnClickListener {
            onLoginButtonClicked()
        }
    }

    fun onLoginButtonClicked(){
        Log.d(TAG, "MainActivity - onLoginButtonClicked() called")

        //다음화면으로
        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent)
    }
}