package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
                listOf(box_one, box_two, box_three, box_four, box_five, red_button, green_button, yellow_button)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        val color = when(view.id) {
            R.id.box_one -> R.color.my_darkgray
            R.id.box_two -> R.color.my_gray

            R.id.box_three -> R.color.my_green
            R.id.box_four -> R.color.my_blue
            R.id.box_five -> R.color.my_red

            R.id.green_button -> R.color.my_green
            R.id.red_button -> R.color.my_red
            R.id.yellow_button -> R.color.my_yellow

            else -> R.color.my_purple
        }
        view.setBackgroundResource(color)
    }
}
