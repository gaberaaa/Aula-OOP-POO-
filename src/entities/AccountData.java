package entities;

public class AccountData {
	
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;

	
	
	
	
	public AccountData(int accountNumber, String accountHolder) {

		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}


	public AccountData(int accountNumber, String accountHolder, double initialDeposit) {
		
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);

	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}



	public void deposit (double accountBalance) {
		this.accountBalance += accountBalance;
	}
	
	public void withdraw (double accountBalance) {
		this.accountBalance -= (accountBalance+ 5.00);
		
	}
	
	public String toString() {
		return "Account "
				+accountNumber
				+", Holder: "
				+accountHolder
				+", Balance: $ "
				+String.format("%.2f", accountBalance);
	}
	

}
