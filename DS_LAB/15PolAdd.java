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
		//Check for Empty List
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
			System.out.print(Math.abs(tmp.coeff) + "x^" + tmp.exp);
			if(tmp.next!=null)
			{
				if(tmp.next.coeff > 0)
					System.out.print(" + ");
				else
					System.out.print(" - ");
			}
			tmp = tmp.next;
		}
	}//end of Display

	//Sum / Addition
	static Polynomial addPolynomial (Polynomial p1, Polynomial p2)
	{
		Polynomial res = new Polynomial();
		Node a = p1.head;
		Node b = p2.head;

		while(a!=null && b!=null)
		{
			if(a.exp > b.exp)
			{
				res.Insert(a.coeff, a.exp);
				a = a.next;
			}
			else if(a.exp < b.exp)
			{
				res.Insert(b.coeff,b.exp);
				b = b.next;
			}
			else
			{
				int tot = a.coeff + b.coeff;
				res.Insert(tot,a.exp);
				a = a.next;
				b = b.next; 
			}
		}//end of while a AND b

		//Add remaining terms from a
		while(a!=null)
		{
			res.Insert(a.coeff,a.exp);
			a = a.next;
		}

		//Add remaining terms from a
		while(b!=null)
		{
			res.Insert(b.coeff,b.exp);
			b = b.next;
		}

		return res;
	}
}//end of Polynomial

class PolAdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Polynomial p1 = new Polynomial();
		Polynomial p2 = new Polynomial();

		System.out.print("Enter the number of terms in Polynomial 1: ");
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

		System.out.println();
		System.out.print("Enter the number of terms in Polynomial 2: ");
		int n2 = sc.nextInt();
		System.out.println("Enter Polynomial 2: (coeff,exp) ");

		for(int i = 1; i<=n2 ; i++)
		{
			int c = sc.nextInt();
			int e = sc.nextInt();
			p2.Insert(c,e);
		}

		System.out.print("Polynomial 2: ");
		p2.Display();

		System.out.println();
		System.out.println();
		System.out.println("Sum of the Polynomial: ");
		Polynomial result = new Polynomial();
		result = result.addPolynomial(p1,p2);

		result.Display();


	}//end of psvm
}//end of PolAdd