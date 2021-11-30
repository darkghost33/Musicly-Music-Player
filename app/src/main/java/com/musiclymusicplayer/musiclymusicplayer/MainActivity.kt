package com.musiclymusicplayer.musiclymusicplayer

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.musiclymusicplayer.musiclymusicplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MusiclyMusicPlayer)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.shuffleBtn.setOnClickListener { Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show() }
    }
}