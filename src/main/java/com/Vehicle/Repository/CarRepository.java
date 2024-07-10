package com.Vehicle.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Vehicle.Entity.Car;

public interface CarRepository extends JpaRepository<Car,Integer> {
	
	
	@Query(value = "select * from carhouse where brand like ?" , nativeQuery = true)
	public List<Car> getCarDetailByName(String a);
	
	@Query(value = "select * from carhouse where vehicle_type like ?",nativeQuery = true)
	public List<Car> getPetrolCars(String b);
	
	@Query(value = "select max(price) from carhouse" , nativeQuery = true)
	public int getMaxCarPrice();
	
	@Query(value = "select brand from carhouse",nativeQuery = true)
	public List<String> getAllBrandNames();
	
	@Query(value = "select brand from carhouse where id = ?",nativeQuery = true)
	public List<String> giveIdGetBrand(int a); 
	
	@Query(value = "select * from carhouse where price<? && price>?",nativeQuery = true)
	public List<Car> getPriceBetween(int c , int d);
	
	@Query(value = "select * from carhouse order by price desc",nativeQuery = true)
	public List<Car> getPriceDescending();
	
	@Query(value = "select id,brand from carhouse where price = ?",nativeQuery = true)
	public List<Object> getBrandAndIdByGivingPrice(int a);
	
	@Query(value = "select * from carhouse where price = (select max(price) from carhouse where price<(select max(price) from carhouse))",nativeQuery=true)
	public List<Car> getSecondMax();
	
	@Query(value = "select * from carhouse order by price desc limit 1 offset 2",nativeQuery = true)
	public List<Car> getThirdMax();
	
	@Query(value = "select ca from Car ca where ca.price>:p")
	public List<Car> getPriceGreaterThan(@Param ("p")int p);
	
	@Query(value = "select ca from Car ca where ca.price>:p and ca.price<:q")
	public List<Car> getPriceBetween2(@Param ("p")int p , @Param ("q")int q);
	
	@Query(value = "select min(ca.price) from Car ca")
	public int getMinPriceJquery();
	
	@Query(value = "select ca from Car ca where price = (select min(price) from Car ca)")
	public List<Car> getMinPriceDetailsJquery();
	
	
	
	
	
	

}
