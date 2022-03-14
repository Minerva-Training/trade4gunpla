package com.trade4gunpla.t4gapi.repository;

import com.trade4gunpla.t4gapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
