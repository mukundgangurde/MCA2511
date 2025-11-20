import java.util.Scanner;

//Node template
class Node
{
	int data;
	Node next;

	public Node(int d)
	{
		data = d;
		next = null;
	}
}//end of Node

//Lsit based Stack Template
class ListStack
{
	Node tos;

	public ListStack()
	{
		tos = null;
	}//end of ListStack Constructor

	//Push
	public void Push(int x)
	{
		Node t = new Node(x);

		if(tos == null)
		{
			tos = t;
		}
		else
		{
			t.next = tos;
			tos = t;
		}
		System.out.println(t.data + " Pushed into stack");
	}//end of Push

	//Pop
	public void Pop()
	{
		Node tmp = tos;

		if(tmp == null)
		{
			System.out.println("Stack Underflowed!");
			return;
		}
		System.out.println(tos.data + " Popped from stack");
		tos = tmp.next;
	}//end of Pop

	//Peek
	public void Peek()
	{
		Node tmp = tos;

		if(tmp == null)
		{
			System.out.println("Stack Underflowed!");
		}
		else
		{
			System.out.println("Element at the top is: " + tmp.data);
		}
	}//end of Peek

	//Display
	public void Display()
	{
		Node tmp = tos;

		if(tmp == null)
		{
			System.out.println("Stack Underflowed!");
			return;
		}
		System.out.print("Stack contains ");
		while(tmp != null)
		{
			System.out.print(tmp.data+ " ");
			tmp = tmp.next;
		}
	}//end of Display
}//end of ListStack

//Main
class LStack
{
	public static void main(String[] args)
	{
		ListStack s= new ListStack();
		Scanner sc = new Scanner(System.in);
		int ch, x;

		do
		{
			System.out.println("\n\nList Based Stack\n");

			System.out.println("1. Push an Element in the Stack");
			System.out.println("2. Pop an Element from the Stack");
			System.out.println("3. Peek at the Stack");
			System.out.println("4. Display the Stack");
			System.out.println("5. Exit");

			System.out.print("Enter your choice :");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1:
					System.out.println("Enter a value: ");
					x = sc.nextInt();
					s.Push(x);
				break;

				case 2:
					s.Pop();
				break;

				case 3:
					s.Peek();
				break;

				case 4:
					s.Display();
				break;

				case 5:
					System.out.println("Exiting....");
				break;

				default:
					System.out.println("Incorrect Choice: ");
				break;
			}
		} while(ch!=5);
	}//end of psvm
}//end of LStack