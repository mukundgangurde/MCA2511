class BankAccount
{
	// Data Members
	private int accountNo;
	private String accountName;
	private double accountBal;

	//Getters & Setters to access the data - Design Pattern
	public int getAccountNo()
	{	
		return accountNo;	
	}
	public void setAccountNo(int accountNo)
	{	
		this.accountNo = accountNo;	
	}


	public String getAccountName()
	{	
		return accountName;	
	}
	public void setAccountName(String accountName)
	{	
		this.accountName = accountName;	
	}


	public String getAccountBal()
	{	
		return accountBal;	
	}
	public void setAccountBal(String accountBal)
	{	
		this.accountBal = accountBal;	
	}
}

public class BankAccountImpl
{
	public static void main(String[] args)
	{
		// Create an object of student class
		BankAccount acc1 = new BankAccount();

		//set the values
		acc1.setAccountNo(1);
		acc1.setAccountName("Mukund");
		acc1.setAccountBal(1500.50);

		//get the values
		acc1.getAccountNo();
		acc1.getAccountName();
		acc1.getAccountBal();
				
	}
}