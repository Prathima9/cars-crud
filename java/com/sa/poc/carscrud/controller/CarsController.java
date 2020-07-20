package com.sa.poc.carscrud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa.poc.carscrud.AuthenticationBean;
import com.sa.poc.carscrud.entities.Car;
import com.sa.poc.carscrud.services.CarService;
import com.sa.poc.carscrud.services.UserService;

@RestController
@RequestMapping("/api/v1")
public class CarsController {

	@Autowired
	CarService carService;

	@Autowired
	UserService userService;

	@GetMapping("/cars")
	public ResponseEntity<List<Car>> getAllcars() {
		return ResponseEntity.ok().body(carService.findAllCars());
	}

	@GetMapping("/cars/{id}")
	public ResponseEntity<Car> getCarById(@PathVariable(value = "id") Long carId) throws Exception {
		Car car = carService.findCarById(carId);
		return ResponseEntity.ok().body(car);
	}

	@PostMapping("/cars")
	public Car createCar(@Valid @RequestBody Car car) {
		return carService.addCar(car);
	}

	@PutMapping("/cars/{id}")
	public ResponseEntity<Car> updatecar(@PathVariable(value = "id") Long carId, @Valid @RequestBody Car carDetails)
			throws Exception {
		Car updatedcar = carService.editCar(carId, carDetails);
		return ResponseEntity.ok(updatedcar);
	}

	@DeleteMapping("/cars/{id}")
	public Map<String, Boolean> deletecar(@PathVariable(value = "id") Long carId) throws Exception {
		carService.deleteCar(carId);
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	@GetMapping(path = "/basicauth")
	public AuthenticationBean authdBean(@RequestHeader("usercred") String token) throws Exception {
		boolean isValid = userService.isValidToken(token);
		if (isValid) {
			return new AuthenticationBean("You are authenticated");
		} else {
			throw new Exception("Authenticated failed");
		}

	}

}
