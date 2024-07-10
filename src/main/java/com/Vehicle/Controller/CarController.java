package com.Vehicle.Controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Vehicle.Entity.Car;
import com.Vehicle.Exception.BrandNotFoundException;
import com.Vehicle.Service.CarService;

@RestController
public class CarController {
	
	@Autowired
	CarService cs;
	
	@GetMapping(value = "/getAllCar")
	public List<Car> getAllCar() {
		return cs.getAllCar();
	}
	
	@GetMapping(value = "/getAllBrandNames")
	public List<String> getAllBrandNames() {
		return cs.getAllBrandNames();
	}
	
	@PostMapping(value = "/postOneCarDetail")
	public String postOneCar(@RequestBody Car car) {
		return cs.postOneCar(car);
	}
	@PostMapping(value = "/postBulkCarDetails")
	public String postBulkCar(@RequestBody List<Car> car) {
		return cs.postBulkCar(car);		
	}
	
	@GetMapping(value = "/getCarDetailByName/{a}")
	public List<Car> getCarDetailByName(@PathVariable String a) throws BrandNotFoundException {
		return cs.getCarDetailByName(a);
	}
	
	@GetMapping(value = "/getPetrolCars/{b}")
	public List<Car> getPetrolCars(@PathVariable String b) {
		return cs.getPetrolCars(b);
	}
	
	@GetMapping(value = "/getMaxPrice")
	public int getMaxCarPrice() {
		return cs.getMaxCarPrice();
	}
	
	@GetMapping(value = "/giveIdGetBrand/{a}")
	public List<String> giveIdGetBrand(@PathVariable int a) {
		return cs.giveIdGetBrand(a);
	}
	
	@GetMapping(value = "/getPriceBetween/{c}/{d}")
	public List<Car> getPriceBetween(@PathVariable int c , @PathVariable int d) {
		return cs.getPriceBetween(c, d);
	}
	
	@GetMapping(value = "/getPriceDescending")
	public List<Car> getPriceDescending() {
		return cs.getPriceDescending();
	}
	
	@GetMapping(value = "/getBrandAndIdByGivingPrice/{a}")
	public List<Object> getBrandAndIdByGivingPrice(@PathVariable int a) {
		return cs.getBrandAndIdByGivingPrice(a);
	}
	
	@GetMapping(value = "/getSecondMax")
	public List<Car> getSecondMax() {
		return cs.getSecondMax();
	}
	
	@GetMapping(value = "/getThirdMax")
	public List<Car> getThirdMax() {
		return cs.getThirdMax();
	}
	
	@GetMapping(value = "/getPriceGreater/{p}")
	public List<Car> getPriceGreaterThan(@PathVariable int p) {
		return cs.getPriceGreaterThan(p);
	}
	
	@GetMapping(value = "/getPriceBetween2/{p}/{q}")
	public List<Car> getPriceBetween2(@PathVariable int p , @PathVariable int q) {
		return cs.getPriceBetween2(p, q);
	}
	
	@GetMapping(value = "/getMinPriceJquery")
	public int getMinPriceJquery() {
		return cs.getMinPriceJquery();
	}
	
	@GetMapping(value = "/getMinPriceDetailJquery")
	public List<Car> getMinPriceDetailsJquery() {
		return cs.getMinPriceDetailsJquery();
	}
	
	
	

}
