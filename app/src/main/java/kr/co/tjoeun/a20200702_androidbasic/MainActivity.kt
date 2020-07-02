package kr.co.tjoeun.a20200702_androidbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        세번째 액티비티로 닉네임 변경하러 가기

        changeNickNameBtn.setOnClickListener {

//            다른 화면으로 이동: Intent
            val myIntent = Intent(this, EditNickNameActivity::class.java)

//            이동 출발 : startActivityForResult => 결과를 가지러 이동.
//            어떤 결과를 얻으러 가는지? 고유 번호로 구별.
            startActivityForResult(myIntent,1000)

        }

//        두번째 액티비티로 데이터 전달하기
        sendToSecond.setOnClickListener {

            val inputMessage = messageEdt.text.toString()

//            입력한 고유 번호 Int로 받기
            val inputNum = numberEdt.text.toString().toInt()

//            비행기 티켓 발권
            val myIntent = Intent(this, SecondActivity::class.java)

//          티켓정보 이용해 데이터(수하물) 첨부

            myIntent.putExtra("message", inputMessage)

//            추가로 정수 첨부

            myIntent.putExtra("number",inputNum)

//            탑승. 출발
            startActivity(myIntent)


        }


        moveToFirstBtn.setOnClickListener {

//            Intent로 다른 액티비비로 이동. => 비행기로 여행.

//            Intent() => JAVA : new Intent() => 객체화

//            비행기 티켓 발권

            val myIntent = Intent(this, first::class.java)

//            실제 이동 처리

             startActivity(myIntent)
        }


    }
}