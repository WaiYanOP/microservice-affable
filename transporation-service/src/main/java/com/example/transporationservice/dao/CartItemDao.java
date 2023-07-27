package com.example.transporationservice.dao;

import com.example.transporationservice.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemDao extends JpaRepository<CartItem, Integer> {
}
