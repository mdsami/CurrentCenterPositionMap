package br.com.simplepass.mapcentermarker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = Handler()

        handler.postDelayed({map_wrapper.animateUp()}, 2000)
        handler.postDelayed({map_wrapper.animateDown()}, 4000)

    }
}