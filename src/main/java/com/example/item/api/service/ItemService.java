package com.example.item.api.service;

import com.example.item.api.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private Long currentId = 0L;

    // Add new item
    public Item addItem(Item item) {
        item.setId(++currentId);
        items.add(item);
        return item;
    }

    // Get all items
    public List<Item> getAllItems() {
        return items;
    }

    // Get item by ID
    public Item getItemById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}


