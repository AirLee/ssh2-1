package org.hyan.DAO;

import java.util.List;

import org.hyan.entity.User;

public interface UserDAO extends BaseDAO {
	public abstract List<User> findAllUsers();
	public abstract void saveUser(User user);
	public abstract void delUser(User user);
	public abstract void editUser(User user);
}
