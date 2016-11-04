package com.ecommerce.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.context.RequestContext;

import com.ecommerce.model.Kullanici;
import com.ecommerce.service.UserServiceImpl;

@ManagedBean
@SessionScoped
public class UserBean {

	private Kullanici user;

	public boolean sessionAction = false;

	@PostConstruct
	public void initialize() {
		user = new Kullanici();
	}

	public UserBean() {

	}

	public void userLogin() {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		sessionAction = userServiceImpl.saveUser(user);

		if (sessionAction) {
			RequestContext.getCurrentInstance().update("form");
		}
	}

	public Kullanici getUser() {
		return user;
	}

	public void setUser(Kullanici user) {
		this.user = user;
	}

}
