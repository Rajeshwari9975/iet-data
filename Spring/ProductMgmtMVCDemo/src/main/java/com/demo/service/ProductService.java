package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	List<Product> getAllProds();

	void deleteById(int prodId);

	Product updateById(int prodId);

	void modifypProduct(Product p);

	void addProduct(Product p);

}
