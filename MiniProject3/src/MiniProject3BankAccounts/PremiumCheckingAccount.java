package MiniProject3BankAccounts;

public class PremiumCheckingAccount extends CheckingAccount {
	
	public PremiumCheckingAccount()
	{
		super();
	}
	
	public PremiumCheckingAccount(String n, double d)
	{
		super(n, d);
	}
	
	// returns true if sufficient funds were available to cover check
	public boolean processCheck(double amount)
	{
		if (withdraw(amount)) {
			return true;
		} else {
			chargeFee(amount);
			letterToCustomer("Courtesy note: you have overdrawn your account, no overdraft fee, but please deposit funds.");
			return false;
		}
	}
	

}
