package com.training.test.dao;

import java.util.List;

import com.training.test.model.Product;
import com.training.test.model.User;

public interface LoginDao {

	
	List<Product> getProd();
	
	//List<Product> setProd();

	List<User> getUsers();
	
}
