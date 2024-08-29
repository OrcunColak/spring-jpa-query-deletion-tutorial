package com.colak.springtutorial.service;

import com.colak.springtutorial.jpa.Product;
import com.colak.springtutorial.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public List<Product> findAll () {
        return productRepository.findAll();
    }
    @Transactional
    public void deleteAllByDescription(String description) {
        productRepository.deleteAllByDescription(description);
    }

    @Transactional
    public void deleteProductsByDescription(String description) {
        productRepository.deleteProductsByDescription(description);
    }
}
