//Design a Functional Interfaces to implement calculator

interface ICalculatorLambda
{
	int operation(int a,int b);
}

class CalculatorTestLambda
{
	public static void main(String[] args)
	{

		ICalculatorLambda add = (a,b) -> a+b;
		ICalculatorLambda sub = (a,b) -> a-b;
		ICalculatorLambda mul = (a,b) -> a*b;
		ICalculatorLambda div = (a,b) -> a/b;

		int a=22;
		int b=4;

		System.out.println("Addition is "+add.operation(a,b));
		System.out.println("Subtraction is "+sub.operation(a,b));
		System.out.println("Multiplication is "+mul.operation(a,b));
		System.out.println("Division is "+div.operation(a,b));
	}
}