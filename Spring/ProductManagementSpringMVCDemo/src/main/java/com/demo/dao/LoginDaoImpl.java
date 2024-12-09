package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.User;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User validateUser(String uname, String pwd) {
		jdbcTemplate.query("select * from user where uname = ? and password = ?",new Object[] {uname,pwd}, (rs) ->{
			if(rs.next()) {
				String unm = rs.getString(1);
				String pwd1 = rs.getString(2);
				String role = rs.getString(3);
				User user = new User(unm, pwd1, role);
				return user;
			}
			return null;
		});
		return null;
	}
	
}
