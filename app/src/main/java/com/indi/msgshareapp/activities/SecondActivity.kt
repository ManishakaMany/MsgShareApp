package com.indi.msgshareapp.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.indi.msgshareapp.Constants
import com.indi.msgshareapp.R
import com.indi.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){
    companion object{
        val TAG: String? = SecondActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle = intent.extras
        bundle?.let{
            val msg = bundle.getString(Constants.USR_MSG_KEY)
            if (msg != null) {
                showToast(msg)
            }
            txvUserMessage.text = msg
        }
    }
}