package com;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;
public class Travel {
	
	public boolean isCarDriver(Driver driver) {
		
	return driver.getCategory().equals("Car");

	}
	public String retriveByDriverId(ArrayList<Driver> totalDrivers, int searchDriverId) {
		for(Driver driver : totalDrivers) {
			//if (driver.getDriverId)  ==> currentDriverId 
			// driverId ==> searchDriverId
			int currentDriverId = driver.getDriverId();
			if(currentDriverId == searchDriverId) {
				String driverName = driver.getDriverName();
				String drivercat = driver.getCategory();
				double driverDis = driver.getTotalDistance();
				System.out.println("Driver name is "+ driverName + " Belonging to the category "+ drivercat +"," + " Traveled "+ driverDis+ " KM so far");
				
			}
		

		}
		return "";
	}


public int retrieveCountOfDriver(ArrayList<Driver> driverList,String category) {
	int driversCount = 0;
	for (Driver driver : driverList) {
		if(driver.getCategory().equalsIgnoreCase(category)) {
			driversCount++;
		}
	}
	return driversCount;
}
public ArrayList<Driver> retriveDriver(ArrayList<Driver> driverList, String category){
	ArrayList<Driver> response = new ArrayList<Driver>();
	
	for (Driver driver : driverList) {
		if(driver.getCategory().equalsIgnoreCase(category)) {
			response.add(driver);
		}
	}
	return response;
}
// using Java8

 public List<Driver> retriveDriverbyJava8(ArrayList<Driver> driverList,String category){
	 List<Driver> response = driverList.stream().filter(d ->d.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList());
	 return response;
}
 public Driver retrieveMaximumDistance(ArrayList<Driver> driverList) {
	 Driver topDriver = new Driver();
	 if(!driverList.isEmpty()) {
		 topDriver = driverList.get(0);
		 for (Driver driver : driverList) {
			if(driver.getTotalDistance() > topDriver.getTotalDistance()) {
				topDriver = driver;
			}
		}
	 }
	 return topDriver;
 }
}
