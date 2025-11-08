import java.util.*;

class ParBal
{
	public static void main(String[] args)
	{
		String expr = "((a+b)*(c+d)";

		if (isBalanced(expr))
		{
			System.out.println("The Parenthesis are balanced");
		}
		else
		{
			System.out.println("The Parenthesis are not balanced");
		}
	}// end of psvm

	public static boolean isBalanced(String ex)
	{
		char[] stack = new char[ex.length()];
		int tos = -1;

		//Scan Expression
		for (int i=0; i<ex.length(); i++)
		{
			char ch = ex.charAt(i);

			//Open parenthesis push on the stack
			if (ch=='(')
			{
				stack[++tos] = ch;
			}
			else if(ch==')')	// Close parenthesis pop
			{
				if (tos==-1)
				{
					//No matching open parenthesis
					return false;
				}
				tos--;	//Pop from the stack
			}
		} /// end of for i

		return tos==-1;		// Return if stack is empty false otherwise
	}// end of isBalanced

}// end of ParBal