package com.ecommerce.test;

import com.ecommerce.dao.ProductDAOImpl;
import com.ecommerce.model.Brand;
import com.ecommerce.model.Product;

public class Main {

	public static void main(String[] args) {
		// Brand brand = new Brand("b1");
		// Product product = new Product("p1", 200, brand);
		// Product product2 = new Product("p2", 400, brand);
		// Product product3 = new Product("p3", 500, brand);
		//
		// ProductDAOImpl daoImpl = new ProductDAOImpl();
		// daoImpl.saveProduct(product);
		// daoImpl.saveProduct(product2);
		// daoImpl.saveProduct(product3);

		ProductDAOImpl daoImpl = new ProductDAOImpl();

		Brand brand = daoImpl.getBrandById(26);

		Product product = new Product("Product2", 2000, brand);

		daoImpl.saveProduct(product);

	}

}
