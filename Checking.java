package bankaccountapp;

public class Checking extends Account {

	 //List properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	//Constructor to  initialise checking account properties 
	public Checking(String name, String sSn, double initDeposit) {
		super(name, sSn,initDeposit );
		accountNumber = "2" + accountNumber;
		setDebitCard();
		
		
	
		}
	@Override
	public void setRate() {
		rate = getBaseRate() * .15; 
	}
	
	//List any methods specific to checking account
	private void setDebitCard() {
		debitCardNumber =(int) (Math.random() * Math.pow(10, 12));
		debitCardPIN =(int) (Math.random() * Math.pow(10, 4));
	}

     public void showinfo() {
    	super.showInfo();
        System.out.println("YOUR CHECKING ACCOUNT FEATURES" +
    	   "\n Debit Card Number: " + debitCardNumber +
    	   "\n Debit Card PIN: " + debitCardPIN 
    	   );
     }
}