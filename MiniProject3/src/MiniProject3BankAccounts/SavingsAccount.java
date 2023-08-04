package MiniProject3BankAccounts;

public class SavingsAccount extends BankAccount {
	private double monthly_interest;
	
	public SavingsAccount()	
	{
		monthly_interest = .003; // current rate is three tenths of a percent per month.
	}
	
	public SavingsAccount(String n, double d)
	{
		super(n, d);
		monthly_interest = .003; // current rate is three tenths of a percent per month.
	}
	
	public void startNewMonth()
	{
		deposit(getBalance()*monthly_interest);
	}
	
	public void printStatement()
	{
		super.printStatement();
		System.out.println("Monthly interest on savings account: " + monthly_interest*100 + " percent.");
	}

}
