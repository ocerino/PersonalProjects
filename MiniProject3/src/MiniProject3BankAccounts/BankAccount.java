package MiniProject3BankAccounts;

public class BankAccount {
	private static int UniqueIDGenerator = 1000; // first account-holder will have ID 1000
	private int accountNumber; // unique identifier for this accoubnt
	private String ownerName;
	private double balance;
	
	// No-argument constructor
	public BankAccount()
	{
		accountNumber = UniqueIDGenerator;
		UniqueIDGenerator++;
		balance = 0;
		ownerName = "Unknown owner";
	}

	
	// open a new account - name of owner is passed as a parameter, d is the initial deposit.
	public BankAccount(String n, double d)
	{
		accountNumber = UniqueIDGenerator;
		UniqueIDGenerator++;
		balance = d;
		ownerName = n;	
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public boolean deposit(double amount)
	{
		if (amount >= 0) {
			balance += amount;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean withdraw(double amount)
	{
		if (amount > balance) {
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}
	
	// withdraws fee from account, allowing balance to go negative
	public void chargeFee(double amount)
	{
		balance-=amount;
	}
	
	public void startNewMonth()
	{
		
	}
	
	public void letterToCustomer(String s)
	{
		System.out.println("Letter sent to " + ownerName +": "+ s+"\n");
	}
	
	public void printStatement()
	{
		System.out.println("Name: " + ownerName + "\tAccount Number: " + accountNumber + "\tBalance: " + balance);
	}
	
	public boolean processCheck(double amount) {
		letterToCustomer("You attempted to write a check on an account that is not a checking account.");
		return false;
	}
	
	
}
