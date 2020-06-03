
public class SavingsAccount extends Account {
	
	SavingsAccount()
	{
		System.out.println("Savings type");
	}
	
	SavingsAccount(String accountNum, String name)
	{
		this.accountNum = accountNum;//Instance member = parameter
		this.name = name;//this is a ref to the current object
		
	}
	
}
