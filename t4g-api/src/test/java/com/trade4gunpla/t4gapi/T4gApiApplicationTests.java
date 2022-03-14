package com.trade4gunpla.t4gapi;

import com.trade4gunpla.t4gapi.entity.Product;
import com.trade4gunpla.t4gapi.entity.ProductGrade;
import com.trade4gunpla.t4gapi.entity.User;
import com.trade4gunpla.t4gapi.repository.ProductGradeRepository;
import com.trade4gunpla.t4gapi.repository.ProductRepository;
import com.trade4gunpla.t4gapi.service.TestDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@SpringBootTest(
		properties = {"spring.jpa.show-sql=true","spring.jpa.format_sql=true"}
)
class T4gApiApplicationTests {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductGradeRepository productGradeRepository;

	@Autowired
	TestDataService testDataService;

    @Test
    @Transactional
    void testProductRepo() {
		testDataService.testData();

		List<Product> lstProduct = productRepository.findAll();

        for (Product p:lstProduct) {
            p.getGrade();
            p.getSeller();
        }
    }

}
