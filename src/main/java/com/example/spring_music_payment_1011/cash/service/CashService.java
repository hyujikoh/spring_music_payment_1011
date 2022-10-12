package com.example.spring_music_payment_1011.cash.service;

import com.example.spring_music_payment_1011.cash.entity.CashLog;
import com.example.spring_music_payment_1011.cash.repository.CashLogRepository;
import com.example.spring_music_payment_1011.member.entity.Member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CashService {
    private final CashLogRepository cashLogRepository;

    public CashLog addCash(Member member, long price, String eventType) {
        CashLog cashLog = CashLog.builder()
                .member(member)
                .price(price)
                .eventType(eventType)
                .build();

        cashLogRepository.save(cashLog);

        return cashLog;
    }
}
