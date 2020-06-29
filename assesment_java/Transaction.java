package assesment_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {
	

    ArrayList<Account> accDetails;

    Scanner sc;
 int transaction_number=0;
 String fromAccount;
 String toAccount;
 double amount;
 String type="";
 String status="";

    double amt;

    Transaction(){

           sc = new Scanner(System.in);

           accDetails = new ArrayList<Account>();

    }
    public void validateType(String type2) {
 
 if(type2.equalsIgnoreCase("Cash") || type2.equalsIgnoreCase("Transfer"))
 {
 
 }
 else
 {
 System.out.println("Type should be either cash or transfer");
 
 }
 }
    
    Account findAccount(String fromAccount2) {

        

        for(Account obj:accDetails){

               if(obj.getAccountNumber().equalsIgnoreCase(fromAccount2))

                     return obj;

        }
        System.out.println("Account does not exist");

        return null;

 }
    
void transact() {

    String userChoice;
    String choice;
   Account acc= new Account();
 System.out.println("Enter from account");
 fromAccount = sc.nextLine();
 System.out.println("Enter to account");
 toAccount = sc.nextLine();
 System.out.println("Enter amount");
 amount = sc.nextDouble();
 sc.nextLine();
 System.out.println("Enter type");
 do {
           System.out.println("Please select a number \r\n" +

                               "1) Do transaction\r\n" +

                               "2) Print Account Details\r\n" +

                               "3) Print Transactions detils\r\n"
                                );
           
           userChoice = sc.nextLine();
           if(userChoice.equalsIgnoreCase("1")) {
           System.out.println("Enter type");
           type = sc.nextLine();
           }
           if(userChoice.equalsIgnoreCase("1"))
           {
          if(type.equalsIgnoreCase("cash"))
          {
           Account obj = findAccount(fromAccount);
           if(obj!= null) {
               double balance1;
               balance1= obj.getBalance()+amount;
               obj.setBalance(balance1);
               System.out.println("cash added");
               status="Success";
          
           }
    }
          else if(type.equalsIgnoreCase("transfer"))
          {
          Account obj = findAccount(fromAccount);
          Account obj1= findAccount(toAccount);
                   if(obj!= null && obj1!=null) {
                       double balance1;
                       double balance2;
                       balance1= obj.getBalance()-amount;
                       obj.setBalance(balance1);
                       balance2=obj1.getBalance()+amount;
                       obj1.setBalance(balance2);
                       System.out.println("cash transferred");
                       status="success";
                       
          }
           }
          else {
          status="Failure";
          }
 }
           else  if(userChoice.equalsIgnoreCase("2"))
           {
         for(Account account:accDetails)
               {
         StringBuffer buffer= new StringBuffer(account.getAccountNumber());
         String first= buffer.substring(0, 2);
         String last=buffer.substring(8, 10);
         String temp=buffer.substring(2, 8);
         String middle=temp.replaceAll("[0-9]", "X");
         buffer.setLength(0);
         buffer.append(first).append(middle).append(last);
         String accountNumber=buffer.toString();
               String password=account.getPassword();
         String password1=password.replaceAll("[0-9, A-Z,a-z,!@#$%^&*()_+]" ,"*");
             System.out.println(
             "\r\nAccountNumber: "+accountNumber+
                  "\r\nPassword : "+password1+
               "\r\nName : " +account.getName()+
                 "\r\nPhone : "+account.getPhone()+
             "\r\nBalance: "+account.getBalance());
            
                                               
               }
         
         }
           else  if(userChoice.equalsIgnoreCase("3"))
           {
           System.out.println("Transaction details");
           System.out.println("Transaction  "+status );
           }
           
           System.out.println("Do u want to continue");
           choice=sc.nextLine();
           
 }while( choice.equalsIgnoreCase("yes"));
}

    void populateAccounts(String accountNumber, String name, String password, String phone, double balance)

    {

           Account acc= new Account();

          acc.setAccountNumber(accountNumber);
          acc.setName(name);
          acc.setPassword(password);
          acc.setPhone(phone);
          acc.setBalance(balance);
           accDetails.add(acc);
    }

  
}
