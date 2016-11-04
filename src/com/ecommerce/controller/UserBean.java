package com.ecommerce.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.context.RequestContext;

import com.ecommerce.model.User;

@ManagedBean
@SessionScoped
public class UserBean {

	private User user;

	@PostConstruct
	public void initialize() {
		user = new User();
	}

	public UserBean() {

	}

	public void userLogin() {
		System.out.println(user.getEmail());
		
		// UPDATE FORM ON BEAN
		RequestContext.getCurrentInstance().update("form");
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
