package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;
@Repository
public class ProductDaoImpl implements Productdao {
	@Autowired
     JdbcTemplate jdbcTemplate;
	@Override
	public void save(Product p) {
		int n = jdbcTemplate.update("insert into product values(?,?,?)", new Object[] {p.getProdid(),p.getDesc(),p.getPrice()});
		
		
	}
	@Override
	public boolean deleteById(int pid) {
		int n = jdbcTemplate.update("delete from product where prodid=?",new Object[] {pid});
		return n>0;
	}
	@Override
	public boolean modifybyid(int pid, String desc, int price) {
		int n = jdbcTemplate.update("update product set  DESCRIP=?,price=? where prodId=?",new Object[] {desc,price,pid});
		return n>0;
	}
	@Override
	public Product dispalybyid(int pid) {
		try {
			Product p = jdbcTemplate.queryForObject("select * from product where prodid=?" ,new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
			return p;
		}catch(EmptyResultDataAccessException e) {
			System.out.println("Product not found");
			return null;
		}
			
		
		
	}

}
