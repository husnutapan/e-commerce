package com.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ecommerce.model.Category;
import com.ecommerce.model.SubCategory;

@ManagedBean
@SessionScoped
public class ProductBean {
	private String formPath;
	private Category category = new Category();
	private SubCategory subCategory = new SubCategory();
	private List<SubCategory> subCategories = new ArrayList<SubCategory>();

	public ProductBean() {
		formPath = "frm_anasayfa_default.xhtml";
	}

	public void addSubCategoryToList() {
		subCategories.add(subCategory);
		subCategory = new SubCategory();
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

}
