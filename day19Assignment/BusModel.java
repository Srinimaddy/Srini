package day19Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class BusModel {
	
	String busNumber="";
	int capacity=0;
	boolean filledStatus=false;
	String source="";
	ArrayList<Driver> driverList;
	Driver driver = new Driver();
	Employee em= new Employee();
	Scanner sc;
	public BusModel() {
		sc= new Scanner(System.in);
		driverList= new ArrayList<Driver>();
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isFilledStatus() {
		return filledStatus;
	}
	public void setFilledStatus(boolean filledStatus) {
		this.filledStatus = filledStatus;
	}
	 		
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	
	public void populateDriver(int driverId, String driverPhone, String driverName) {
		
		driver.setDriverId(driverId);
		driver.setDriverName(driverName);
		driver.setDriverPhone(driverPhone);
		driverList.add(driver);
		
		
	}
	
	public void GetBusDetailsFromUser()
	{
		int id;
		System.out.println("Select the driver from the below list");
		for(Driver driver:driverList)
		{
			System.out.println("Driver Id"+driver.getDriverId());
		}
		System.out.println("Enter thr driver id");
		id= sc.nextInt();
		sc.nextLine();
		driver.setDriverId(id);
		System.out.println("Please enter Bus number");
		busNumber=sc.nextLine();
		setBusNumber(busNumber);
		System.out.println("Please enter capacity");
		capacity=sc.nextInt();
		setCapacity(id);
		sc.nextLine();
		System.out.println("Please enter Source");
		source=sc.nextLine();
		setSource(source);
	}

}
