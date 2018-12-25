package com.mj.org.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.org.dto.CarDetailsDTO;
import com.mj.org.model.CarDetails;
import com.mj.org.repository.CarDao;
import com.mj.org.service.CarService;
import com.mj.org.utils.ConvertModelToDTO;

@Service
public class CarServiceImpl implements CarService {
	@Autowired
	CarDao carDao;
	
	@Autowired
	ConvertModelToDTO convertModelToDTO;
	
	@Override
	public List<CarDetailsDTO> getCarDetails(){
		List<CarDetails> carDetailsLst = carDao.getCarDetails();
		return convertModelToDTO.convertFromCarDetailsDTO(carDetailsLst);
	}
}
