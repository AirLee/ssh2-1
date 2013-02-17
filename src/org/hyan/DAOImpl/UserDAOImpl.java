package org.hyan.DAOImpl;

import java.util.List;

import org.hyan.DAO.UserDAO;
import org.hyan.entity.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public List<User> findAllUsers() {
		String query = "FROM User";
		List<User> list = getHibernateTemplate().find(query);
		return list;
	}

	@Override
	public void saveUser(User user) {
		  	getHibernateTemplate().saveOrUpdate(user);
	}

	@Override
	public void delUser(User user) {
		
		
	}

	@Override
	public void editUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
}
