package com.indi.msgshareapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.indi.msgshareapp.R
import com.indi.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
        btnShowToast.setOnClickListener {
            Log.i("MainActivity","Button Was Clicked !")
            showToast("Button was Clicked !")
        }
        btnSendMsgToNextActivity.setOnClickListener {
            Log.i("MainActivity","Second Button Was Clicked !")
            val message: String = etUserMessage.text.toString()
            //Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message",message)
            startActivity(intent)
        }
        btnShareToOtherApps.setOnClickListener{
            val message: String = etUserMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Share with"))
        }
        btnShowRecyclerView.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            //intent.putExtra("user_message",message)
            startActivity(intent)
        }
    }
}
