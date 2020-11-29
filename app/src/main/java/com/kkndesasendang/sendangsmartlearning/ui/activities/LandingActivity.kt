package com.kkndesasendang.sendangsmartlearning.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kkndesasendang.sendangsmartlearning.R
import kotlinx.android.synthetic.main.activity_landing.*

class LandingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        splashScreenIcon.setOnClickListener { toSelectTopic() }
        splashScreenTitle3.setOnClickListener { toSelectTopic() }
        splashScreenIcon1.setOnClickListener { toMatch() }
        splashScreenTitle4.setOnClickListener { toMatch() }
    }

    fun toSelectTopic() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    fun toMatch() {
        startActivity(Intent(this, MatchActivity::class.java))
    }
}