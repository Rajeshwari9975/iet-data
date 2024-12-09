package com.product.ProductManagement.service;

import java.util.List;

import com.product.ProductManagement.beans.Product;

public interface ProductService {

	List<Product> getAllProds();

	void deleteById(int prodId);

	Product updateById(int prodId);

	void modifypProduct(Product p);

	void addProduct(Product p);

}
