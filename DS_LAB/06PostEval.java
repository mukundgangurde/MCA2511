import java.util.*;

class PostEval
{
	public static void main(String[] args)
	{
		String expr = "53*5+82/-";

		int result = CalcPostfix(expr);
		System.out.println("Result : " + result);
	}//end of psvm

	public static int CalcPostfix(String ex)
	{
		int[] stack = new int[ex.length()];	//Stack
		int tos = -1;				//TOS

		//Loop through the ex
		for(int i=0; i<ex.length();i++)
		{
			char ch = ex.charAt(i);

			//If ch is a number - push it on the stack
			if(Character.isDigit(ch))
			{
				tos++;
				stack[tos] = ch -'0';
			}
			else if (ch=='+' || ch=='-' || ch=='*' || ch=='/')
			{
				int x2 = stack[tos--];
				int x1 = stack[tos--];

				int res = 0;

				switch(ch)
				{
					case '+':
						res = x1 + x2;
						break;
					case '-':
						res = x1 - x2;
						break;
					case '*':
						res = x1 * x2;
						break;
					case '/':
						res = x1 / x2;
						break;
				}//end of switch
				//Push res back on the stack
				tos++;
				stack[tos] = res;
			}//end of if else

		}//end of for loop i

		return stack[tos];

	}//end of CalcPostfix

}//end of PostEval






















