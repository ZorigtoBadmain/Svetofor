package ru.zorigtobadmain.svetofor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        red_button.setOnClickListener {
            textView.text = "Красны"
            root_layout.setBackgroundColor(resources.getColor(R.color.redColor))
        }

        yellow_button.setOnClickListener {
            textView.setText(R.string.yellow)
            root_layout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor))
        }

        green_button.setOnClickListener {
            textView.text = resources.getText(R.string.green)
            root_layout.setBackgroundColor(Color.GREEN)
        }
    }
}
