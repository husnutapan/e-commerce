package com.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ecommerce.model.Brand;
import com.ecommerce.model.Category;
import com.ecommerce.model.SubCategory;
import com.ecommerce.service.ProductServiceImpl;

@ManagedBean
@SessionScoped
public class ProductBean {
	private String formPath;
	private Category category = new Category();
	private SubCategory subCategory = new SubCategory();
	private List<SubCategory> subCategories = new ArrayList<SubCategory>();

	private Brand brand = new Brand();

	private List<Brand> brandList = new ArrayList<Brand>();

	public ProductBean() {

		formPath = "frm_anasayfa_default.xhtml";

		ProductServiceImpl impl = new ProductServiceImpl();
		impl.getAllCategories();
		brandList = impl.getAllBrandList();

		System.out.println(brandList.get(0).getBrandName());

	}

	public void saveBrand() {
		ProductServiceImpl impl = new ProductServiceImpl();
		impl.saveBrand(brand);
	}

	public void addSubCategoryToList() {
		subCategories.add(subCategory);
		subCategory = new SubCategory();
	}

	public void addAllCategory() {
		category.setSubCategories(subCategories);
		ProductServiceImpl impl = new ProductServiceImpl();
		impl.saveAllCategory(category);
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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public List<Brand> getBrandList() {
		return brandList;
	}

	public void setBrandList(List<Brand> brandList) {
		this.brandList = brandList;
	}

}
