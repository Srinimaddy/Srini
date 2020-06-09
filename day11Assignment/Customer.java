package day11Assignment;


import java.util.Scanner;

public class Customer {
private int id=0;
private String phone="";
private String name="";
private int age=0;
Scanner scanner;
public Customer() {

scanner= new Scanner(System.in);
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getPhone() {
return phone;
}

public void setPhone(String phone) {
this.phone = phone;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getAge() {
return age;
}

public void setAge(int age) {
this.age = age;
}


public void getCustomerDetailsFromUser() {

System.out.println("Please enter Customer id");
id = scanner.nextInt();
scanner.nextLine();
System.out.println("Please enter the Customer name");
name = scanner.nextLine();
System.out.println("Please enter phone number");
phone = scanner.nextLine();
System.out.println("Please enter age");
age = scanner.nextInt();

}

@Override
public String toString() {
	
return "Customer [id=" + id + ", phone=" + phone + ", name=" + name + ", age=" + age+ "]";
}

}