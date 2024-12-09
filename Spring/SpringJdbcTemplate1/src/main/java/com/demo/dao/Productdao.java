package com.demo.dao;

import com.demo.beans.Product;

public interface Productdao {

	void save(Product p);

	boolean deleteById(int pid);

	boolean modifybyid(int pid, String desc, int price);

	Product dispalybyid(int pid);


}
