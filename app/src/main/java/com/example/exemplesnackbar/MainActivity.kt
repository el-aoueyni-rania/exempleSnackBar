package com.example.exemplesnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var layout : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        layout = findViewById(R.id.layout)
        btn.setText("Show SnackBar message")
        btn.setOnClickListener {
            Snackbar.make(
                layout,
                R.string.snackbar,
                Snackbar.LENGTH_INDEFINITE)
                .setAction(
                    "Close" , View.OnClickListener {  }
                ).show()
        }

    }
}