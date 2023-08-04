package MiniProject3BankAccounts;

public class CheckingAccount extends BankAccount {
	private static final int FREE_CHECKS_PER_MONTH = 3; // this account type offers 3 free checks per month
	private static final double FEE_PER_CHECK = 1.50; // Each check past the monthly max costs $1.50 to process.
	private static final double OVERDRAFT_FEE = 25;   // Charge $25 to account in case of overdraft
	private int checksThisMonth;
	
	public CheckingAccount()
	{
		checksThisMonth = 0;		
	}
	
	// open a new checking account, n is the name of the account-holder
	public CheckingAccount(String n, double d)
	{
		super(n, d);
		checksThisMonth = 0;
	}
	
	public void startNewMonth()
	{
		// reset the count of checks so far this month
		checksThisMonth = 0;
		
	}
	
	public boolean processCheck(double amount)
	{
		checksThisMonth++;
		if (withdraw(amount)) {
			if (checksThisMonth > FREE_CHECKS_PER_MONTH) {
				chargeFee(FEE_PER_CHECK);
			}
			return true;
		} else {
			chargeFee(OVERDRAFT_FEE);
			letterToCustomer("You have overdrawn your account. The check was unpaid, and you are charged a $25 returned check fee");
			return false;
		}	
	}
	
	public void printStatement()
	{
		super.printStatement();
		System.out.println("Checks so far this month: " + checksThisMonth);
	}
 
}
