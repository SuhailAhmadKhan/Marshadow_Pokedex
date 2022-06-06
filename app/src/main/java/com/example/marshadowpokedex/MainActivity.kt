package com.example.marshadowpokedex

import android.media.MediaPlayer
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt = findViewById<ImageButton>(R.id.cryMarshadow)
        bt.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(this, R.raw.marshadow)
            mediaPlayer.start()
            val myToast= Toast.makeText(applicationContext,"Marshadow's cry is now playing!",Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER,200,200)
            myToast.show()
        }
        val btn = findViewById<Button>(R.id.buttonno)
        btn.setOnClickListener{
            val myToast1= Toast.makeText(applicationContext,"Bad Opinion!",Toast.LENGTH_SHORT)
            myToast1.show()
        }
        val btn1 = findViewById<Button>(R.id.button)
        btn1.setOnClickListener{
            val myToast2= Toast.makeText(applicationContext,"Good Opinion!",Toast.LENGTH_SHORT)
            myToast2.show()
        }

        }
    }
