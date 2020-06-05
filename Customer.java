package mybank;

import java.util.Scanner;

public class Customer {

Scanner sc;
	
	public Customer() {
		
		sc = new Scanner(System.in);
	}
	int id;
	String name;
	int phone;
	Account account;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void getAccountDetailsFromUser() {
		System.out.println("Please enter id");
		id = sc.nextInt();
		sc.nextLine();
		setId(id);
		System.out.println("Please enter name");
		name = sc.nextLine();
		setName(name);
		System.out.println("Please enter the phone number");
		phone = sc.nextInt();
		setPhone(phone);
		
	}
	
	public void displayCustomerDetails()
	{
		System.out.println("ID =  "+getId()+"\nName =  "+getName()+"\nPhone num =  "+getPhone());
	}


}
