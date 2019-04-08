package com.ben

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ben.utils.StringUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startBtn.setOnClickListener {
            output.setText(StringUtil.anagram(input.text.toString()))
        }
    }
}
