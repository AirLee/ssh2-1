package org.hyan.service;

import java.util.List;

import org.hyan.DAO.BaseDAO;
import org.hyan.entity.User;

public interface UserService extends BaseDAO {
	public abstract List<User> findAllUsers();
	public abstract void saveUser(User user);
}
