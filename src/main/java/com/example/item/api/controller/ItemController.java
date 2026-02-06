package com.example.item.api.controller;
import com.example.item.api.model.Item;
import com.example.item.api.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")

public class ItemController {
    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> addItem(@RequestBody Item item) {

        if (item.getId() == null || item.getName() == null || item.getName().isEmpty()) {
            return ResponseEntity
                    .badRequest()
                    .body("id and name are required");
        }

        return ResponseEntity.ok(service.addItem(item));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getItem(@PathVariable Long id) {

        Item item = service.getItemById(id);

        if (item == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Item not found");
        }

        return ResponseEntity.ok(item);
    }
}
