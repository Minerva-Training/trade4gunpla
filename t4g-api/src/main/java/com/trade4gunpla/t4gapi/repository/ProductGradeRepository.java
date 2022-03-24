package com.trade4gunpla.t4gapi.repository;

import com.trade4gunpla.t4gapi.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductGradeRepository extends JpaRepository<ProductCategory, Long> {

}
