package com.example.testApis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testApis.entitys.Product;

public interface ProductsDAO extends JpaRepository<Product, Long>{

	
}
