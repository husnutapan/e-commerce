package com.ecommerce.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ecommerce.model.Brand;
import com.ecommerce.model.Category;
import com.ecommerce.model.Product;
import com.ecommerce.util.HibernateUtil;

public class ProductDAOImpl implements ProductDAO {

	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public void saveAllCategory(Category category) {
		session.getTransaction().begin();
		session.save(category);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Category> getAllCategories() {
		Query query = session.createQuery("from Category");
		List list = query.getResultList();
		List<Category> categories = list;
		return categories;
	}

	public void saveProduct(Product product) {
		session.getTransaction().begin();
		session.save(product);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void saveBrand(Brand brand) {
		session.getTransaction().begin();
		session.save(brand);
		session.getTransaction().commit();
		session.close();
	}

	public Brand getBrandById(int id) {
		Query<Brand> query = session.createQuery("from Brand WHERE id=:id");
		query.setInteger("id", id);
		Brand brand = query.getSingleResult();
		return brand;

	}

	@Override
	public List<Brand> getAllBrandList() {
		Query query = session.createQuery("from Brand");
		List list = query.getResultList();
		List<Brand> brands = list;
		return brands;
	}

}
