package com.trade4gunpla.t4gapi.service;

import com.trade4gunpla.t4gapi.entity.Product;
import com.trade4gunpla.t4gapi.entity.ProductCategory;
import com.trade4gunpla.t4gapi.entity.User;
import com.trade4gunpla.t4gapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TestDataService {

    @Autowired
    ProductRepository productRepository;

    @Transactional
    public void testData(){
        ProductCategory realGrade = new ProductCategory();
        realGrade.setName("RG");
        realGrade.setDescription("Real Grade 1/144");

        ProductCategory seedSeries = new ProductCategory();
        seedSeries.setName("Seed");
        seedSeries.setDescription("Gundam Seed");

        User seller1 = new User();
        seller1.setUsername("Napan777");
        seller1.setPassword("123456");
        seller1.setRole("user");

        Product p1 = new Product();
        p1.setBrand("Bandai");
        p1.setCondition("First Hand");
        p1.setName("Freedom Gundam");
        p1.setPrice(new BigDecimal(850));
        p1.setSeller(seller1);
        p1.setStatus("available");
        p1.setCategories(List.of(realGrade,seedSeries));

        productRepository.save(p1);

    }

}
