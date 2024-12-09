package com.demo.Product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Product.beans.Product;
import com.demo.Product.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao pdao;

	@Override
	public List<Product> getAllProds() {
		
		return pdao.findAll();
	}

	@Override
	public void deleteById(int prodId) {
		pdao.deleteById(prodId);
	    return ;
	}

	@Override
	public Product updateById(int prodId) {
		
		return pdao.getById(prodId);
	}

	@Override
	public void modifypProduct(Product p) {
		pdao.save(p);
		
	}

	@Override
	public void addProduct(Product p) {
		pdao.save(p);
		
	}

}
