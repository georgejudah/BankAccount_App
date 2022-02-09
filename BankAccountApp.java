package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
	    List<Account> accounts = new LinkedList<Account>();
	    		
		/*
		Checking chkacc1 = new Checking("Tom Curran","321456879",1500);
	    Savings savacc1 = new Savings("Rich Lowe","456657897",2500);
	    savacc1.showInfo();
		System.out.println("*********");
		chkacc1.showInfo();
		*/
	    
		
		
		
	
	    String file = "D:\\NewBankAccounts.csv"; 
		//Read a CSV file create new accounts based on that data
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			 System.out.println("NEW ACCOUNT");
			 String name = accountHolder[0];
			 String sSn = accountHolder[1];
			 String accountType = accountHolder[2];
			 double initDeposit = Double.parseDouble(accountHolder[3]);
			 System.out.println(name + " " + sSn + " " + accountType + " $" + initDeposit);
			 if(accountType.equals("Savings")) {
				 accounts.add(new Savings(name , sSn , initDeposit));
			 }
			 else if (accountType.equals("Checking")) {
				 System.out.println("OPEN A CHECKING ACCOUNT");
				 accounts.add(new Checking(name , sSn , initDeposit));
			 }
			 else {
				 System.out.println("ERROR READING ACCOUNT TYPE");
			 }
		}
		
		
		for (Account acc : accounts) {
	        System.out.println("\n************");
			acc.showInfo();	
		}
		

	}

}
