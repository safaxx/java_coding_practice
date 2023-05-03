package java_tut;

public class BankAccount {
	
	private int accountNumber;
    private String accountHolderName;
    private double balance;

    
    
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	



	public int getAccountNumber() {
		return accountNumber;
	}





	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}





	public String getAccountHolderName() {
		return accountHolderName;
	}





	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}





	public double getBalance() {
		return balance;
	}





	public void setBalance(double balance) {
		this.balance = balance;
	}




	public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }
    
    public boolean isBalanceBelowLimit(double limit) {
        return balance < limit;
    }


    public static void main(String[] args) {
    	BankAccount myAccount = new BankAccount(123456, "Safa Khan", 1000.0);

    	myAccount.deposit(500.0);

    	myAccount.withdraw(200.0);

    	// Check if balance is below a certain limit
    	if (myAccount.isBalanceBelowLimit(100.0)) {
    	    System.out.println("Balance is below the limit.");
    	} else {
    	    System.out.println("Balance is above the limit.");
    	}
    	
    }
}
