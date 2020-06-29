package assesment_java;

public class Bank {
	
	Account account;
	Transaction transaction;
	public Bank() {
		account = new Account();
		transaction = new Transaction();
		
	}

	  public static void main(String[] a) {

          Account acc = new Account();
          acc.takeAccountDetailsFromUser();
   }
}
