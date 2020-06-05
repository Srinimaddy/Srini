package mybank;

import java.util.Scanner;

public class Bank {

	Account[] account;
	static Customer[] customer;
	
	
	public Bank() {
		account = new Account[5];
		
	}
	
	public void createAccount() {
		
		for (int i = 0; i < account.length; i++) 
			
		{
			account[i]=new Account();
			account[i].getAccountDetailsFromUser();
			
		}
		
	}
	
	public void createCustomer(int n) {
		
		for(int i=0;i<n;i++)
		{
			customer[i]=new Customer();
			customer[i].getAccountDetailsFromUser();
			
		}
		
	}
	void printAccountDetails() {
		for (int i = 0; i < account.length; i++) {
			account[i].displayDetails();
		}
	}
	
	private void printCustomerDetails(int n) {
	
		for (int i = 0; i < n; i++) {
			customer[i].displayCustomerDetails();
		}
	}  
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank= new Bank();
		bank.createAccount();
		bank.printAccountDetails();
		System.out.println("Version 2, Enter the no of accounts to be created");
		int n=sc.nextInt();
		customer =new Customer[n];
		bank.createCustomer(n);
		bank.printCustomerDetails(n);
		sc.close();
		
	}

}
