package com.trade4gunpla.t4gapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String brand;

    @Column
    private String productDescription;

    @Column(nullable = false)
    private String condition;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private String status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seller_id", nullable = false)
    private User seller;

    @ManyToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private List<ProductCategory> categories;
}
