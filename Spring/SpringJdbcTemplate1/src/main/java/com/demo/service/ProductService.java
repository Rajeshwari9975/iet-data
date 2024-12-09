package com.demo.service;

import com.demo.beans.Product;

public interface ProductService {

	void addnewproduct();

	boolean removebyid(int pid);

	boolean updateById(int pid, String desc, int price);

	Product displaybyid(int pid);

}
