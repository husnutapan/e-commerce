package com.ecommerce.dao;

import org.hibernate.Session;

import com.ecommerce.model.ProductsProperty;
import com.ecommerce.util.HibernateUtil;

public class ProductDAOImpl implements ProductDAO {

	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public void savePropery(ProductsProperty productsProperty) {
		session.beginTransaction();
		session.save(productsProperty);
		session.getTransaction().commit();
		session.close();
	}

}
