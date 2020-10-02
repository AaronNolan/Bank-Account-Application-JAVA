package bankaccountapp;

public class Checking extends Account {
	// List properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	// Call constructor to initialise checking account properties
	public Checking(String name, String sSN, double initdeposit) {
		super(name, sSN, initdeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	public void setRate() {
		rate = setBaseRate() * .15;
	}
	
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12)); 
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	// List any methods specific to the checking account
	public void showinfo() {
		super.showinfo();
		System.out.println(
				" Your Checking Account Features" +
				"\n Your Debit Card Number: " + debitCardNumber +
				"\n Your Debit Card PIN: " + debitCardPin);
	}
}
