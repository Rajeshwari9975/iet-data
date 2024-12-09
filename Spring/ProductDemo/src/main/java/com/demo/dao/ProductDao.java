package com.demo.dao;

import com.demo.beans.Product;

public interface ProductDao {

	int save(Product p);

	void deleteProductById(int prodId);

	void display();

}
