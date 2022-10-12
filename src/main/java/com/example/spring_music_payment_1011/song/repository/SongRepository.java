package com.example.spring_music_payment_1011.song.repository;



import com.example.spring_music_payment_1011.song.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
