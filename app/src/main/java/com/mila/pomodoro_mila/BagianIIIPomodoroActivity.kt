package com.mila.pomodoro_mila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BagianIIIPomodoroActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bagian_iiipomodoro)

        val btnStart: Button = findViewById(R.id.btn_start)
        btnStart.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_start -> {

                val intent = Intent(this@BagianIIIPomodoroActivity, StopwatchIIIPomodoroActivity::class.java)
                startActivity(intent)
            }
        }
    }
}