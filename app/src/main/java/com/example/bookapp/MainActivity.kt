package com.example.bookapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val semester1Button: Button = findViewById(R.id.semester1Button)
        semester1Button.setOnClickListener {
            val intent = Intent(this, SemesterActivity::class.java)
            intent.putExtra("semester", "Semester 1")
            startActivity(intent)
        }

        // Repeat for other semesters...
    }
}
