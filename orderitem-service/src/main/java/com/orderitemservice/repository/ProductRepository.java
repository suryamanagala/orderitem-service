package com.orderitemservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderitemservice.model.ProductItem;

public interface ProductRepository extends JpaRepository<ProductItem, Long >{

}
