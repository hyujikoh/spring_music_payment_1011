package com.example.spring_music_payment_1011.cash.repository;

import com.example.spring_music_payment_1011.cash.entity.CashLog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CashLogRepository extends JpaRepository<CashLog, Long> {
}
