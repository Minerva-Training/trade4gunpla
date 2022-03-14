package com.trade4gunpla.t4gapi.repository;

import com.trade4gunpla.t4gapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
