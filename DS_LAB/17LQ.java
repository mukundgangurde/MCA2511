import java.util.Scanner;

class QNode
{
	int data;
	QNode next;

	public QNode(int d)
	{
		data = d;
		next = null;
	}
}//end of QNode


//List based Queue Template
class LQueue
{
	QNode front;
	QNode rear;

	public LQueue()
	{
		front = null;
		rear = null;
	}//Default constructor

	//Enqueue
	public void Enqueue(int x)
	{
		//Make a new Node
		QNode t = new QNode(x);

		//First node in the Queue
		if(front == null)
		{
			front = t;
			rear = t;
		}
		else	//Any other Node
		{
			rear.next = t;
			rear = t;
		}
	}//end of Enqueue

	//Dequeue
	public void Dequeue()
	{
		QNode tmp = front;

		//Check Empty Queue
		if(tmp == null)
		{
			System.out.println("Queue Underflowed...");
			return;
		}

		if(front == rear && front.next == null)
		{
			front = null;
			rear = null;
		}
		else
		{
			front = front.next;
		}
		System.out.println("Element Dequeued : " + tmp.data);
	}//end of Dequeue

	//PeekFront
	public void PeekFront()
	{
		//Check Empty Queue
		if(front == null)
		{
			System.out.println("Queue Underflowed...");
		}
		else
		{
			System.out.println("Element at Peek Front: " + front.data);
		}
	}//end of PeekFront

	//PeekRear
	public void PeekRear()
	{
		//Check Empty Queue
		if(front == null)
		{
			System.out.println("Queue Underflowed...");
		}
		else
		{
			System.out.println("Element at Peek Rear: " + rear.data);
		}
	}//end of PeekRear

	//Display
	public void Display()
	{
		QNode tmp = front;

		//Check Empty Queue
		if(front == null)
		{
			System.out.println("Queue Underflowed...");
			return;
		}

		System.out.print("Queue Elements - ");
		while (tmp != null)
		{
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}
		System.out.println();
	}//end of Display
}//end of LQueue

//Menu Main class & method
class LQ
{
	public static void main(String[] args)
	{
		LQueue q = new LQueue();
		Scanner sc = new Scanner(System.in);
		int ch, x;

		do
		{
			System.out.println("\n\n1. Enqueue an element in Queue");
			System.out.println("2. Dequeue an element in Queue");
			System.out.println("3. Peek Front element in Queue");
			System.out.println("4. Peek Rear an element in Queue");
			System.out.println("5. Display element's in Queue");
			System.out.println("6. Exit\n");

			System.out.print("Enter your choice: ");
			ch = sc.nextInt();

			switch(ch)
				{
					case 1:
						System.out.print("Enter your value element: ");
						x = sc.nextInt();
						q.Enqueue(x);
						q.Display();
					break;

					case 2:
						q.Dequeue();
						q.Display();
					break;

					case 3:
						q.PeekFront();
					break;

					case 4:
						q.PeekRear();
					break;

					case 5:
						q.Display();
					break;
	
					case 6:
						System.out.println("Exiting ('')...");
					break;

					default:
						System.out.println("Incorrect choice :(|");
					break;
				}
		} while (ch != 6);
	}//end od psvm
}//end of LQ class