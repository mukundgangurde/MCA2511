//Design calculator Interface with 4 methods and implement it. Design a test class to Demonstrate it.

interface ICalculator
{
	int add(int a,int b);
	int sub(int a,int b);
	int mul(int a,int b);
	int div(int a,int b);
}

class Calculator implements ICalculator
{
	public int add(int a, int b)	{return a+b;}
	public int sub(int a, int b)	{return a-b;}
	public int mul(int a, int b)	{return a*b;}
	public int div(int a, int b)	{return a/b;}
}

class CalculatorTest
{
	public static void main(String[] args)
	{
		Calculator c1 = new Calculator();
		int a = 22;
		int b = 4;
		System.out.println("Addition is "+c1.add(a,b));
		System.out.println("Subtraction is "+c1.sub(a,b));
		System.out.println("Multipliaction is "+c1.mul(a,b));
		System.out.println("Division is "+c1.div(a,b));
	}
}