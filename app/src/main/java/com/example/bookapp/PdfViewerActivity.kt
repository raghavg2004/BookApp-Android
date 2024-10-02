import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView
import com.example.bookapp.R // Ensure this import for your app's resources

class PdfViewerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_viewer)

        // Retrieve the PDF view from XML layout
        val pdfView: PDFView = findViewById(R.id.pdfView)

        // Load PDF from assets
        val pdfFileName = intent.getStringExtra("pdfFileName")
        pdfFileName?.let {
            pdfView.fromAsset(it)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .load()
        } ?: finish() // Close activity if no PDF file is found
    }
}
