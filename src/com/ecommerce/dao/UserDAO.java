package com.ecommerce.dao;

import com.ecommerce.model.Kullanici;

public interface UserDAO {
	public boolean saveUser(Kullanici user);

	public int userType(Kullanici kullanici);
}
