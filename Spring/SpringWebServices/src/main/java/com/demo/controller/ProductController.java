package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.Product;
import com.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService pservice;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> plist = pservice.getAll();
		return plist;
	}
	@PostMapping("/addnewproduct")
	public ResponseEntity<String> addnewproduct(@RequestBody Product p){
		boolean status= pservice.addnewproduct(p);
		if(status) {
			return ResponseEntity.ok("Data Add successfully");
		}
		else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
			
		}
	}
	
	

}
