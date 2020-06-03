
public class Calculator {
	void add() {
		System.out.println("Add with no parameters");
		
	}
	void add(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Add with 2 parameters. The sum is "+sum);
	}
	void add(float num1,int num2) {
		float sum = num1+num2;
		System.out.println("Add with 2 paramers(float,int). The sum is "+sum);
		
	}
	void add(int num1,float num2) {
		float sum = num1+num2;
		System.out.println("Add with 2 paramers(int,float). The sum is "+sum);
		
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10,10.43f);
		

	}

}
