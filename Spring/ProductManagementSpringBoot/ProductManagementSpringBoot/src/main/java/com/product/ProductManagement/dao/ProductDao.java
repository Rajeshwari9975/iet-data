package com.product.ProductManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.ProductManagement.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

}
