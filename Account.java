package mybank;

import java.util.Scanner;

public class Account {

	int number=0;
	String name="";
	int balance=0;
	Scanner sc;
	
	public Account() {
		
		sc = new Scanner(System.in);
	}
	public int getNumner() {
		return number;
	}
	public void setNumner(int numner) {
		this.number = numner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void getAccountDetailsFromUser() {
		System.out.println("Please enter the number");
		number = sc.nextInt();
		sc.nextLine();
		setNumner(number);
		System.out.println("Please enter name");
		name = sc.nextLine();
		setName(name);
		System.out.println("Please enter the balance");
		balance = sc.nextInt();
		setBalance(balance);
	}
	public void displayDetails()
	{
		System.out.println("Number =  "+getNumner()+"\nName =  "+getName()+"\nBalance =  "+getBalance());
	}
	
}
