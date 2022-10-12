package com.example.spring_music_payment_1011.order.repository;

import com.example.spring_music_payment_1011.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
