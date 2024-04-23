package com;

public class Driver {
	
	private String category;
	
	private int driverId;
	
	private String driverName;
	
	private double totalDistance;
	
	public Driver(){}

	public Driver(int driverId,String category,String driverName,double totalDistance){
		this.category = category;
		this.driverId = driverId;
		this.driverName = driverName;
		this.totalDistance = totalDistance;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public double getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}

	@Override
	public String toString() {
		return "Driver [category=" + category + ", driverId=" + driverId + ", driverName=" + driverName
				+ ", totalDistance=" + totalDistance + "]";
	}
	
}
	//toString is used for driversList.get(0) & driversList.get(1)
/*toString --> Driver (Object)
 		   --> prints category 
 		   --> prints driverId
 		   --> prints driverName & distance*/
