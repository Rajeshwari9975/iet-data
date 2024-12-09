package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

	@Override
	public void deleteById(int prodId) {
		jdbcTemplate.update("delete from product where prodid = ?", new Object[] {prodId});
	}

	@Override
	public Product modifyById(int prodId) {
		Product p = jdbcTemplate.queryForObject("select * from product where prodid = ?", new Object[] {prodId}, BeanPropertyRowMapper.newInstance(Product.class));
		return p;
	}

	@Override
	public void modifyProd(Product p) {
		jdbcTemplate.update("update product set DESCRIP = ?, price = ? where prodid = ?", new Object[] {p.getDesc(),p.getPrice(),p.getProdId()});
	}

	@Override
	public void addProduct(Product p) {
		jdbcTemplate.update("insert into product values(?,?,?)", new Object[] {p.getProdId(),p.getDesc(),p.getPrice()});
	}
	
}
