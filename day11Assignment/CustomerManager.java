package day11Assignment;

import java.util.Scanner;

public class CustomerManager {

Customer[] customer;
Scanner scanner;
int noOfCustomers=0;

CustomerManager(){
scanner = new Scanner(System.in);
customer = new Customer[10];
}


public void printChoices() {

int userChoice = 0;
do {
System.out.println("--------------------");
System.out.println("1. Adding a new customer");
System.out.println("2. Updating the customer details");
System.out.println("3. Deleting a customer");
System.out.println("4. Printing all the customer details");
System.out.println("5. Printing the given customer detail");
System.out.println("6. Compare customers");
System.out.println("7. Exit");
System.out.println("--------------------");
userChoice  = scanner.nextInt();
switch (userChoice ) {
case 1:
++noOfCustomers;
addCustomer(noOfCustomers); 
break;
case 2:
updateCustomerDetails();
break;
case 3:
deleteCustomer();
break;
case 4:
printAllCustomer();
break;
case 5:
printCustomer();
break;
case 6:
compareCustomer();
break;
case 7:
System.out.println("exiting.....");
break;
default:
System.out.println("Invalid option.. Try again");
break;
}

} while (userChoice!=7);


}
private void compareCustomer() {

int id1=0,id2=0,idx1,idx2;
System.out.println("Please enter the first Customer id to be compared");
id1 = scanner.nextInt();
idx1 = findCustomerIndex(id1);
if(idx1==-1)
{
System.out.println("No such Customer please try again from start");
compareCustomer();
}
System.out.println("Please enter the second Customer id to be compared");
id2 = scanner.nextInt();
idx2 = findCustomerIndex(id2);
if(idx2==-1)
{
System.out.println("No such Customer please try again from start");
compareCustomer();
}
if(customer[idx1].equals(customer[idx2]))
System.out.println("The Customer are just the same");
else
System.out.println("Not same");
System.out.println("--------------------");

}
public void printCustomer() {

int id1=0,idx1 =0;
System.out.println("Please enter the customer id to be printed");
id1 = scanner.nextInt();
idx1 = findCustomerIndex(id1);
System.out.println("The selected customer details");
if(idx1==-1)
{
System.out.println("No such customer");
}
else
{
	String name="";
	int id=0;
	int age=0;
	String phone="";
	
	name=customer[idx1].getName();
	id=customer[idx1].getId();
	age=customer[idx1].getAge();
	phone=customer[idx1].getPhone();
	StringBuffer buffer= new StringBuffer(phone);
	String first= buffer.substring(0, 2);
	String last=buffer.substring(8, 10);
	String temp=buffer.substring(2, 8);
	String middle=temp.replaceAll("[0-9]", "X");
	buffer.setLength(0);
	buffer.append(first).append(middle).append(last);
	phone=buffer.toString();
	System.out.println("Customer Id:"+id+"\n"+"Customer name:"+name+"\n"+"Customer Phone"+phone+"\n"+"Customer age"+age);

}

System.out.println("--------------------");

}
public void printAllCustomer() {

	
String name="";
int id=0;
int age=0;
String phone="";
for (int i = 0; i <= noOfCustomers; i++) {
name=customer[i].getName();
id=customer[i].getId();
age=customer[i].getAge();
phone=customer[i].getPhone();
StringBuffer buffer= new StringBuffer(phone);
String first= buffer.substring(0, 2);
String last=buffer.substring(8, 10);
String temp=buffer.substring(2, 8);
String middle=temp.replaceAll("[0-9]", "X");
buffer.setLength(0);
buffer.append(first).append(middle).append(last);
phone=buffer.toString();
System.out.println("Customer Id:"+id+"\n"+"Customer name:"+name+"\n"+"Customer Phone"+phone+"\n"+"Customer age"+age);

System.out.println("--------------------");
}

}
public void deleteCustomer() {

int id1=0,idx1 =0;
System.out.println("Please enter the customer id to be deleted");
id1 = scanner.nextInt();
idx1 = findCustomerIndex(id1);
if(idx1==-1)
{
System.out.println("No such Customer");
System.out.println("No Customer deleted");
}
else 
{
System.out.println("The Customer to be deleted is ");
System.out.println(customer[idx1]);
customer[idx1] = null;
System.out.println("Customer deleted");
System.out.println("--------------------");
}
}
public void updateCustomerDetails() {

int id1=0,idx1 =0;
System.out.println("Please enter the customer id to be updated");
id1 = scanner.nextInt();
idx1 = findCustomerIndex(id1);
if(idx1==-1)
{
System.out.println("No such customer");
}
else
{
System.out.println(customer[idx1]);
System.out.println("--------------------");
String name = scanner.nextLine();
System.out.println("Please enter the customer name for updation");
scanner.nextLine();
System.out.println("Please enter the customer Phone number for updation");
String phone = scanner.nextLine();
customer[idx1].setName(name);
customer[idx1].setPhone(phone);
System.out.println("Update success");
System.out.println("The updated customer details");
System.out.println(customer[idx1]);
System.out.println("--------------------");

}

}
public int findCustomerIndex(int id) {

int index = -1;
for (int i = 0; i < noOfCustomers; i++) {
if(customer[i].getId()==id)
{
index = i;
break;
}
}
return index;
}
public void addCustomers() {
int index = -1;
String choice = "No";
do {
index++;
addCustomer(index);
System.out.println("Do u want to add more Customers?? Key in Yes for next entry and No for quiting");
choice = scanner.nextLine();
} while (!choice.toLowerCase().equals("no") && index<10);
noOfCustomers = index;
System.out.println("Customers added");
System.out.println("--------------------");
}


public void addCustomer(int i) {

if(i<10) {
customer[i] = new Customer();
customer[i].getCustomerDetailsFromUser();
}

}
public static void main(String[] args) {

CustomerManager manager= new CustomerManager();
manager.addCustomers();
manager.printChoices();

}
}