package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Car;
import com.example.mapper.CarMapper;

@Service
public class CarService {
	private final CarMapper carMapper;
	
	@Autowired
	public CarService(CarMapper carMapper) {
		this.carMapper=carMapper;
	}
	public List<Car> findAll(){
		return this.carMapper.findAll();
	}
}
