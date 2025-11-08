import java.util.Scanner;

//Class Node
class Node
{
	int data;
	Node next;

	public Node(int d)
	{
		data = d;
		next = null;
	}//end of Node DConstructor
}//end of class Node

//Class List
class List
{
	Node head;

	public List()
	{
		head = null;
	}//end of List DConstructor

	//Insert
	public void Insert(int x)
	{
		//Make a new Node
		Node t = new Node(x);

		//Fisrt node in SLL
		if(head==null)
		{
			head = t;
			return;
		}

		//3. Traverse till last node and link t
		Node tmp = head;
		while(tmp.next!=null)
		{
			tmp = tmp.next;
		}
		tmp.next = t;
	}//end of Insert

	//Delete
	public void Delete(int x)
	{
		//1. Search for x
		boolean flag = false;
		Node tmp = head;
		Node prev = null;

		while(tmp!=null)
		{
			if(tmp.data == x)
			{
				flag = true;
				break;
			}
			prev = tmp;
			tmp = tmp.next;
		}

		//2. x not found
		if(flag==false)
		{
			System.out.println(x + " is not found");
			return;
		}

		//3. x is found
		if(tmp==head && tmp.next==null)		//3a. Single Node deletion
		{
			head = null;
		}
		else if(tmp == head)			//3b. Head Node Deletion
		{
			head = tmp.next;
		}
		else if(tmp.next == null)		//3c. Tail Node Deletion
		{
			prev.next = null;
		}
		else					//3d. Any other node in the middle
		{
			prev.next = tmp.next;
		}
		System.out.println("Deleted Element Successfully");
		
	}//end of Delete
	

	//Search
	public boolean Search(int x)
	{
		Node tmp = head;
		boolean flag = false;
		while(tmp!=null)
		{
			if(tmp.data == x)
			{
				flag = true;
				break;
			}
			tmp = tmp.next;
		}
		return flag;
	}//end of Search

	//Count
	public void Count()
	{
		Node tmp = head;
		int count = 0;
		while(tmp != null)
		{
			count++;
			tmp = tmp.next;
		}
		System.out.println("No. of Nodes are " + count );
	}//end of Count

	//Display
	public void Display()
	{
		System.out.println("SLL contains: ");
		Node tmp = head;
		while(tmp !=null)
		{
			System.out.print(tmp.data + "->");
			tmp = tmp.next;
		}
	}//end of Display

}//end of class List

//Main Class SLL
class SLL
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		List s = new List();

		int ch;

		do
		{
			System.out.println("\n-------------------------");
			System.out.println(" Singly Linked List Menu");
			System.out.println("-------------------------");
			System.out.println("1. Insert at the end of SLL");
			System.out.println("2. Delete an element");
			System.out.println("3. Search for an element");
			System.out.println("4. Count the number of nodes in SLL");
			System.out.println("5. Display the SLL");
			System.out.println("6. Exit\n");

			System.out.print("Enter your Choice: ");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1:
					System.out.print("Enter a Value: ");
					int x = sc.nextInt();
					s.Insert(x);
				break;

				case 2:
					System.out.print("Enter a Value: ");
					x = sc.nextInt();
					s.Delete(x);
				break;

				case 3:
					System.out.print("Enter a Value: ");
					x = sc.nextInt();
					if(s.Search(x))
					{
						System.out.println("Data is found");
					}
					else
					{
						System.out.println("Data is not found");
					}
				break;

				case 4:
					s.Count();
				break;

				case 5:
					s.Display();
				break;

				case 6:
					System.out.println("Exiting Program...... :)");
				break;

				default:
					System.out.println("Incorrect Choice Try again");
				break;
			}

		}while(ch!=6);
	}//end of psvm
}//end of class SLL




