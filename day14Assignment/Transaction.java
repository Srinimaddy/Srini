package day14Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

 

import java.util.ArrayList;

import java.util.Scanner;

import java.time.format.DateTimeFormatter;

import java.time.LocalDate;

import java.time.Period;

public class Transaction {
	
	ArrayList<Account> accDetails;

    Scanner scanner;

    double amt;

    Transaction(){

           scanner = new Scanner(System.in);

           accDetails = new ArrayList<Account>();

    }

   

    //Allows user to perform their interested operation

void userOperation() {
try {


    int userChoice = 0;

    String transOpt=null, addChoice=null;

    do {

           System.out.println("Please select a number \r\n" +

                               "1) Transact\r\n" +

                               "2) Print Account Details\r\n" +

                               "3) Show balance\r\n" +

                                "4) Account Details in file");
           userChoice = scanner.nextInt();

           scanner.nextLine();

           if(userChoice==1) {

                        System.out.println("Please enter the type of transaction\r\n" +

                                      "1) Withdraw\r\n" +

                                      "2) Deposit");

                        transOpt =scanner.next();

                        scanner.nextLine();

           }
    

           System.out.println("Please enter the account number");

           int accNo=scanner.nextInt();

           scanner.nextLine();

           Account obj = findAccount(accNo);

           if(obj!= null) {

                  switch(userChoice) {

                        case 1: System.out.println("Please enter the amount");

                                      amt=scanner.nextDouble();

                                      scanner.nextLine();

                                      if(obj.getAccType().equalsIgnoreCase("savings"))

                                      {

                                             new SavingsAccount().transact(obj, transOpt, amt);

                                      }

                                      else if(obj.getAccType().equalsIgnoreCase("current"))

                                      {

                                             new CurrentAccount().transact(obj, transOpt, amt);

                                      }

                                      break;

                        case 2:

                       

                                      System.out.println(obj.getAccType()+

                                      

    "\r\nName : "+obj.getName()+
     "\r\nAccount Number : "+accNo+
  "\r\nAge : " +obj.getAge()+
    "\r\nPhone : "+obj.getPhone()+
"\r\nBalance : "+obj.getBalance());

                                      break;

                        case 3 :

                                      System.out.println("The available balance is "+obj.checkBalance());      

                                      break;
                                      
                        case 4 :
                     	   try {
                    			File myObj = new File("C:\\Users\\Ebbi\\eclipse-workspace\\Sample3.txt");
                    			if(myObj.createNewFile()) {
                    				System.out.println("File created :"+myObj.getName());
                    				System.out.println("Absolute path: " + myObj.getAbsolutePath());
                    			}
                    			else {
                    				System.out.println("file already exist");
                    			}
                    		}finally {
                    			System.out.println("This is your file path");
                    			}
                    		}
                  }
           try {
       		FileWriter mywriter = new FileWriter("C:\\\\Users\\\\Ebbi\\\\eclipse-workspace\\\\Sample3.txt");
       		mywriter.write("\nAccount Details is");
       		mywriter.write("\nAccount Type is : Savings");
       		mywriter.write("\nAccount Number  is: 101");
       		mywriter.write("\nAccount Name is: Ebbi" );
       		mywriter.write("\nAccounter phone  is: 99887448");
       		mywriter.write("\nAccount Age is : 22");
       		mywriter.write("Account Balance is: 10110");
       		mywriter.close();
       		System.out.println("Successfully wrote");
       	}catch(IOException e) {
       		System.out.println("an occured error");
       		e.printStackTrace();
       	}

                  System.out.println("Do u want to do another operation??...yes/no");

                  addChoice = scanner.nextLine();

           }

    while( addChoice.equalsIgnoreCase("yes"));

}

catch(Exception e) {
	System.out.println("Some Error Occured");
}
}



int ageCalculation (String dob) {

    int age = 0;

    //direct age calculation

           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

           //convert String to LocalDate

           LocalDate localDate = LocalDate.parse(dob, formatter);

      LocalDate now = LocalDate.now(); //gets localDate

      Period diff = Period.between(localDate, now); //difference between the dates is calculated

      age = diff.getYears();

    return age;

}



    //adds all accounts created to ArrayList accDetails      

    void populateAccounts(int accountNumber, String accType, String name, String dob, String phone, double balance, int age)

    {

           Account obj = new SavingsAccount();

           obj.setAccountNumber(accountNumber);

           obj.setAccType(accType);

           obj.setBalance(balance);

           obj.setName(name);

           obj.setDob(dob);

           obj.setAge(age);

           obj.setPhone(phone);

           accDetails.add(obj);

          

    }

    //gets accNo as input and returns the relevant account object

    Account findAccount(int accNo) {

          

           for(Account obj:accDetails){

                  if(obj.getAccountNumber() == accNo)

                        return obj;

           }

           System.out.println("Account does not exist");

           return null;

    }

    public static void main(String[] a) {

           Account sObj = new SavingsAccount();

           sObj.takeAccountDetails();



          

          

    }


}
