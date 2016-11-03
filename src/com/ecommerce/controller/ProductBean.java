package com.ecommerce.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProductBean {

	private String formPath;

	public ProductBean() {
		formPath = "frm_anasayfa_default.xhtml";
	}

	public void chooseCategory(int categoryId) {
		formPath = "frm_product_masters.xhtml";

		switch (categoryId) {
		case 16:
			formPath = "frm_hakkimda.xhtml";
			break;
		case 17:
			formPath = "frm_hedeflerim.xhtml";
			break;
		}
	}

	public String getFormPath() {
		return formPath;
	}

	public void setFormPath(String formPath) {
		this.formPath = formPath;
	}

}
