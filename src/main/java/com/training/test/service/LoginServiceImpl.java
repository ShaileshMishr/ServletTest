package com.training.test.service;

import java.util.List;

import com.training.test.dao.LoginDao;
import com.training.test.dao.LoginDaoImpl;
import com.training.test.model.Product;
import com.training.test.model.User;



public class LoginServiceImpl implements LoginService {

	
	LoginDao dao = new LoginDaoImpl();
	@Override
	public boolean isValidUser(String username, String password) {
		
		
		boolean isValid = false;
		List<User> userList = dao.getUsers();
		
		for(User user:userList) {
			if(user.getUserName().equals(username) && user.getPassword().equals(password)) {
				isValid = true;
			}
		}
		
		return isValid;
	}

	@Override
	public List<User> getUsers() {
		List<User> userList = dao.getUsers();
		return userList;
	}

	@Override
	public List<Product> getProd() {
		List<Product> prodList = dao.getProd();
		return prodList;
	}


}
