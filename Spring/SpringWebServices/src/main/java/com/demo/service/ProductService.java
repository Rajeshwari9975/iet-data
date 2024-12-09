package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	List<Product> getAll();

	boolean addnewproduct(Product p);

}
