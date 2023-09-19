package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.Car;
import com.example.service.CarService;

@Controller
public class CarController {
	private final CarService carService;

	@Autowired
	public CarController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping("/index")
	public String index(Model model) {
		List<Car> cars = this.carService.findAll();
		model.addAttribute("cars", cars);
		return "index";
	}
}
