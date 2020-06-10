package day12Assignment;

interface CustomerManager{
	 void  conductMeeting();
	 void setTarget();
}

 interface EmployeeManager {

 void solveIssues();
 void approveLoan();
	
}

abstract class Employee {

	int id;
	String name;
	String phone;
	float salary;
	String designation;
	
	public abstract void assignDesignation();
}

 class Manager extends Employee implements CustomerManager,EmployeeManager{

	@Override
	public void solveIssues() {
		
		System.out.println("Solve issues");
	}

	@Override
	public void approveLoan() {
		
		System.out.println("approve loan");
	}

	@Override
	public void conductMeeting() {
		
		System.out.println("Conduct the meeting");
		
	}

	@Override
	public void setTarget() {
		
		System.out.println("Setting the target");
		
	}

	@Override
	public void assignDesignation() {
		
		System.out.println("Assign designation");
		
	}
}

class Office {

	public static void main(String[] args) {
		
		Manager man= new Manager();
		man.approveLoan();
		man.assignDesignation();
		man.conductMeeting();
		man.solveIssues();
		man.setTarget();
		
	}

}
