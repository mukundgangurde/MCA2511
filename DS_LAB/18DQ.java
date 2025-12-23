import java.util.Scanner;

//Node template
class Node
{
	int data;
	Node prev;
	Node next;

	public Node(int d)
	{
		data = d;
		prev = null;
		next = null;
	}
}//end of Node class

//Double Ended Queue Template
class DQueue
{
	Node front;
	Node rear;

	public DQueue()
	{
		front = null;
		rear = null;
	}//end of DQueue

	//Enqueue Front
	public void EnqueueFront(int x)
	{
		//Make a new node
		Node t = new Node(x);

		//First Node
		if(front==null)
		{
			front = t;
			rear = t;
		}
		else	//Attach t to front
		{
			t.next = front;
			front.prev = t;
			front = t;
		}
	}//end of EnqueueFront

	//Enqueue Rear
	public void EnqueueRear(int x)
	{
		//Make a new node
		Node t = new Node(x);

		//First Node
		if(front==null)
		{
			front = t;
			rear = t;
		}
		else	//Attach t to rear
		{
			t.prev = rear;
			rear.next = t;
			rear= t;
		}
	}//end of EnqueueRear

	//Dequeue Front
	public void DequeueFront()
	{
		if(front==null)
		{
			System.out.println("Queue Underflowed");
			return;
		}
		System.out.println("Element removed is " + front.data);
		if(front==rear)
		{
			front = null;
			rear = null;
		}
		else
		{
			front = front.next;
			front.prev = null;
		}
	}//end of DequeueFront

	//Dequeue Rear
	public void DequeueRear()
	{
		if(front==null)
		{
			System.out.println("Queue Underflowed");
			return;
		}
		System.out.println("Element removed is " + rear.data);
		if(front==rear)
		{
			front = null;
			rear = null;
		}
		else
		{
			rear = rear.prev;
			rear.next = null;
		}
	}//end of DequeueRear

	//Display
	public void Display()
	{
		System.out.print("Element in forward Direction: ");
		Node tmp = front;
		while(tmp!=null)
		{
			System.out.print(tmp.data+ " ");
			tmp = tmp.next;
		}

		System.out.println();

		System.out.print("Element in reverse Direction: ");
		tmp = rear;
		while(tmp!=null)
		{
			System.out.print(tmp.data+ " ");
			tmp = tmp.prev;
		}
	}//end of Display

}//end of DQueue

// Main
class DQ
{
	public static void main(String[] args)
	{
		DQueue d = new DQueue();
		Scanner sc = new Scanner(System.in);
		int ch, x;

		do
		{
			System.out.println("\n------------------");
			System.out.println("Double Ended Queue");
			System.out.println("------------------\n");

			System.out.println("1. Enqueue Front");
			System.out.println("2. Enqueue Rear");
			System.out.println("3. Dequeue Front");
			System.out.println("4. Dequeue Rear");
			System.out.println("5. Display");
			System.out.println("6. Exit....\n");

			System.out.print("Enter your Choice: ");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1:
					System.out.print("Enter a value: ");
					x = sc.nextInt();
					d.EnqueueFront(x);
				break;

				case 2:
					System.out.print("Enter a value: ");
					x = sc.nextInt();
					d.EnqueueRear(x);
				break;

				case 3:
					d.DequeueFront();
				break;

				case 4:
					d.DequeueRear();
				break;

				case 5:
					d.Display();
				break;

				case 6:
					System.out.println("Exiting ...... :)");
				break;

				default:
					System.out.println("Incorrect Choice .... :(");
				break;
			}
		}while (ch != 6);
	}//end of psvm
}//end of DQ











