package com.taolele.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<String> getAllProducts() {
        return Arrays.asList("Vase", "Plate", "Bowl");
    }

    @PostMapping
    public String createProduct(@RequestBody String product) {
        return "Product created: " + product;
    }
}
