package com.example.lab6_3

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import java.lang.Exception
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loader = CoroutineScope(Dispatchers.Default+SupervisorJob())
        loader.launch(Dispatchers.IO) {
            var result: Bitmap? = null
            try {
                val stream = URL("https://img1.goodfon.ru/original/1206x801/8/87/kot-vzglyad-uporotyy-kote.jpg").openStream()
                result = BitmapFactory.decodeStream(stream)
            }
            catch (e: Exception) {
                Log.e("Error", e.message)
            }
            loader.launch(Dispatchers.Main) {
                findViewById<ImageView>(R.id.our_image).setImageBitmap(result)
            }
        }
    }
}
