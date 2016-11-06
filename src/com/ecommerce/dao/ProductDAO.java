package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.Brand;
import com.ecommerce.model.Category;

public interface ProductDAO {
	public void saveAllCategory(Category category);
	public List<Category> getAllCategories();
	public void saveBrand(Brand brand);
	public List<Brand> getAllBrandList();
}
