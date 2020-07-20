package com.sa.poc.carscrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.poc.carscrud.dao.CarRepository;
import com.sa.poc.carscrud.entities.Car;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepo;

	public List<Car> findAllCars() {
		return carRepo.findAll();
	}

	public Car findCarById(Long carId) throws Exception {
		Car car = carRepo.findById(carId).orElseThrow(() -> new Exception("Car not found for this id :: " + carId));
		return car;
	}

	public Car addCar(Car car) {
		return carRepo.save(car);
	}

	public Car editCar(Long carId, Car carDetails) throws Exception {
		Car car = carRepo.findById(carId).orElseThrow(() -> new Exception("car not found for this id :: " + carId));

		car.setColor(carDetails.getColor());
		car.setMake(carDetails.getMake());
		car.setModel(carDetails.getModel());
		car.setBuilddate(carDetails.getBuilddate());
		car.setNumberofdoors(carDetails.getNumberofdoors());
		car.setEnginesie(carDetails.getEnginesie());
		final Car updatedcar = carRepo.save(car);
		return updatedcar;
	}

	public void deleteCar(Long carId) throws Exception {
		Car car = carRepo.findById(carId).orElseThrow(() -> new Exception("car not found for this id :: " + carId));
		carRepo.delete(car);
	}

}
