import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val progressText = findViewById<TextView>(R.id.progressText)
        val courseTitle = findViewById<TextView>(R.id.courseTitle)
        val milestoneTitle = findViewById<TextView>(R.id.milestoneTitle)
        val resumeButton = findViewById<Button>(R.id.resumeButton)

        // Set progress values
        val progressValue = 76 // Example progress percentage
        progressBar.progress = progressValue
        progressText.text = "$progressValue%"

        // Set Learnverse-specific details
        courseTitle.text = "Learnverse: Advanced Kotlin Programming"
        milestoneTitle.text = "Milestone 3: Mastering Android UI Design"
        resumeButton.text = "Resume Learning"
    }
}
