package assesment_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	
    String accountNumber;

    String name,phone,password;

    double balance;

    Scanner scanner;

   Transaction bObj;

    ArrayList<Integer> accountList;

   

    Account(){

           scanner = new Scanner(System.in);

           accountList = new ArrayList<Integer>();

           bObj = new Transaction();

    }

    public void setAccountNumber(String accountNumber) {

           this.accountNumber = accountNumber;

    }

    public void setName(String name) {

           this.name = name;

    }

    public void setPhone(String phone) {

           this.phone = phone;

    }

    public void setBalance(double balance) {

           this.balance = balance;

    }

    public String getName() {

           return name;

    }
   public String getPhone() {

           return phone;

    }
 
  public double getBalance() {

           return balance;

    }
   public String getAccountNumber() {

           return accountNumber;

    }
  
 public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}

double checkBalance() {
  return balance;     

    }

    void takeAccountDetailsFromUser(){

           String userChoice = "no";
              do {

           System.out.println("Please enter the account number");
           accountNumber = scanner.nextLine();
           System.out.println("please enter name");
           name = scanner.nextLine();
           System.out.println("Please enter Password");
           password = scanner.nextLine();
           System.out.println("Please enter Phone number");
           phone = scanner.nextLine();
           System.out.println("Enter balance");
           balance = scanner.nextDouble();
           scanner.nextLine();
           bObj.populateAccounts(accountNumber, name, password,phone, balance);
           System.out.println("Do u want to enter another yes/no??");
           userChoice = scanner.nextLine();
           }while( userChoice.equalsIgnoreCase("yes"));
             bObj.transact();

    }

	public void printUserAccounts() {
		// TODO Auto-generated method stub
		
	}


}