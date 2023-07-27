package com.example.transporationservice.controller;

import com.example.transporationservice.dao.CartItemDao;
import com.example.transporationservice.service.CartItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transport")
public class TransportationController {
    private final CartItemService cartItemService;
    private final CartItemDao cartItemDao;

    //http://localhost:9000/transport/cart/save
    @GetMapping("/cart/save")
    public ResponseEntity<?> saveCartItems(){
        cartItemService.getAllCartItems()
                .subscribe(data -> {
                    data.forEach(c -> cartItemDao.save(c));
                });
        return ResponseEntity.status(HttpStatusCode.valueOf(201))
                .body("successfully created.");
    }

}
