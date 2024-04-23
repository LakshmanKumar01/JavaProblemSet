 package com;

import java.util.ArrayList;

import java.util.List;

public class TestDriver {

	public static void main(String[] args) {
		Travel travels = new Travel();
		ArrayList<Driver> totalDistance = masterDriverList();
	    Driver topDriver = travels.retrieveMaximumDistance(totalDistance);
	    System.out.println(topDriver);
	}

	private static ArrayList<Driver> thirdMethod() {
		// 3 method
		ArrayList<Driver> totalDriversList = masterDriverList();

		//int DriverCount = travel.retrieveCountOfDriver(totalDriversList, "Car");
		//System.out.println("Given Category Drivers List is " + DriverCount);
		return totalDriversList;
	}

	private static ArrayList<Driver> fourthMethod(Travel travel, ArrayList<Driver> totalDriversList) {
		ArrayList<Driver> driversList = travel.retriveDriver(totalDriversList, "lorry");
		System.out.println(driversList);
		// System.out.println(driversList.size());
		
	    List<Driver> resp = travel.retriveDriverbyJava8(driversList,"lorry");
	    System.out.println(resp);
		return driversList;
	}

	private static ArrayList<Driver> masterDriverList() {
		Driver driver1 = new Driver(100, "Lorry", "Helo", 100);
		Driver driver2 = new Driver(101, "Car", "Sai", 1155);
		Driver driver3 = new Driver(999, "Car", "Lakshman", 8888);
		Driver driver4 = new Driver(102, "Truck", "Kumar", 8987);

		ArrayList<Driver> totalDriversList = new ArrayList<Driver>();

		totalDriversList.add(driver1);
		totalDriversList.add(driver2);
		totalDriversList.add(driver3);
		totalDriversList.add(driver4);
		return totalDriversList;
	}

	public static Travel isCarDriverCallingCode() {
		Driver driver = new Driver(1, "car", "Pavan", 999.9);

		Travel travel = new Travel();
		boolean isCarDriver = travel.isCarDriver(driver);

		System.out.println(isCarDriver);

		//
		return travel;
	}

}
