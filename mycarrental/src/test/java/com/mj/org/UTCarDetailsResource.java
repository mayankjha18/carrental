package com.mj.org;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.mj.org.controller.CarDetailsResource;
import com.mj.org.dto.CarDetailsDTO;
import com.mj.org.service.CarService;

@RunWith(MockitoJUnitRunner.class)
public class UTCarDetailsResource {
	@Mock
	CarService carService;
	
	@InjectMocks
	CarDetailsResource carDetailsResource = new CarDetailsResource();
	
	@Test
	public void test_getCarDetails() {
		List<CarDetailsDTO> carDetailsList = new ArrayList<CarDetailsDTO>();
		when(carService.getCarDetails()).thenReturn(carDetailsList);
		List<CarDetailsDTO> actulaCarDetailsList = carDetailsResource.getCarDetails().getBody();
		assertEquals(carDetailsList.size(),actulaCarDetailsList.size());
		assertEquals(carDetailsList,actulaCarDetailsList);
	}
	
}
