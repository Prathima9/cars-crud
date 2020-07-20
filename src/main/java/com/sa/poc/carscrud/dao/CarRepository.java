package com.sa.poc.carscrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.poc.carscrud.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
