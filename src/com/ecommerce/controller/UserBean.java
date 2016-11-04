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
		// UserServiceImpl userServiceImpl = new UserServiceImpl();
		// sessionAction = userServiceImpl.saveUser(user);
		//
		// if (sessionAction) {
		// RequestContext.getCurrentInstance().update("form");
		// }
	}

	public String redirectToPage() {
		UserServiceImpl impl = new UserServiceImpl();
		int typeId = impl.userType(user);

		if (typeId == 0) {
			return "login.xhtml?faces-redirect=true";
		}

		if (typeId == 1) {
			return "adminPage.xhtml?faces-redirect=true";

		}
		if (typeId == 2) {
			return "index.xhtml?faces-redirect=true";
		}
		return "";
	}

	public Kullanici getUser() {
		return user;
	}

	public void setUser(Kullanici user) {
		this.user = user;
	}

}
