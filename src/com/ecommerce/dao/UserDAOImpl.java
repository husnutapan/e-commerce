package com.ecommerce.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.ecommerce.model.Kullanici;
import com.ecommerce.model.Role;
import com.ecommerce.util.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public boolean saveUser(Kullanici user) {
		user.setRole(Role.USER);
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public int userType(Kullanici kullanici) {
		Query query = session.createQuery("from Kullanici WHERE username = ? and password = ?");
		query.setString(0, kullanici.getUsername()).setString(1, kullanici.getPassword());
		List list = query.list();

		if (list.size() == 0) {
			return 0;
		}

		Kullanici kullanici2 = (Kullanici) list.get(0);

		if (kullanici2.getRole().toString().equals("ADMIN")) {
			return 1;
		}

		if (kullanici2.getRole().toString().equals("USER")) {
			return 2;
		}

		return 0;
	}

}
