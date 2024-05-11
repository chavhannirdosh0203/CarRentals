package com.infosys.nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.nc.model.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

	//create a method to find car by carNumber
	
	public Car findByCarNumber(String carNumber);
	
	// create a method to return arrayList of cars by bookingStatus
	@Query("select c from Car c where c.bookingStatus=:bookingStatus")
	
	public Iterable<Car> findByBookingStatus (String bookingStatus);
	
	// create a method to fetch List of all cars sorted rentPerDay
	
	@Query("select c from Car order by c.rentPerDay")
	public Iterable<Car> findAllByOrderByRentPerDay();
	
	//crate a method to  return car object by CarId
	
	public Car findByCarId(Integer carId);
}
