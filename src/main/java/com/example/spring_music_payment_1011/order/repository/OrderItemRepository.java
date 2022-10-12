package com.example.spring_music_payment_1011.order.repository;

import com.example.spring_music_payment_1011.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
