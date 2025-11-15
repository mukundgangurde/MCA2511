class BankAccount
{
	//Data members
	private int acNo;
	private String name;
	private double balance;

	//Add a No arg constructor
	BankAccount()
	{
		this.acNo=0;
		this.name=null;
		this.balance=0.0;
	}
	
	//Add a Parameterized Constructor
	BankAccount(int acNo, String name, double balance)
	{
		this.acNo=acNo;
		this.name=name;
		this.balance=balance;
	}

	// Getters for acNo, name, balance
	public int getAcNo()
	{
		return this.acNo;
	}
	public String getName()
	{
		return this.name;
	}
	public double getBalance()
	{
		return this.balance;
	}

	// Add Deposit Method
	void deposit(double amt)
	{
		this.balance += amt;
	}

	// Withdraw 
	public boolean withdraw(double amt)
	{
		if(this.balance>=amt)
		{
			//withdraw Success
			this.balance -= amt;
			return true;
		}
		else
		{
			//failure
			return false;
		}
	}
	
}

public class BankAccountImpl
{
	public static void main(String[] args)
	{
		BankAccount b1 = new BankAccount(101,"Mukund",25000);
		System.out.println("AC no. : "+ b1.getAcNo());
		System.out.println("AC Name : "+ b1.getName());
		System.out.println("AC Balance : "+ b1.getBalance());

		// call deposit method
		b1.deposit(2000);
		System.out.println("AC Balance : "+ b1.getBalance());

		// call withdraw
		if(b1.withdraw(5000))
		{
			System.out.println("Withdrawed Successfully...");
		}
		else
		{
			System.out.println("Insufficient Balance...");
		}
		System.out.println("AC Balance : "+ b1.getBalance());
	}
}

