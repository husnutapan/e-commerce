package com.ecommerce.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ecommerce.model.ProductsProperty;
import com.ecommerce.service.ProductServiceImpl;

@ManagedBean
@SessionScoped
public class ProductBean {

	private String formPath;

	private ProductsProperty property = new ProductsProperty();

	public ProductBean() {

		formPath = "frm_anasayfa_default.xhtml";
	}

	public void saveProperty() {
		System.out.println("SAVING PROPERTY");
		ProductServiceImpl impl = new ProductServiceImpl();
		impl.savePropery(property);
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

	public ProductsProperty getProperty() {
		return property;
	}

	public void setProperty(ProductsProperty property) {
		this.property = property;
	}

}
