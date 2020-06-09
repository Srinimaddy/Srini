package Test;

import java.util.Scanner;

import org.omg.CORBA.portable.CustomValue;

public class Bank {
	

	Account[] account;
	static CustomValue[] customer;
	
	
	public Bank() {
		account = new Account[5];
		
		
		
	}
	
	public void createAccount() {
		
		for(int i=0;i<account.length;i++)
		{
			account[i]=new Account();
			account[i].getAccountDetailsFromUser();
			
		}
		
	}
	

	
	
	void printAccountDetails() {
		for (int i = 0; i < account.length; i++) {
			account[i].displayDetails();
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank= new Bank();
		bank.createAccount();
		//
		//bank.printAccountDetails();

		bank.compareAccounts();
		
	}

	public void compareAccounts() {
		
		for (int i = 0; i < account.length; i++) {
			for(int j=i+1;j<account.length;j++) {
				System.out.println("i"+i+"j"+j);
				if(account[i].getNumner()==account[j].getNumner())
				{
					account[i].displayDetails();
					account[j].displayDetails();
			}
			
		}
	}

	}

}
