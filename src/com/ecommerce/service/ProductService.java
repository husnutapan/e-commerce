package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Brand;
import com.ecommerce.model.Category;

public interface ProductService {
	public void saveAllCategory(Category category);

	public List<Category> getAllCategories();
	
	public void saveBrand(Brand brand);
	
	public List<Brand> getAllBrandList();

}
