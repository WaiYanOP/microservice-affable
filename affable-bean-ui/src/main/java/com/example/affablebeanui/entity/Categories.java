package com.example.affablebeanui.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categories {
    private List<Category> categories;

    public Categories(Spliterator<Category> iterable) {
        categories = StreamSupport.stream(iterable,false)
                .collect(Collectors.toList());

    }
}
