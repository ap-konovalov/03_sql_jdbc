package ru.netology.jdbc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc.services.ShopService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShopController {

    private final ShopService shopService;

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam String name){
        return shopService.getProductName(name);
    }
}
