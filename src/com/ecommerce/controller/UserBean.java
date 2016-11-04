package com.ecommerce.controller;

import javax.annotation.PostConstruct;

import com.ecommerce.model.User;

public class UserBean {

	private User user;

	@PostConstruct
	public void initialize() {
		user = new User();
	}

	public UserBean() {

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
