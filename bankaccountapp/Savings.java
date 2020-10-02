package bankaccountapp;

public class Savings extends Account {
	// List properties specific to savings account
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
	// Call constructor to initialise savings account properties
	public Savings(String name, String sSN, double initdeposit) {
		super(name, sSN, initdeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDeposutBox();
	}
	
	
	public void setRate() {
		rate = setBaseRate() - .25;
	}
	
	private void setSafetyDeposutBox() {
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	
	// List any methods specific to the savings account
	public void showinfo() {
		super.showinfo();
		System.out.println(
				" Your Savings Account Features" +
				"\n Your Safety Deposit Box ID: " + safetyDepositBoxId +
				"\n Your Safety Deposit Box Key: " + safetyDepositBoxKey);
	}
}
