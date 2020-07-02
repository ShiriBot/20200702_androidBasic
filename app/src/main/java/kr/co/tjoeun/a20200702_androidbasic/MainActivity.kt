package kr.co.tjoeun.a20200702_androidbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToFirstBtn.setOnClickLister {

//            Intent로 다른 액티비비로 이동. => 비행기로 여행.

//            Intent() => JAVA : new Intent() => 객체화

//            비행기 티켓 발권
            val myIntent = Intent(this, first::class.java)

//            실제 이동 처리

             startActivity(myIntent)
        }
        }

    }
}