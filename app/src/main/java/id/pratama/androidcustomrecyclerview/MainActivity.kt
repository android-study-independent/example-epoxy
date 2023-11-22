package id.pratama.androidcustomrecyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import id.pratama.androidcustomrecyclerview.sampleepoxy.EpoxyActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btnEpoxy)

        btn.setOnClickListener {
            startActivity(Intent(this, EpoxyActivity::class.java))
        }
    }
}