package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.Car;

@Mapper
public interface CarMapper {
	public List<Car>findAll();
}
