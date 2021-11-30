package com.musiclymusicplayer.musiclymusicplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.musiclymusicplayer.musiclymusicplayer.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityPlayerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MusiclyMusicPlayer)
        binding = ActivityPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}