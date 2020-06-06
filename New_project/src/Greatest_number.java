import java.util.Scanner;

public class Greatest_number {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		   
		  System.out.print("Input the 1st number: \n ");
		  int num1 = sn.nextInt();
		   
		  System.out.print("Input the 2nd number: \n ");
		  int num2 = sn.nextInt();
		   
		  System.out.print("Input the 3rd number: \n ");
		  int num3 = sn.nextInt();
		   
		   
		  if (num1 > num2)
		   if (num1 > num3)
		    System.out.println("The greatest number is : \n" + num1);
		   
		  if (num2 > num1)
		   if (num2 > num3)
		    System.out.println("The greatest number is : \n" + num2);
		   
		  if (num3 > num1)
		   if (num3 > num2)
		    System.out.println("The greatest number is : \n" + num3);

		

	}
}

