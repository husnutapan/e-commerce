package com.ecommerce.service;

import com.ecommerce.dao.ProductDAOImpl;
import com.ecommerce.model.ProductsProperty;

public class ProductServiceImpl implements ProductService {

	@Override
	public void savePropery(ProductsProperty property) {
		ProductDAOImpl daoImpl = new ProductDAOImpl();
		daoImpl.savePropery(property);
	}

}
