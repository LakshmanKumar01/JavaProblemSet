package com;
import java.util.ArrayList;
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
	public int retriveCountOfDriver(ArrayList<Driver> driverList, String category) {
		int driversCount = 0;
		for(Driver driver : driverList) {
			if(driver.getCategory().equalsIgnoreCase(category)) {
				driversCount++;
			}
		}
		return driversCount;
		
	}
	public ArrayList<Driver> retriveDriver(ArrayList<Driver> driverList, String category) {
		ArrayList<Driver> response = new ArrayList<Driver>();
		for(Driver driver : driverList) {
			if(driver.getCategory().equalsIgnoreCase(category));
			response.add(driver);
		}
		return response;
	}
		public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> driverList) {
			Driver topDriver = new Driver();
			if(!driverList.isEmpty()) {
				topDriver = driverList.get(0);
				for (Driver driver : driverList) {
					if (driver.getTotalDistance() > topDriver.getTotalDistance()) {
						topDriver = driver;
					}
				}
			}
			return topDriver;
			}
		}
