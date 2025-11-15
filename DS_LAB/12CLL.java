import java.util.Scanner;

//CNode Template
class CNode
{
	int data;
	CNode next;

	public CNode(int d)
	{
		data = d;
		next = null;
	}
}//end of CNode

//CList Template
class CList
{
	CNode head;
	CNode tail;

	public CList()
	{
		head = null;
		tail = null;
	}

	//Insert
	public void Insert(int x)
	{
		//1. Make a new node
		CNode t = new CNode(x);

		//2. First node in the CLL
		if(head == null)
		{
			head = t;
			tail = t;
			tail.next = head;
		}
		else	//3. Any other node - insert at the end of CLL
		{
			tail.next = t;		//Connect tail to t 
			tail = t;		//Update tail
			tail.next = head;	//Update Circularity
		}
	}

	//Delete
	public void Delete(int x)
	{
		//1. Search for x
		CNode tmp = head;
		CNode prev = null;
		boolean flag = false;

		do
		{
			if(tmp.data == x)
			{
				flag = true;
				break;
			}
			prev = tmp;
			tmp = tmp.next;
		}
		while (tmp!=head);

		//2. x is not found
		if(flag == false)
		{
			System.out.println(x + " is not found");
			return;
		}

		//3. x is found
		if(tmp == head && tmp == tail)	//3a. Single Node Deletion
		{
			head = null;
			tail = null;
		}
		else if	(tmp==head)		//3b. Head Node Deletion
		{
			head = tmp.next;
			tail.next = head;
		}
		else if (tmp==tail)		//3c. Tail Node Deletion
		{
			tail = prev;
			tail.next = head;
		}
		else				//3d. Any other node
		{
			prev.next = tmp.next;
		}
	}

	//Search
	public void Search(int x)
	{
		CNode tmp = head;
		boolean flag = false;
		if(tmp == null)
		{
			System.out.println("Empty CLL");
			return;
		}
		do
		{
			if(tmp.data == x)
			{
				flag = true;
			}
			tmp = tmp.next;
		} while (tmp!=head);

		if(flag)
		{
			System.out.println("Element Found :)");
		}
		else
		{
			System.out.println("Element not Fount :(");
		}
	}

	//Count
	public void Count()
	{
		CNode tmp = head;
		int count = 0;
		if(tmp == null)
		{
			System.out.println("Empty CLL");
			return;
		}
		do
		{
			count++;
			tmp = tmp.next;
		} while (tmp!=head);
		System.out.print("No. of Nodes are "+count);
	}

	//Display
	public void Display()
	{
		CNode tmp = head;
		if(tmp == null)
		{
			System.out.println("Empty CLL");
			return;
		}
		System.out.print("Circular Linked List contains ");
		do
		{
			System.out.print(tmp.data + " -> ");
			tmp = tmp.next;
		} while (tmp!=head);
			System.out.print("Back to head\n");
	}

}//end of CList

//CLL
class CLL
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		CList c = new CList();
		int ch;

		do
		{			
			System.out.println("\n----Circular Linked List----");
			System.out.println("1. Insert a node in CLL");
			System.out.println("2. Delete a node in CLL");
			System.out.println("3. Search for a Node in CLL");
			System.out.println("4. Count No. of Nodes in CLL");
			System.out.println("5. Display the CLL");
			System.out.println("6. Exit");

			System.out.print("Enter your choice: ");
			ch = sc.nextInt();

			switch(ch)
			{

				case 1:
					System.out.print("Enter a Value: ");
					int x = sc.nextInt();
					c.Insert(x);
					c.Display();
				break;

				case 2:
					c.Display();
					System.out.print("Enter a Value: ");
					x = sc.nextInt();
					c.Delete(x);
					c.Display();
				break;

				case 3:
					System.out.print("Enter a Element to find: ");
					x = sc.nextInt();
					c.Search(x);
				break;

				case 4:
					c.Count();
				break;

				case 5:
					c.Display();
				break;

				case 6:
					System.out.println("Exiting..... :)");
				break;

				default:
					System.out.println("Incorrect Choice... Try again...");

			}//end of switch

		} while (ch != 6);	//end of do-while
	}//end of psvm
}//end of class