package day16Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.TreeSet;
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

void userOperation() throws IOException, TranscationException {
//try {
	
	SavingsAccount sa= new SavingsAccount();
	CurrentAccount cs= new CurrentAccount();
	
     int userChoice = 0;

     String transOpt=null, addChoice=null;

     do {

            System.out.println("Please select a number \r\n" +

                                "1) Transact\r\n" +

                                "2) Print Account Details\r\n" +

                                "3) Show balance\r\n" +

                                 "4) Account Details in file\r\n"
                                 +
                                 "5) Details in sorted order"
                                 );
            					
            userChoice = scanner.nextInt();

            scanner.nextLine();

            if(userChoice==1) {

                         System.out.println("Please enter the type of transaction\r\n" +

                                       "1) Withdraw\r\n" +

                                       "2) Deposit");

                         transOpt =scanner.next();

                         scanner.nextLine();

            }
     
            int accNo=0;
            Account obj=null ;
            		
           if(userChoice!=5) 	{
            	
            System.out.println("Please enter the account number");

            accNo= scanner.nextInt();

            scanner.nextLine();
            obj = findAccount(accNo);
            
           }
           

            if(obj!= null || obj==null) {

                   switch(userChoice) {

                         case 1: System.out.println("Please enter the amount");

                                       amt=scanner.nextDouble();

                                       scanner.nextLine();

                                       if(obj.getAccType().equalsIgnoreCase("savings"))

                                       {

                                              sa.transact(obj, transOpt, amt);

                                       }

                                       else if(obj.getAccType().equalsIgnoreCase("current"))

                                       {

                                              cs.transact(obj, transOpt, accNo);

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
                                       

                         case 5 :
                      	 Collections.sort(accDetails, new  SortbyAcc());
                      	   for(Account acc:accDetails)
                      	   {
                                 System.out.println(acc.getAccType()+

                                         

                              	       "\r\nName : "+acc.getName()+
                              	        "\r\nAccount Number : "+acc.getAccountNumber()+
                              	     "\r\nAge : " +acc.getAge()+
                              	       "\r\nPhone : "+acc.getPhone()+
                              	   "\r\nBalance : "+acc.getBalance());
                              	                        	   
                      	   }
                                       break;
                                       
                         case 4 :
                        	 Collections.sort(accDetails, new  SortbyAcc());
                        	 try {
                        	   for(Account acc:accDetails)
                        	   {
                        	 
                         		FileWriter mywriter = new FileWriter("C:\\\\Users\\\\Srini\\\\eclipse-workspace\\\\Sample3.txt");
                         		mywriter.write("\nAccount Details is");
                         		mywriter.write("\nAccount Type is :"+acc.accType);
                         		mywriter.write("\nAccount Number is :"+acc.getAccountNumber());
                         		mywriter.write("\nAccount Name is :"+acc.name );
                         		mywriter.write("\nAccounter phone is :"+acc.phone);
                         		mywriter.write("\nAccount Age is :"+acc.age);
                         		mywriter.write("Account Balance is :"+acc.balance);
                         		mywriter.close();
                         		System.out.println("Successfully wrote");
                         		System.out.println("C:\\Users\\Srini\\eclipse-workspace\\Sample3.txt");
                        	 }
                         	}catch(IOException e) {
                         		System.out.println("an occured error");
                         		e.printStackTrace();
                         	}
                      	   
                      	   finally {
                     			System.out.println("This is your file path");
                     			
                     	
                     			}
                        	 
                     		}
                   }

                   System.out.println("Do u want to do another operation??...yes/no");

                   addChoice = scanner.nextLine();

            }
     
     while( addChoice.equalsIgnoreCase("yes"));

}
   

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
     
     public int ageCalculation(String dob) {
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

     class SortbyAcc implements Comparator<Account> 
     { 
         // Used for sorting in ascending order of 
         // roll number 
         public int compare(Account a, Account b) 
         { 
             return a.getAccountNumber() - b.accountNumber; 
         } 
     } 
     public static void main(String[] a) throws IOException, TranscationException {

            Account sObj = new SavingsAccount();

            sObj.takeAccountDetails();



        

           

     }


}
