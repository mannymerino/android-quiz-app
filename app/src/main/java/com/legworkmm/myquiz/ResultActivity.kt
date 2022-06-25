package com.legworkmm.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tvName)
        val tvScore: TextView = findViewById(R.id.tvScore)
        val btnFinish: Button = findViewById(R.id.btnFinish)

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val score = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val total = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        "Your score is $score out of $total".also { tvScore.text = it }
    }
}