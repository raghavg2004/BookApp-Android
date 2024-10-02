package com.example.bookapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SemesterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_semester)

        val pdfButton: Button = findViewById(R.id.pdfButton)
        pdfButton.setOnClickListener {
            val intent = Intent(this, PdfViewerActivity::class.java)
            intent.putExtra("pdfFileName", "sample.pdf")
            startActivity(intent)
        }

        // Add more buttons for each book/note in the semester...
    }
}
