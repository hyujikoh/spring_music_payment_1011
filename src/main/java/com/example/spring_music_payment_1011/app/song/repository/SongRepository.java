package com.example.spring_music_payment_1011.app.song.repository;


import com.example.spring_music_payment_1011.app.song.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
