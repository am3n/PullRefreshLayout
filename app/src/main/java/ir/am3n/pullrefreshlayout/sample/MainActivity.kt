package ir.am3n.pullrefreshlayout.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.postDelayed
import ir.am3n.pullrefreshlayout.PullRefreshLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prl = findViewById<PullRefreshLayout>(R.id.prl)

        prl?.setOnRefreshListener {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
            prl.setRefreshing(false)
            //prl.postDelayed(1000) { prl.setRefreshing(false) }
        }

    }

}