package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// Create an accounts List
		List<Account> accounts = new LinkedList<Account>();
		
		// File Name
		String file = "C:\\Users\\Downloads\\NewBankAccounts.csv";
		
		
		// Read CSV Data then create relevant accounts
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR: Unable to read Account Type");
			}
		
		}

		for (Account acc : accounts) {
			acc.showinfo();
			System.out.println("\n********************");
		}
	}
}
