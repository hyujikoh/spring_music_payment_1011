package com.example.spring_music_payment_1011.base.initData;

import com.example.spring_music_payment_1011.cart.service.CartService;
import com.example.spring_music_payment_1011.member.service.MemberService;
import com.example.spring_music_payment_1011.order.service.OrderService;
import com.example.spring_music_payment_1011.product.service.ProductService;
import com.example.spring_music_payment_1011.song.service.SongService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestInitData implements InitDataBefore {
    @Bean
    CommandLineRunner initData(
            MemberService memberService,
            SongService songService,
            ProductService productService,
            CartService cartService,
            OrderService orderService) {
        return args -> {
            before(memberService, songService, productService, cartService, orderService);
        };
    }
}
