package com.ecommerce.service;

import com.ecommerce.model.Kullanici;

public interface UserService {
	public boolean saveUser(Kullanici user);
	public int userType(Kullanici kullanici);

}
