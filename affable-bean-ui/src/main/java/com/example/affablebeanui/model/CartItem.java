package com.example.affablebeanui.model;

import java.time.LocalDateTime;

public record CartItem(
        Integer id,
        String name,
        Double price,
        String description,
        int quantity,
        LocalDateTime lastUpdate
) {
}
