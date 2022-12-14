package com.example.spring_music_payment_1011.song.entity;

import com.example.spring_music_payment_1011.base.entity.BaseEntity;
import com.example.spring_music_payment_1011.member.entity.Member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import static javax.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor(access = PROTECTED)
public class Song extends BaseEntity {
    private String subject;
    private String content;
    @ManyToOne(fetch = LAZY)
    private Member author;
}
