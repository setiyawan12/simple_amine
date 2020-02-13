package com.example.workshop2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //pembuatan animasi
        val ttb = AnimationUtils.loadAnimation(this,
            R.anim.ttb
        );
        val stb = AnimationUtils.loadAnimation(this,
            R.anim.stb
        );
        val btt1 = AnimationUtils.loadAnimation(this,
            R.anim.btt1
        );
        val btt2 = AnimationUtils.loadAnimation(this,
            R.anim.btt2
        );
        val btt3 = AnimationUtils.loadAnimation(this,
            R.anim.btt3
        );
        val btn_couser = AnimationUtils.loadAnimation(this,
            R.anim.btn_couser
        );

        //
        val headertitle = findViewById(R.id.headertitle) as TextView
        val subtitle = findViewById(R.id.subtitle) as TextView
        val ic_card = findViewById(R.id.ic_cards)as ImageView
        val resultOne = findViewById(R.id.resultOne) as LinearLayout
        val resultTwo = findViewById(R.id.resultTwo) as LinearLayout
        val resultThree = findViewById(R.id.resultThree) as LinearLayout
        val btn_next_course = findViewById(R.id.btn_next_course) as Button

        //set animasi
        headertitle.startAnimation(ttb)
        subtitle.startAnimation(ttb)
        ic_card.startAnimation(stb)

        resultOne.startAnimation(btt1)
        resultTwo.startAnimation(btt2)
        resultThree.startAnimation(btt3)

        btn_next_course.startAnimation(btn_couser)

        btn_next_course.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}
