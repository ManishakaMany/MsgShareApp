package com.indi.msgshareapp.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.indi.msgshareapp.R
import com.indi.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle = intent.extras
        val msg = bundle!!.getString("user_message")
        if (msg != null) {
            showToast(msg)
        }
        txvUserMessage.text = msg
    }
}