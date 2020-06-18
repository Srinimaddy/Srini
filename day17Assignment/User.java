package day17Assignment;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	
	Scanner scanner;
	ArrayList<User> userData;
	Map <String,String>usermap= new HashMap<String,String>();;

	public User() {
	scanner = new Scanner(System.in);
	userData=new ArrayList<User>();

	
	}
	String userName;
	String password;
	String name;
	String dob;
	String hobbies;
	String email;
	String phone;
	int age;
	boolean validateEmail=false;
	boolean validatePassword=false;
	boolean validatePhone=false;
	public String getUserName() {
	return userName;
	}
	public void setUserName(String userName) {
	this.userName = userName;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getDob() {
	return dob;
	}
	public void setDob(String dob) {
	this.dob = dob;
	}
	public String getHobbies() {
	return hobbies;
	}
	public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public String getPhone() {
	return phone;
	}
	public void setPhone(String phone) {
	this.phone = phone;
	}
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
	public void getUserDetais() {
	

	 String userChoice = "no";
	          do {

	       System.out.println("Please enter UserName");

	      
	       
	       userName = scanner.nextLine();
	       setUserName(userName);

	       System.out.println("Please enter Password");

	       password = scanner.nextLine();

	       
	       validatePassword= formatPassword(password);

	      if(validatePassword)
	      {
	     setPassword(password);
	      }
	      else {
	     System.out.println("password should meet the requirements");
	     break;
	    
	      }
	       
	       if(usermap.containsKey(userName) && usermap.containsValue(password)) {

	            
	      System.out.println("User already exists!!");

	       }

	       else {

	      usermap.put(getUserName(),getPassword());
	       

	       System.out.println("please enter name");

	       name = scanner.nextLine();

	       setName(name);
	       System.out.println("Please enter  Date of Birth DD/MM/YYYY");

	       dob= scanner.nextLine();
	       setDob(dob);
	       System.out.println("Please enter Phone number");
	       
	       phone = scanner.nextLine();
	       
	       validatePhone=formatPhone(phone);
	       
	       if(validatePhone)
	       {
	      setPhone(phone);  
	       }
	       else {
	       System.out.println("Phone should be 10 digits");
	       break;
	       }
	        
	        
	        
	        
	       System.out.println("Please enter the  hobbies");

	       hobbies =scanner.nextLine();
	       setHobbies(hobbies);
	       
	       System.out.println("Please enter email");

	       email =scanner.nextLine();
	       validateEmail= formatEmail(email);
	       if(validateEmail){
	      setEmail(email);
	       }
	       else {
	    System.out.println("email is wrong");   
	    break;
	       }
	       age=ageCalculation(dob);
	       setAge(age);
	       
	       populateAccounts(getUserName(), getPassword(), getName(), getDob(), getHobbies(), getEmail(), getPhone(),getAge());
	       
	       System.out.println("User details Have Been Created");

	       
	       }
	       
	       System.out.println("Do u want to enter another yes/no??");

	       userChoice = scanner.nextLine();

	       }while( userChoice.equalsIgnoreCase("yes"));

	          
	          validateUserLogin();

	}





	private void populateAccounts(String userName2, String password2, String name2, String dob2, String hobbies2,
	String email2, String phone2, int age2) {
	
	User user= new User();
	user.setUserName(userName2);
	user.setPassword(password2);
	user.setAge(age2);
	user.setDob(dob2);
	user.setEmail(email2);
	user.setHobbies(hobbies2);
	user.setName(name2);
	user.setPhone(phone2);
	userData.add(user);
	}
	private void validateUserLogin() {
	// TODO Auto-generated method stub
	String choice="";
	int count=0;
	int number = 0;
	String temp="";
	int complete=0;
	boolean failed=false;
	do {
	System.out.println("*************************");
	System.out.println("*************************");
	System.out.println("User login");
	 System.out.println("Please enter user name");
	 userName=scanner.nextLine();
	 System.out.println("Please enter Password");
	 password=scanner.nextLine();
	 if(usermap.containsKey(userName) && usermap.containsValue(password)) {

	           
	    System.out.println("User logging in!!");
	    
	    System.out.println("Please select a number \r\n" +

	                                  "1) Edit details\r\n" +

	                                  "2)View Details\r\n" );
	    
	    number= scanner.nextInt();
	    scanner.nextLine();
	    System.out.println(userName+password);
	    if(number==1)
	    {
	    for(String strKey : usermap.keySet() ){
	    temp=strKey;
	       if(temp.equals(userName))
	       {
	        
	        System.out.println("str"+temp+"");
	        System.out.println("please enter name");

	        name = scanner.nextLine();
	           setName(name);
	          
	          System.out.println("Please enter the  hobbies");

	          hobbies =scanner.nextLine();
	          setHobbies(hobbies);
	          
	         System.out.println("Please enter email");

	          email =scanner.nextLine();
	          validateEmail= formatEmail(email);
	          if(validateEmail){
	          setEmail(email);
	          }
	          else {
	        System.out.println("email is wrong");   
	        break;
	          }
	       }
	    }
	    }
	    else if(number==2)
	    {
	    for(User user:userData)
	                    {
	    String password=user.getPassword();
	    String password1=phone.replaceAll("[0-9, A-Z,a-z,!@#$%^&*()_+]" ,"*");
	                             System.out.println(
	                            "\r\nUser Name : "+user.getUserName()+
	                                   "\r\nPassword : "+password1+
	                                "\r\nAge : " +user.getAge()+
	                                  "\r\nPhone : "+user.getPhone()+
	                              "\r\nHobbies: "+user.getHobbies()+
	                                "\r\nEmail : "+user.getEmail()+
	                                 "\r\nName : "+user.getName()
	                              );
	                                                    
	                    }
	    }
	    complete=1;
	    }
	 else  if("admin".equalsIgnoreCase(userName) && "admin".equalsIgnoreCase(password)) {
	 
	 System.out.println("User logging in!!");
	    
	    System.out.println("Please select a number \r\n" +

	                                "1) List all user data\r\n" +

	                                "2)Edit user data\r\n" +
	    
	    "3)Delete user data\r\n"+
	    
	    "4)Add user\r\n");
	    int userChoice=0;
	    userChoice=scanner.nextInt();
	    scanner.nextLine();
	    switch(userChoice) {

	                     case 1: System.out.println("Listing user data");
	                     System.out.println("How to order\r\n" +

	                                "1) By age\r\n" +

	                                "2)By name\r\n" +
	    
	    "3)by username\r\n"
	    
	    );
	                     int sortChoice=0;
	                     sortChoice=scanner.nextInt();
	        scanner.nextLine();
	        
	        if(sortChoice==1)
	        {
	        Collections.sort(userData, new  SortbyAge());
	                    for(User user:userData)
	                    {
	                    String password=user.getPassword();
	    String password1=phone.replaceAll("[0-9, A-Z,a-z,!@#$%^&*()_+]" ,"*");
	                  System.out.println(
	                  "\r\nUser Name : "+user.getUserName()+
	                       "\r\nPassword : "+password1+
	                    "\r\nAge : " +user.getAge()+
	                      "\r\nPhone : "+user.getPhone()+
	                  "\r\nHobbies: "+user.getHobbies()+
	                      "\r\nEmail : "+user.getEmail()+
	                       "\r\nName : "+user.getName());
	                                                    
	                    }
	        }
	        else if(sortChoice==2)
	        {
	        Collections.sort(userData, new  SortbyName());
	                      for(User user:userData)
	                      {
	                      String password=user.getPassword();
	      String password1=phone.replaceAll("[0-9, A-Z,a-z,!@#$%^&*()_+]" ,"*");
	                    System.out.println(
	                    "\r\nUser Name : "+user.getUserName()+
	                         "\r\nPassword : "+password1+
	                      "\r\nAge : " +user.getAge()+
	                        "\r\nPhone : "+user.getPhone()+
	                    "\r\nHobbies: "+user.getHobbies()+
	                        "\r\nEmail : "+user.getEmail()+
	                         "\r\nName : "+user.getName());
	                                                      
	                      }
	        }
	                
	        else if(sortChoice==3)
	        {
	        Collections.sort(userData, new  SortbyUserName());
	                      for(User user:userData)
	                      {
	                      String password=user.getPassword();
	      String password1=phone.replaceAll("[0-9, A-Z,a-z,!@#$%^&*()_+]" ,"*");
	                    System.out.println(
	                    "\r\nUser Name : "+user.getUserName()+
	                         "\r\nPassword : "+password1+
	                      "\r\nAge : " +user.getAge()+
	                        "\r\nPhone : "+user.getPhone()+
	                    "\r\nHobbies: "+user.getHobbies()+
	                        "\r\nEmail : "+user.getEmail()+
	                         "\r\nName : "+user.getName());
	                                                      
	                      }
	        }
	                                   break;

	                     case 2:

	                    
	                    for(User user: userData ){
	      
	         
	          
	          System.out.println("please enter name");

	          name = scanner.nextLine();
	             user.setName(name);
	            
	            System.out.println("Please enter the  hobbies");

	            hobbies =scanner.nextLine();
	            user.setHobbies(hobbies);
	            
	           System.out.println("Please enter email");

	            email =scanner.nextLine();
	            validateEmail= formatEmail(email);
	            if(validateEmail){
	            user.setEmail(email);
	            }
	            else {
	          System.out.println("email is wrong");   
	          break;
	            }
	            
	         
	      }
	                    break;
	                     case 3 :

	                    for(User user: userData ){
	           user.setName(null);
	          user.setHobbies(null);
	          user.setEmail(null);
	          user.setName(null);
	          user.setPassword(null);
	          user.setAge(0);
	          user.setPhone(null);
	    }     
	                 System.out.println("user details deleted");
	                                   break;
	                                   
	                                   
	                     case 4 :
	                   
	                    getUserDetais();
	                    break;
	                  }
	    complete=1;
	 }
	 else {
	 System.out.println("Do you want to continue try logging in..  Enter yes/no");
	 choice=scanner.nextLine();
	 count++;
	 failed=true;
	 }
	 if(failed)
	 {
	 
	 }
	 else {
	 System.out.println("Do you want to continue try logging in..  Enter yes/no");
	 choice=scanner.nextLine();
	 }
	}while((choice.equalsIgnoreCase("yes")) && count<3 );


	}

	    class SortbyAge implements Comparator<User> 
	    { 
	       
	       

	public int compare(User o1, User o2) {
	
	return o1.getAge()-o2.getAge();
	} 
	    } 
	    
	    class SortbyName implements Comparator<User> 
	    { 
	     

	public int compare(User o1, User o2) {
	
	return o1.getName().compareToIgnoreCase(o2.getName());
	} 
	    }
	    
	    class SortbyUserName implements Comparator<User> 
	    { 
	     

	@Override
	public int compare(User o1, User o2) {
	
	return o1.getUserName().compareToIgnoreCase(o2.getUserName());
	} 
	    }
	private boolean formatPhone(String phone) {
	
	boolean validate=phone.matches("[0-9]{10}");
	return validate;
	}
	private boolean formatPassword(String password2) {
	
	String regex = "^(?=.*[0-9])"
	                + "(?=.*[a-z])(?=.*[A-Z])"
	                + "(?=.*[@#$%^&+=!])"
	                + "(?=\\S+$).{8,20}$";
	Pattern p = Pattern.compile(regex); 
	Matcher m = p.matcher(password2); 
	return m.matches(); 
	}

	public boolean formatEmail(String email2) {
	
	String regex = "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regex);

	   Matcher matcher = pattern.matcher(email2);

	return matcher.matches();
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
	
}
