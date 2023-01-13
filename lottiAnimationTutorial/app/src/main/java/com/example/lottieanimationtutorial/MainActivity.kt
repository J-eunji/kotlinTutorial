package com.example.lottieanimationtutorial

import android.animation.ValueAnimator
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    var isLiked: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        isLiked = false

        like_btn.setOnClickListener {
            //좋아요 버튼 toggle
            if (isLiked == false) {
                //애니메이션 커스텀
                // onFloat(0% - 50% 실행).setDuration(실행시간ms)
                val animator = ValueAnimator.ofFloat(0f, 0.5f).setDuration(500)
                animator.addUpdateListener { animation: ValueAnimator ->
                    like_btn.setProgress(
                        animation.getAnimatedValue() as Float
                    )
                }
                animator.start()
                isLiked = true

            } else {
                //애니메이션 커스텀
                // onFloat(50% - 100% 실행).setDuration(실행시간ms)
                val animator = ValueAnimator.ofFloat(0.5f, 1f).setDuration(300)
                animator.addUpdateListener { animation: ValueAnimator ->
                    like_btn.setProgress(
                        animation.getAnimatedValue() as Float
                    )
                }
                animator.start()
                isLiked = false
            }
            Log.d(TAG, "MainActivity onCreate() / 좋아요 버튼이 클릭되었다. isLiked : $isLiked")
        }
    }
}