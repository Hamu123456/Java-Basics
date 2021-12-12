package SimpleBankAccount;

public class Account {
		  private double balance;

		  // set balance to zero
		  public Account() {
		    balance = 0;
		  }

		  // deposit
		  public void deposit(double amount) {
		    balance = balance + amount;
		    System.out.println();
		  }

		  // withdraw 
		  public void withdraw(double amount) {
			  if (amount <= balance) {
			      balance = balance - amount;
			      System.out.println("You have withdrawn " + amount + " and have a balance of " + balance);
			    }

			    else {
			      System.out.println("Transaction cancelled due to insufficent funds");
			    }
		  }

		  // get balance
		  public double getBalance() {
		    return balance;
		  }

		    
		  
		}


