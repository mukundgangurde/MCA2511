import java.util.Scanner;

class PQNode
{
	int data;
	int priority;
	PQNode next;

	public PQNode(int d, int p)
	{
		data = d;
		priority = p;
		next = null;
	}//Default Constructor
}//end of PQNode

class PQueue
{
	PQNode front;
	PQNode rear;

	public PQueue()
	{
		front = null;
		rear = null;
	}//Default Constructor

	//Enqueue in order of Priority
	public void Enqueue(int d, int p)
	{
		//Make a new Node
		PQNode t = new PQNode(d,p);

		//First Node in th PQ
		if(front == null)
		{
			front = t;
			rear = t;
			return;
		}

		//Traverse based on Priority

		PQNode tmp = front;
		PQNode prev = null;

		while(tmp != null && tmp.priority < t.priority)
		{
			prev = tmp;
			tmp = tmp.next;
		}

		//Insert node based on priority
		if(tmp == front)		//Front NOde Insertion
		{
			t.next = front;
			front = t;
		}
		else if(tmp == null)
		{
			rear.next = t;
			rear = t;
		}
		else
		{
			prev.next = t;
			t.next = tmp;
		}
	}//end of Enqueue

	//Dequeue
	public void Dequeue()
	{

		//Check Empty Queue
		if(front == null)
		{
			System.out.println("Queue Underflowed...");
			return;
		}

		System.out.println("Element Removed is " + front.data + " with priority: " + front.priority);
		if(front==rear)		//Single element Deletion
		{
			front= null;
			rear = null;
		}
		else
		{
			front = front.next;
		}		
		System.out.println();
	}//end of Dequeue


	//Peek Front
	public void PeekFront()
	{
		PQNode tmp = front;

		//Check Empty Queue
		if(front == null)
		{
			System.out.println("Queue Underflowed...");
			return;
		}

		System.out.println("\nPriority Front contains---");
		System.out.println("Elements\tPriority- ");
		System.out.println(tmp.data + "\t\t" + tmp.priority);
		System.out.println();
	}//end of PeekFront

	//Peek Rear
	public void PeekRear()
	{
		PQNode tmp = front;

		//Check Empty Queue
		if(front == null)
		{
			System.out.println("Queue Underflowed...");
			return;
		}

		System.out.println("\nPriority Rear contains---");
		System.out.println("Elements\tPriority- ");
		while (tmp != null)
		{
			if(tmp.next == null)
			{
				System.out.println(tmp.data + "\t\t" + tmp.priority);
			}
			tmp = tmp.next;
		}
		System.out.println();
	}//end of PeekRear

	//Display
	public void Display()
	{
		PQNode tmp = front;

		//Check Empty Queue
		if(front == null)
		{
			System.out.println("Queue Underflowed...");
			return;
		}

		System.out.println("\nPriority Queue contains---");
		System.out.println("Elements\tPriority- ");
		while (tmp != null)
		{
			System.out.println(tmp.data + "\t\t" + tmp.priority);
			tmp = tmp.next;
		}
		System.out.println();
	}//end of Display
}//end of PQueue

class PQ
{
	public static void main(String[] args)
	{
		PQueue p = new PQueue();
		Scanner sc = new Scanner(System.in);
		int ch,x,y;

		do
		{
			System.out.println("\n------------------------------------");
			System.out.println("-----------Priority Queue-----------");
			System.out.println("------------------------------------");
			System.out.println("1. Enqueue in Priority Queue");
			System.out.println("2. Dequeue from Priority Queue");
			System.out.println("3. Peek Front in Priority Queue");
			System.out.println("4. Peek Rear in Priority Queue");
			System.out.println("5. Display Priority Queue");
			System.out.println("6. Exit.....\n");

			System.out.print("Enter your choice: ");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1:
					System.out.print("Enter your value: ");
					x = sc.nextInt();
					System.out.print("Enter your Priority: ");
					y = sc.nextInt();
					p.Enqueue(x,y);
				break;

				case 2:
					p.Dequeue();
				break;

				case 3:
					p.PeekFront();
				break;

				case 4:
					p.PeekRear();
				break;

				case 5:
					p.Display();
				break;

				case 6:
					System.out.println("Exiting ...  :)");
				break;

				default:
					System.out.println("Incorrect choice :(");
				break;
			}
		} while (ch != 6);
		
	}//end of psvm
}//end of PQ