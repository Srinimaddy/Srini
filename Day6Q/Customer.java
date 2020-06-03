package Day6Q;

import java.util.Scanner;

public class Customer {
	private int id,age;
	private String name,phone;
	private Scanner sc;
	
	Customer(){
		sc = new Scanner(System.in);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void printCustomerData() {
		System.out.println("Customer ID "+id);
		System.out.println("Customer Name "+name);
		System.out.println("Customer Age "+age);
		System.out.println("Customer Phone "+phone);
	}
	
	public void getCustomerDataFromUser() {
		System.out.println("Please enter the Customer ID");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter the Customer Name");
		name = sc.nextLine();
		System.out.println("Please enter the Customer Age");
		age = sc.nextInt();
		System.out.println("Please enter the Customer Phone");
		phone = sc.nextLine();


		
		
	}

}
