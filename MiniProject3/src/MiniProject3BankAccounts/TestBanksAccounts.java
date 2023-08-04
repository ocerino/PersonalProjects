package MiniProject3BankAccounts;

public class TestBanksAccounts {

	public static void main(String[] args) {
		BankAccount[] allAccounts = new BankAccount[5];
		
		allAccounts[0] = new SavingsAccount("Warren Buffet", 10000000);
		allAccounts[1] = new CheckingAccount("Oprah Winfrey", 50000);		
		allAccounts[2] = new PremiumCheckingAccount("Homer Simpson", 100);	
		allAccounts[3] = new BankAccount("Marie Curie", 1000);
		allAccounts[4] = new PremiumCheckingAccount();

		// Warren attempts to write a check:
		allAccounts[0].processCheck(100000);
		
		// Marie attempts to write a check
		allAccounts[3].processCheck(10);
		
		// Oprah writes five checks. The first four clear, but the last doesn't.
		for (int i = 0; i < 5; i++)
			allAccounts[1].processCheck(12000.00);
		
		// Homer writes a check beyond what the funds in his account will cover:
		allAccounts[2].processCheck(130);
		
		for (int i = 0; i < allAccounts.length; i++)
			allAccounts[i].startNewMonth();
				
		
		for (int i = 0; i < allAccounts.length; i++) {
			allAccounts[i].printStatement();
			System.out.print("\n");
		}
				
		

	}

}
