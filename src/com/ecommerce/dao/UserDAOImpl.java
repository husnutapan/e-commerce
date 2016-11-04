package com.ecommerce.dao;

import org.hibernate.Session;

import com.ecommerce.model.Kullanici;
import com.ecommerce.util.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public boolean saveUser(Kullanici user) {
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return true;
	}

}
