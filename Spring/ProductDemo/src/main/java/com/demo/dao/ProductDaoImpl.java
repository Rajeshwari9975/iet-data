package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.SqlRowSetResultSetExtractor;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	@Override
	public int save(Product p) {
		int n = jdbcTemplate.update("insert into product values(?,?,?)", new Object[] {p.getProdId(),p.getDesc(),p.getPrice()});
		return n;
	}


	@Override
	public void deleteProductById(int prodId) {
		jdbcTemplate.update("delete from product where prodid = ?",prodId);
	}


//	@Override
//	public void display() {
//		
//		List<Product> plist = new ArrayList<Product>();
//		//ResultSet p = null;
//		jdbcTemplate.query("select * from product",  (ResultSet rs) ->  {
//			int pid = rs.getInt(1);
//			String desc = rs.getString(2);
//			int price = rs.getInt(3);
//			Product p1 = new Product(pid, desc, price);
//			plist.add(p1);
//		});
//		
////			while(p.next()) {
////			int pid = p.getInt(1);
////				String desc = p.getString(2);
////				int price = p.getInt(3);
////				Product p1 = new Product(pid, desc, price);
////				plist.add(p1);
////			}
//		plist.forEach(System.out::println);
//	}
	
	@Override
	public void display() {
		
		
//		jdbcTemplate.query("select * from product",  (ResultSet rs) ->  {
//			int pid = rs.getInt(1);
//			String desc = rs.getString(2);
//			int price = rs.getInt(3);
//			Product p1 = new Product(pid, desc, price);
//			plist.add(p1);
//		});
		
		List<Product> plist = new ArrayList<Product>();
			try {
				
				ResultSet p = null;
				jdbcTemplate.query("select * from product",  (ResultSet rs) -> p );
				while(p.next()) {
				int pid = p.getInt(1);
					String desc = p.getString(2);
					int price = p.getInt(3);
					Product p1 = new Product(pid, desc, price);
					plist.add(p1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		plist.forEach(System.out::println);
	}
	
	

}
