package day19Assignment;

import java.util.Scanner;

public class Driver {
	
	public int driverId;
	String driverName="";
	String driverPhone="";
	boolean busallocated=false;
	Scanner sc;
	
	Employee employee= new Employee();
	BusModel busModel;
	public Driver() {
		sc= new Scanner(System.in);
		 busModel=new BusModel();
		 
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
	public String getDriverPhone() {
		return driverPhone;
	}
	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}
	public boolean isBusallocated() {
		return busallocated;
	}
	public void setBusallocated(boolean busallocated) {
		this.busallocated = busallocated;
	}
	
	public void getDetailsFromUser()
	{
		BusModel busModel= new BusModel();
		System.out.println("Please enter driver id");
		driverId=sc.nextInt();
		setDriverId(driverId);
		sc.nextLine();
		System.out.println("Please enter driver name");
		driverName=sc.nextLine();
		setDriverName(driverName);
		System.out.println("Please enter driver phone");
		driverPhone=sc.nextLine();
		setDriverPhone(driverPhone);
		busModel.populateDriver(getDriverId(), getDriverPhone(), getDriverName());
		}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", driverPhone=" + driverPhone + ", sc="
				+ sc + "]";
	}
}