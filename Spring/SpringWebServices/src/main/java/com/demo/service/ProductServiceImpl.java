package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDao pdao;
	
	@Override
	public List<Product> getAll() {
		return pdao.findAllProds();
	}

	@Override
	public boolean addnewproduct(Product p) {
		// TODO Auto-generated method stub
		return pdao.addnewproduct(p);
	}

}
