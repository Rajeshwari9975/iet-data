package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao pdao;
	
	@Override
	public List<Product> getAllProds() {
		return pdao.getAllProds();
	}

	@Override
	public void deleteById(int prodId) {
		pdao.deleteById(prodId);
	}

	@Override
	public Product updateById(int prodId) {
		return pdao.modifyById(prodId);
	}

	@Override
	public void modifypProduct(Product p) {
		pdao.modifyProd(p);
	}

	@Override
	public void addProduct(Product p) {
		pdao.addProduct(p);
	}

}
