package com.mj.org.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mj.org.dto.CarDetailsDTO;
import com.mj.org.model.CarDetails;


@RestController
@RequestMapping("/api/carrental")
public class CarDetailsResource {
	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping(value = "/cardetails", method = RequestMethod.GET)
	public ResponseEntity<CarDetailsDTO> getCarDetails(){
		Session session = sessionFactory.openSession();
		String hql = "FROM CarDetails";
		Query query = session.createQuery(hql);
		List<CarDetails> carDetailsList = query.list();
		session.close();
		return new ResponseEntity(carDetailsList, HttpStatus.OK);
	}

}
