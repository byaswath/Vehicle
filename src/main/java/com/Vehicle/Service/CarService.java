package com.Vehicle.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vehicle.Dao.CarDao;
import com.Vehicle.Entity.Car;
import com.Vehicle.Exception.BrandNotFoundException;

@Service
public class CarService {
	
	@Autowired
	CarDao cd;
	
	public List<String> getAllBrandNames() {
		return cd.getAllBrandNames();
	}
	
	public List<Car> getAllCar() {
		return cd.getAllCar();
	}
	
	public String postOneCar(Car car) {
		return cd.postOneCar(car);
	}
	
	public String postBulkCar(List<Car> car) {
		return cd.postBulkCar(car);		
	}
	
	public List<Car> getCarDetailByName(String a) throws BrandNotFoundException{
		if(cd.getCarDetailByName(a).isEmpty()) {
			throw new BrandNotFoundException("Not Found");
		}
		else {
			return cd.getCarDetailByName(a);
		}
	}
	
	public List<Car> getPetrolCars(String b) {
		return cd.getPetrolCars(b);
	}
	
	public int getMaxCarPrice() {
		return cd.getMaxCarPrice();
	}
	
	public List<String> giveIdGetBrand(int a) {
		return cd.giveIdGetBrand(a);
	}
	
	public List<Car> getPriceBetween(int c , int d) {
		return cd.getPriceBetween(c, d);
	}
	
	public List<Car> getPriceDescending() {
		return cd.getPriceDescending();
	}
	
	public List<Object> getBrandAndIdByGivingPrice(int a) {
		return cd.getBrandAndIdByGivingPrice(a);
	}
	
	public List<Car> getSecondMax() {
		return cd.getSecondMax();
	}
	
	public List<Car> getThirdMax() {
		return cd.getThirdMax();
	}
	
	public List<Car> getPriceGreaterThan(int p) {
		return cd.getPriceGreaterThan(p);
	}
	
	public List<Car> getPriceBetween2(int p , int q) {
		return cd.getPriceBetween2(p, q);
	}
	
	public int getMinPriceJquery() {
		return cd.getMinPriceJquery();
	}
	
	public List<Car> getMinPriceDetailsJquery() {
		return cd.getMinPriceDetailsJquery();
	}
	

}
