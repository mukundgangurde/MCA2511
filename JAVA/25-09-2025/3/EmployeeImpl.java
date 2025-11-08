// Title : Employee Application
// Objective : Design Employee Class and inherit it with Daily wages & Permanent Employee override necessary methods

class Employee

{
	//data members
	protected int eid;
	protected String ename;
	protected double salary;

	//Parameterized Constructor
	Employee(int eid, String ename)
	{
		this.eid = eid;
		this.ename = ename;
	}

	public int getEid()
	{
		return this.eid;
	}
	public String getEname()
	{
		return this.ename;
	}
	public double getSalary()
	{
		return this.salary;
	}
	
	//Utility Methods
	public void calSalary()
	{

	}
}// end of Employee


class DailyWagesEmp extends Employee
{
	//it has three attributes from employee - eid ename and salary
	//speacialized attributes
	double numOfDays;
	double dailyWages;

	//Define a Constructor
	DailyWagesEmp(int eid, String ename, double numOfDays, double dailyWages)
	{
		super(eid,ename);
		this.numOfDays = numOfDays;
		this.dailyWages = dailyWages;
	}

	//Override calSalary Methods
	public void calSalary()
	{
		salary = numOfDays * dailyWages;
	}
}//end of DailyWagesEmp


class PermanentEmp extends Employee
{
	//additional attributes
	static double TA = 1600;
	static double HRA = 30;
	static double DA = 120;
	static double PF = 12.5;

	double basicSal;

	// Define a constructor
	PermanentEmp(int eid, String ename, double basicSal)
	{
		super(eid,ename);
		this.basicSal = basicSal;
	}
	//Override calSalary Methods
	public void calSalary()
	{
		salary = TA + basicSal + (basicSal*HRA/100) + (basicSal*DA/100) - (basicSal*PF/100);
	}
}

class EmployeeImpl
{
	public static void printSalary(Employee temp)
	{
		System.out.println("Employee ID: " + temp.getEid());
		System.out.println("Employee Name: " + temp.getEname());
		System.out.println("Employee Salary: " + temp.getSalary());
	}

	public static void main(String[] args)
	{
		DailyWagesEmp d1 = new DailyWagesEmp(101,"MG", 29, 950);
		d1.calSalary();
		System.out.println("****** Daily Wages ******");
		printSalary(d1);

		PermanentEmp p1 = new PermanentEmp(102,"MG2", 20000);
		p1.calSalary();
		System.out.println("****** Permanent Wages ******");
		printSalary(p1);

		// Create an Array of Employee
		Employee emp[] = new Employee[2];
		emp[0] = d1;
		emp[1] = p1;
		System.out.println("****** With Array ******");

		//print these details
		for(Employee e:emp)
		{
			e.calSalary();
			printSalary(e);
		}

	}// end of psvm
}// end of EmployeeImpl