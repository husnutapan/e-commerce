package com.ecommerce.service;

import com.ecommerce.dao.UserDAOImpl;
import com.ecommerce.model.Kullanici;

public class UserServiceImpl implements UserService {

	@Override
	public boolean saveUser(Kullanici user) {
		UserDAOImpl userDAOImpl = new UserDAOImpl();
		return userDAOImpl.saveUser(user);
	}

}
