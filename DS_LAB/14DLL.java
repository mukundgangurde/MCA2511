import java.util.Scanner;

class DNode
{
	int data;
	DNode prev;
	DNode next;

	DNode(int d)
	{
		data = d;
		prev = null;
		next = null;
	}
}//end of DNode

//DList
class DList
{
	DNode head;
	DNode tail;

	public DList()
	{
		head = null;	
		tail = null;
	}

	//Insert
	public void Insert(int x)
	{
		//1. Make a new node t
		DNode t =new DNode(x);
		
		//2. First node in DLL
		if(head == null)
		{
			head = t;
			tail = t;
		}
		else	//3. Link t at the end of the DLL
		{
			tail.next = t;
			t.prev = tail;
			tail = t;
		}
	}//end of Insert

	//Delete
	public void Delete(int x)
	{
		//1. Search for x
		DNode tmp = head;
		DNode p = null;
		boolean flag = false;

		while(tmp!=null)
		{
			if(tmp.data == x)
			{
				flag = true;
				break;
			}
			p = tmp;
			tmp = tmp.next;
		}
		
		//2. Unsuccessful  Search
		if(flag == false)
		{
			System.out.println(x + "is not found");
			return;
		}

		//3. Successful Search
		if(tmp == head && tmp == tail)	//A. Single node Deletion
		{
			head = null;
			tail = null;
		}
		else if (tmp == head)		//B. Head Node Deletion
		{
			head = tmp.next;
			head.prev = null;
		}
		else if (tmp == tail)		//C. Tail node Deletion
		{
			tail = p;
			tail.next = null;
		}
		else 				//D. Any other node deletion
		{
			p.next = tmp.next;
			tmp.next.prev = p;
		}
	}//end of Delete

	//Search
	public void Search(int x)
	{
		DNode tmp = head;
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
		if(flag==true)
		{
			System.out.println(x+ " is found");
		}
		else
		{
			System.out.println(x+ " is not found");
		}
	}//end of Search

	//Count
	public void Count()
	{
		DNode tmp = head;
		int cnt = 0;

		while(tmp!=null)
		{
			cnt++;
			tmp = tmp.next;
		}
		System.out.println("There are "+ cnt + " nodes");
	}//end of Count

	//Display
	public void Display()
	{
		DNode tmp = head;
		System.out.print("From head: ");
		while(tmp!=null)
		{
			System.out.print(tmp.data + "<->");
			tmp = tmp.next;
		}
		System.out.print("NULL");
		System.out.println();

		tmp = tail;
		System.out.print("From tail: ");
		while(tmp!=null)
		{
			System.out.print(tmp.data + "<->");
			tmp = tmp.prev;
		}
		System.out.print("NULL\n");
	}//end of Display
	

}//end of DList

class DLL
{
	public static void main(String[] args)
	{
		int ch;
		DList d = new DList();
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("\n*****Doubly Linked List******");
			System.out.println("1. Insert a new node in DLL");
			System.out.println("2. Delete a node in DLL");
			System.out.println("3. Search for a node in DLL");
			System.out.println("4. Count No. of Nodes in DLL");
			System.out.println("5. Display Nodes in DLL");
			System.out.println("6. Exit out");
			System.out.println();

			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.print("Enter a value: ");
					int x = sc.nextInt();
					d.Insert(x);
					d.Display();
				break;

				case 2:
					d.Display();
					System.out.print("Enter a value: ");
					x = sc.nextInt();
					d.Delete(x);
					d.Display();
				break;

				case 3:
					System.out.print("Enter a value: ");
					x = sc.nextInt();
					d.Search(x);
				break;

				case 4:
					d.Count();
				break;

				case 5:
					d.Display();
				break;

				case 6:
					System.out.println("Exiting -------   :");
				break;

				default:
					System.out.println("Incorrect .... \n");
				break;
			}


		} while (ch != 6);
	}//end of psvm
}// end of DLL