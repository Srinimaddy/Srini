
public class Employee {
	
	int employee_id,age;
	String name;
	
	Employee(){
		employee_id =101;
		name="Ramu";
		age=25;
	}
	
	Employee(int eid,String ename,int eage){
		employee_id= eid;
		name= ename;
		age= eage;
		
	}
	boolean EmployeeAgeCheck() {
		boolean result = false;
		if(age>=18)
			System.out.println("You can join");
		else
			System.out.println("You are under age for employment");

		return result;
	}
	
	
	void work()
	{
		System.out.println("Employe e does his work");
	}
	
	void printEmployeeData() {
		System.out.println("Employee Id: "+employee_id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age :" +age);
		System.out.println("----------");
	}
	// compilation 
	public static void main(String[] args) {
		Employee e1 = new Employee();
	/*boolean checkResult = e1.EmployeeAgeCheck();*/
		if( e1.EmployeeAgeCheck() == true)
			e1.printEmployeeData();
	
	
		
		
		
	}

}
