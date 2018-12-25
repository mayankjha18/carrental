package com.mj.org.repository.Impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mj.org.model.CarDetails;
import com.mj.org.repository.CarDao;

@Repository
public class CarDaoImpl implements CarDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<CarDetails> getCarDetails() {
		Session session = sessionFactory.openSession();
		String hql = "FROM CarDetails";
		TypedQuery<CarDetails> query = session.createQuery(hql);

		List<CarDetails> carDetailsList = query.getResultList();
		session.close();
		return carDetailsList;
	}
}
