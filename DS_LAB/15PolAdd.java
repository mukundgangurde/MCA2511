import java.util.Scanner;

//Node Template
class Node
{
	int coeff;
	int exp;
	Node next;

	public Node (int c, int a)
	{
		coeff = c;
		exp = a;
		next = null;
	}//end of Node Constructor
}//end of class Node

//List template for Polynomial
class Polynomial
{
	Node head;
	
	public Polynomial()
	{
		head = null;
	}

	//Insert
	void Insert(int c, int e)
	{
		//Make a new Node
		Node t = new Node(c,e);
		
		//First Node in the list
		if(head == null)
		{
			head = t;
			return;
		}

		//Traverse and check for order in exponent
		Node tmp = head;
		Node prev = null;

		//Find location for t
		while(tmp!=null && t.exp < tmp.exp)
		{
			prev = tmp;
			tmp = tmp.next;
		}

		//Insert at right location
		if(tmp == head)		//Head Node Insertion
		{
			t.next = tmp;
			head = t;
		}
		else if (tmp == null)	//Tail Node Insertion
		{
			prev.next = t;
		}
		else			//Any other node Deletion
		{
			prev.next = t;
			t.next = tmp;
		}
	}//end of Insert

	//Display
	public void Display()
	{
		//CHeck for Empty List
		if(head == null)
		{
			System.out.println("Empty List");
			return;
		}

		//Traverse and check for order in exponent
		Node tmp = head;

		//Find location for t
		while(tmp!=null)
		{
			System.out.print(tmp.coeff + "x^" + tmp.exp);
			if(tmp.next!=null)
			{
				System.out.print(" + ");
			}
			tmp = tmp.next;
		}
	}//end of Display

	//Sum / Addition

}//end of Polynomial

class PolAdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Polynomial p1 = new Polynomial();
		Polynomial p2 = new Polynomial();

		System.out.println("Enter the number of terms in Polynomial 1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter Polynomial 1: (coeff,exp) ");

		for(int i = 1; i<=n1 ; i++)
		{
			int c = sc.nextInt();
			int e = sc.nextInt();
			p1.Insert(c,e);
		}

		System.out.print("Polynomial 1: ");
		p1.Display();

	}//end of psvm
}//end of PolAdd