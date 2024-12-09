package com.demo.Product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Product.beans.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
