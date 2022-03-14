package com.trade4gunpla.t4gapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class User {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userId;

    @Column(nullable = false,length = 20)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false,length = 10)
    private String role;

    @OneToMany(mappedBy = "seller")
    private Set<Product> products;

}
