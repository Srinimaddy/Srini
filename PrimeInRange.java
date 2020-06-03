import java.util.Scanner;

public class PrimeInRange {
	int minNumber,maxNumber;
	Scanner sc;
	
	public PrimeInRange() {
		minNumber = maxNumber = 0;
		sc = new Scanner(System.in);
	}
	
	void getNumbersFromUser() {
		System.out.println("User user enter the min number");
		minNumber = sc.nextInt();
		System.out.println("User user enter the max number");
		maxNumber = sc.nextInt();
		if(minNumber>=maxNumber)
		{
			System.out.println("Incorrect entries... Please try again..");
			getNumbersFromUser();
		}
	}
	
	boolean CheckIfPrimeOrNot(int num) {
		boolean result = true;
		
		for(int i = 2; i< num-1; i++) {
			if(num%i == 0)
			{
				result = false;
				break;
			}
		}
		return result;
		
	}
	
	void CheckRangeForPrime() {
		for(int i = minNumber; i <= maxNumber; i++) {
			System.out.println(i+" - ");
			if(CheckIfPrimeOrNot(i)==true)
				System.out.println("prime");
			else
				System.out.println("Not prime");
			
		}
	}

	public static void main(String[] args) {
		PrimeInRange primeInRange = new PrimeInRange();
		primeInRange.CheckRangeForPrime();
		

	}

}
