package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> findAllProds();

	boolean addnewproduct(Product p);

}
