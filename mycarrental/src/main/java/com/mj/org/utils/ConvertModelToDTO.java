package com.mj.org.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.mj.org.dto.CarDetailsDTO;
import com.mj.org.model.CarDetails;

@Component
public class ConvertModelToDTO {
	
	public List<CarDetailsDTO> convertFromCarDetailsDTO(List<CarDetails> carDetailsList){
		List<CarDetailsDTO> carDetailsDTOList = new ArrayList<CarDetailsDTO>();
		for (Object source : carDetailsList) {
			CarDetailsDTO target = new CarDetailsDTO();
			BeanUtils.copyProperties(source, target);

			carDetailsDTOList.add(target);
		}
		return carDetailsDTOList;
	}
}
