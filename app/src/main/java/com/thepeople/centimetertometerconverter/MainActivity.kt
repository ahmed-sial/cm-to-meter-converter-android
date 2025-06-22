package com.thepeople.centimetertometerconverter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var editText: EditText
    private lateinit var textView: TextView
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        this.editText = findViewById(R.id.editText)
        this.textView = findViewById(R.id.textView)
        this.button = findViewById(R.id.convertButton)
        this.button.setOnClickListener {
            if (this.editText.text.isNotEmpty()) {
                var value = this.editText.text.toString().toDouble()
                val cmValue = value
                value /= 100
                val result = "$cmValue cm -> $value m"
                this.textView.text = result
                this.editText.text.clear()
            } else {
                Toast.makeText(baseContext, "The input field is empty! Enter some value.",
                    Toast.LENGTH_LONG).show();
            }
        }
    }
}