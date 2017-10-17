package textviewkotlin.ejemplo.com.exampletextviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val texview:TextView = findViewById(R.id.textview) as TextView
        val button: Button = findViewById(R.id.button) as Button
        val TAG:String = "MainActivity"
        button.setOnClickListener {
            texview.text = "Change text!!!"
        }
    }
}
