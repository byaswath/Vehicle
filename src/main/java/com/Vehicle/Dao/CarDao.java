package com.Vehicle.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.Vehicle.Entity.Car;
import com.Vehicle.Repository.CarRepository;

@Repository
public class CarDao {
	
	@Autowired
	CarRepository cr;
	

	public List<String> getAllBrandNames() {
		return cr.getAllBrandNames();
	}
	
	public List<Car> getAllCar() {
		return cr.findAll();
	}
	
	public String postOneCar(Car car) {
		cr.save(car);
		return "Posted the given Car details successfully";
	}
	
	public String postBulkCar(List<Car> car) {
		cr.saveAll(car);
		return "Posted the given Car details successfully";
	}
	
	public List<Car> getCarDetailByName(String a) {
		return cr.getCarDetailByName(a);
	}
	
	public List<Car> getPetrolCars(String b) {
		return cr.getPetrolCars(b);
	}
	
	public int getMaxCarPrice() {
		return cr.getMaxCarPrice();
	}
	
	public List<String> giveIdGetBrand(int a) {
		return cr.giveIdGetBrand(a);
	}
	
	public List<Car> getPriceBetween(int c , int d) {
		return cr.getPriceBetween(c, d);
	}
	
	public List<Car> getPriceDescending() {
		return cr.getPriceDescending();
	}
	
	public List<Object> getBrandAndIdByGivingPrice(int a) {
		return cr.getBrandAndIdByGivingPrice(a);
	}
	
	public List<Car> getSecondMax() {
		return cr.getSecondMax();
	}
	
	public List<Car> getThirdMax() {
		return cr.getThirdMax();
	}
	
	public List<Car> getPriceGreaterThan(int p) {
		return cr.getPriceGreaterThan(p);
	}

	public List<Car> getPriceBetween2(int p , int q) {
		return cr.getPriceBetween2(p, q);
	}
	
	public int getMinPriceJquery() {
		return cr.getMinPriceJquery();
	}
	
	public List<Car> getMinPriceDetailsJquery() {
		return cr.getMinPriceDetailsJquery();
	}

	
	

}
