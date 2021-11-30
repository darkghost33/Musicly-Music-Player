package com.musiclymusicplayer.musiclymusicplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.musiclymusicplayer.musiclymusicplayer.databinding.ActivityFavouriteBinding

class FavouriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavouriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MusiclyMusicPlayer)
        binding = ActivityFavouriteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}