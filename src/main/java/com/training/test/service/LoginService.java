package com.training.test.service;

import java.util.List;

import com.training.test.model.Product;
import com.training.test.model.User;


public interface LoginService {

	boolean isValidUser(String username, String password);

	List<User> getUsers();
	List<Product> getProd();
}
