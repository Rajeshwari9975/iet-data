package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> getAllProds();

	void deleteById(int prodId);

	Product modifyById(int prodId);

	void modifyProd(Product p);

	void addProduct(Product p);

}
