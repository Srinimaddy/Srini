import java.util.Scanner;
public class CardValidation {

	String cardNumber;
	int[] intCardNumbers,reverseCardNumber;
	Scanner sc;
	
	CardValidation(){
		intCardNumbers = new int[16];
		reverseCardNumber = new int[16];
		sc = new Scanner(System.in);
	}
 
	void getCardNumber() {
		System.out.println("Please enter you 16 digit vard number without any space");
		cardNumber =sc.nextLine();
		if(cardNumber.length() !=16) 
		{
			System.out.println("Invalid card number. Please try entering again!!!");
			getCardNumber();
		 	
		}
			
	} 
	void converStringCardNumberToIntArray() {
		for (int i=0; i < cardNumber.length(); i++) {
			intCardNumbers[i]= Integer.parseInt(cardNumber.substring(i,1));
		}
	}
	void reverseCardNumber() 
	{
		int reverseCardNumber;
		for(int i = 0; i < intCardNumbers.length;i++) {
			reverseCardNumber[j]= intCardNumbers[i];
			j--;
			
		}
		
	}
	boolean validateCard() 
	{
		boolean result = false;
		for(int i=0; i<reverseCardNumber.length; i++) 
		{
		 if(i%2 !=0) 
		{
			reverseCardNumber[i] = reverseCardNumber[i]*2;
			if(reverseCardNumber[i]>9) 
			{
				reverseCardnumber[i] = reverseCardNumber[i]-9;			}
		}
	}
	sum = sum + reverseCardNumber[i];
	}
	if(sum%10 == 0)
		result = true;
	return result;
	public static void main(String[] args) {
		

	}

}
