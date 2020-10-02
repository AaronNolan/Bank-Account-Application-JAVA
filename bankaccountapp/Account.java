package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	
	private static int index = 1000;
	protected String accountNumber;
	protected double rate;
	
	// Constructor to set base properties
	public Account(String name, String sSN, double initdeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initdeposit;
		
		// Set Account Number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
	}
	
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber =(int) (Math.random() * Math.pow(10,3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound() {
		double accruedInterest = balance * rate;
		System.out.println("Accreued Interest: €" + accruedInterest);
		viewBalance();
	}
	// List common methods
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Depositing: €" + amount);
		viewBalance();
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing: €" + amount);
		viewBalance();
	}
	
	public void trasnfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Transferring €" + amount + " to " + toWhere);
		viewBalance();
	}
	

	public void viewBalance() {
		System.out.println("Balance €" + balance);
	}
	
	public void showinfo() {
		System.out.println(
				"NAME: " + name +
				"\nACCOUNT NUMBER: " + accountNumber +
				"\nBALANCE: " + balance +
				"\nRATE: " + rate + "%");
	}
}
