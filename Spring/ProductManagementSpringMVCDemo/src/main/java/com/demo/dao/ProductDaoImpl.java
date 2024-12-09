package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> getAllProds() {
		List<Product> plist = new ArrayList<Product>();
		jdbcTemplate.query("select * from product", (rs)->{
			Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3));
			plist.add(p);
		});
		return plist;
	}
	
}
