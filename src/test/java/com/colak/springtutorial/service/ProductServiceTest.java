package com.colak.springtutorial.service;

import com.colak.springtutorial.jpa.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    void deleteAllByDescription() {
        productService.deleteAllByDescription("description1");
        List<Product> productList = productService.findAll();
        assertThat(productList).hasSize(3);

    }

    @Test
    void deleteProductsByDescription() {
        productService.deleteProductsByDescription("description2");
        List<Product> productList = productService.findAll();
        assertThat(productList).hasSize(4);
    }
}