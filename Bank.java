
public class Bank {
	Account account;
	
	Bank(){
		
	}
	
	void createAccount() {
		account = new SavingsAccount();
		account.printAccountDetails();
	}

	public static void main(String[] args) {
		Bank icici = new Bank();
		icici.createAccount();
		
	}

}
