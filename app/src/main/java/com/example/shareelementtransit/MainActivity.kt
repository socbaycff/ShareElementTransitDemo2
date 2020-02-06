package com.example.shareelementtransit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun chuyenAc(v: View) {

        val p1 = Pair.create<View, String>(nho, "chuyenDoiIV")
        val p2 = Pair.create<View, String>(button2, "2")
        val p3 = Pair.create<View, String>(textView, "3")

        val option =
            ActivityOptionsCompat.makeSceneTransitionAnimation(this, p1,p2,p3)


        startActivity(Intent(this,Main2Activity::class.java),option.toBundle())
    }
}
