package com.mj.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mj.org.dto.CarDetailsDTO;
import com.mj.org.service.CarService;


@RestController
@RequestMapping("/api/carrental")
public class CarDetailsResource {
	
	@Autowired
	CarService carService;
	
	@RequestMapping(value = "/cardetails", method = RequestMethod.GET)
	public ResponseEntity<List<CarDetailsDTO>> getCarDetails(){
		List<CarDetailsDTO> carDetailsList = carService.getCarDetails();
		return new ResponseEntity(carDetailsList, HttpStatus.OK);
	}

}
