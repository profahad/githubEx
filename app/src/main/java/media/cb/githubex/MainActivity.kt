package media.cb.githubex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        // Edit By Fahad
        Toast.makeText(this, "Here we go", Toast.LENGTH_SHORT).show()

        // Edit By Numan
        displayToast("I'm Numan")

    }

    fun displayToast(message:String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}