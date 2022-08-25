package regexteam.product.servicetest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Log.e("test", "button clicked: ", )
            startService(Intent(this,MyService::class.java))
            startService(Intent(this,MyIntentService::class.java))
            startService(Intent(this,MyJobIntentService::class.java))
            startService(Intent(this,MyLifecycleService::class.java))

        }
    }
}



