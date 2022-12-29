package com.example.androidlifecycle

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.androidlifecycle.databinding.ActivityMainBinding

// onPause()에서만 사용할 것이기 때문에 lateinit 사용
private lateinit var binding: ActivityMainBinding

// 메인 액티비티
class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"
    
    // 액티비티가 생성되었을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 레이아웃 설정
        setContentView(R.layout.activity_main)
        // 함수가 호출될 때 로그 확인
        Log.d(TAG, "MainActivity - onCreate() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity - onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity - onResume() called")
    }

    override fun onPause() {
        super.onPause()

        // inflate(): 메모리에 로딩된 후 .xml에 표기된 레이아웃들을 객체화시킴
        // 각기 다른 화면을 한 화면에 동적으로 띄우고싶은 경우 사용
        binding = ActivityMainBinding.inflate(layoutInflater)

        // layoute resource를 인자로 받음, 최상단 뷰에 add 됨
        // 레이아웃 xml의 내용을 파싱하여 뷰를 생성함
        setContentView(binding.root)

        binding.textView.visibility = View.VISIBLE
        binding.textView.text = "onPause()"

        Log.d(TAG, "MainActivity - onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity - onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity - onDestroy() called")
    }
}
