package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService pservice;

	@GetMapping("/showAll")
	public ModelAndView getAllProducts() {
		List<Product> plist = pservice.getAllProds();
		return new ModelAndView("showProducts", "plist", plist);
	}
	
	@GetMapping("/deleteprod/{prodId}")
	public String deleteProduct(@PathVariable int prodId) {
		pservice.deleteById(prodId);
		return "redirect:/product/showAll";
	}
	
	@GetMapping("/updateprod/{prodId}")
	public ModelAndView updateProduct(@PathVariable int prodId) {
		Product p = pservice.updateById(prodId);
		return new ModelAndView("productUpdateForm", "p", p);
	}
	
	@PostMapping("/modifyprod")
	public String modifyProduct(@ModelAttribute Product p) {
		pservice.modifypProduct(p);
		return "redirect:/product/showAll";
	}
	
	@GetMapping("/addNewProductForm")
	public String addProductPage() {
		return "addNewProduct";
	}
	
	@PostMapping("/addNewProductt")
	public String addProduct(@ModelAttribute Product p) {
		pservice.addProduct(p);
		return "redirect:/product/showAll";
	}
}
