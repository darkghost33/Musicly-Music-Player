package com.musiclymusicplayer.musiclymusicplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.musiclymusicplayer.musiclymusicplayer.databinding.ActivityPlaylistBinding

class PlaylistActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityPlaylistBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MusiclyMusicPlayer)
        binding = ActivityPlaylistBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}