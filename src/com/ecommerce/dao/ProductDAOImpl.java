package com.ecommerce.dao;

import org.hibernate.Session;

import com.ecommerce.util.HibernateUtil;

public class ProductDAOImpl implements ProductDAO {

	Session session = HibernateUtil.getSessionFactory().openSession();



}
