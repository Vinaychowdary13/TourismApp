package com.example.tourism
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class famousplace : AppCompatActivity() {
    lateinit var Ps: Button
    lateinit var dh: Button
    lateinit var db: Button
    lateinit var ny: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_famousplace)
        Ps = findViewById(R.id.paris)
        dh=findViewById(R.id.delhi)
        db=findViewById(R.id.dubai)
        ny=findViewById(R.id.newyork)
        Ps.setOnClickListener{
            val intent=Intent(this,dparis::class.java)
            startActivity(intent)
        }
        dh.setOnClickListener{
            val intent=Intent(this,ddelhi::class.java)
            startActivity(intent)
        }
        db.setOnClickListener{
            val intent=Intent(this,dubai::class.java)
            startActivity(intent)
        }
        ny.setOnClickListener{
            val intent=Intent(this,newyork::class.java)
            startActivity(intent)
        }
    }
    override fun onDestroy() {
        // Release resources, close connections, or perform cleanup here
        super.onDestroy()
    }
}