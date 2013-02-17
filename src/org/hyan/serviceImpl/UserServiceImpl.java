package org.hyan.serviceImpl;

import java.util.List;

import org.hyan.DAO.UserDAO;
import org.hyan.entity.User;
import org.hyan.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public List<User> findAllUsers() {
		return userDAO.findAllUsers();
	}
	
	public void saveUser(User user){
		userDAO.saveUser(user);
	}
	
}
