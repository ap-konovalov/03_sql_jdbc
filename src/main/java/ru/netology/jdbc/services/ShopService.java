package ru.netology.jdbc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.jdbc.repositories.ShopRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopService {

    private final ShopRepository shopRepository;

    public List<String> getProductName(String name) {
        return shopRepository.getProductName(name);
    }
}
