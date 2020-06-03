package bank;

public class Customer {
	
	int id,age;
	String name;
	Pan Pan;
	Customer(){
		id=101;
		age=23;
		name = "Ramu";
		Pan = new Pan();
		Pan.setPanNumber("ABCDE123333i");
		
	}
	void printCustomerDetails() {
		System.out.println("Customer id : "+id+"  name :" +name+" age :" +age);
		Pan.printPanDetails();
		
	}

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.printCustomerDetails();
		

	}

}
