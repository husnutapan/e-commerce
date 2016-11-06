package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dao.ProductDAOImpl;
import com.ecommerce.model.Brand;
import com.ecommerce.model.Category;

public class ProductServiceImpl implements ProductService {

	@Override
	public void saveAllCategory(Category category) {
		ProductDAOImpl productDAOImpl = new ProductDAOImpl();
		productDAOImpl.saveAllCategory(category);
	}

	@Override
	public List<Category> getAllCategories() {
		ProductDAOImpl daoImpl = new ProductDAOImpl();

		return daoImpl.getAllCategories();
	}

	@Override
	public void saveBrand(Brand brand) {
		ProductDAOImpl daoImpl = new ProductDAOImpl();
		daoImpl.saveBrand(brand);
	}

}
