package SimpleBankAccount;

public class BankMain {

	public static void main(String[] args) {
		// create cust1
	    Account cust1 = new Account(); // create an account object
	    cust1.deposit(500);

	    // create cust2
	    Account cust2 = new Account();
	    cust2.deposit(100);

	    System.out.println("Customer 1 has a balance of " + cust1.getBalance());
	    System.out.println("Customer 2 has a balance of " + cust2.getBalance());
	    
	    cust2.withdraw(100);

	}

}
