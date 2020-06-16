package day16Assignment;

public class SavingsAccount extends Account {
	

	public void transact(Account obj, String transOpt, double amt) throws TranscationException  {
	
		double balance= obj.getBalance();
		if(transOpt.equalsIgnoreCase("withdraw"))
		{
			if(balance<amt)
			{
				throw new TranscationException("balance is less");
			}
			else {
			balance=balance-amt;
			obj.setBalance(balance);
		}
		}
		else if(transOpt.equalsIgnoreCase("deposit")) {
			balance=balance+amt;
			obj.setBalance(balance);
			
			
		}
		
	}


}
