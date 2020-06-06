import java.util.Scanner;

public class StringMatch {

	public static void main(String[] args) {
		
		char alpha1='\0';
		char alpha2='\0';
		String word="";
		char[] wordArray;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Word");
		word=sc.nextLine();
		System.out.println("Alpha 1");
		alpha1=sc.next().charAt(0);
		System.out.println("Alpha 2");
		alpha2=sc.next().charAt(0);
		wordArray=new char[word.length()];
		int count=0;
		StringBuilder sb = new StringBuilder();
	    char[] arr = word.toCharArray();
	 
	    for (char ch : arr) {
	        if (sb.indexOf(String.valueOf(ch)) != -1)
	            continue;
	        else
	            sb.append(ch);
	    }
	    word=sb.toString();
		for(int i=0;i<word.length();i++)
		{
			wordArray[i]=word.charAt(i);
			if(count==0) {
			if(wordArray[i]==alpha1  || wordArray[i]==alpha2)
			{	
				System.out.println("First "+wordArray[i]);
				count++;
				continue;
			}
			}
			if(count==1 &&( wordArray[i]==alpha1 || wordArray[i]==alpha2))
			{
			System.out.println("Then "+wordArray[i]);
			count++;
			break;
			}
			}
	
		if(count==1)
		{
		System.out.println("Only one string is present");
		}
		else if(count==2)
				{
			System.out.println("Alphabets present");
			}
		else
		{
		System.out.println("Sorry the alphabets are not present in the string");	
		}
	}
	
}
