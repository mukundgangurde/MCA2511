class Student
{
	// Data Members
	private int rollNo;
	private String name;

	//Getters & Setters to access the data - Design Pattern
	public int getRollNo()
	{
		return rollNo;
	}

	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}

public class StudentImpl
{
	public static void main(String[] args)
	{
		// Create an object of student class
		Student s1 = new Student();
		
		//set the values
		s1.setRollNo(101);
		s1.setName("Mukund");

		//get the values
		System.out.println("Roll no: " + s1.getRollNo());
		System.out.println("Name: " + s1.getName());
		
	}
}