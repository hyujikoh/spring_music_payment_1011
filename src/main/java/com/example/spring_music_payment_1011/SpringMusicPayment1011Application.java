package com.example.spring_music_payment_1011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringMusicPayment1011Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringMusicPayment1011Application.class, args);
    }


    // 회원 비밀번호 암호화 를 위한 메소드
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
