import java.util.*;

class AQueue
{
	private int max;
	private int[] qArray;
	private int front;
	private int rear;

	public AQueue(int size)
	{
		max = size;
		qArray = new int[max];
		front = -1;
		rear = -1;
	}

	public void Enqueue(int x)
	{
		//1. Queue Full
		if(rear == max-1)
		{
			System.out.println("Queue Overflow!");
			return;
		}

		//2. 1st element in the queue
		if(front == -1)
		{
			front = 0;
			rear = 0;
		}

		//3. Any other element
		else
		{
			rear++;
		}

		//4. Insert the element at the row
		qArray[rear] = x;

		//5. Display the inserted element
		System.out.println("Element inserted is: " + x);
	}

	//Dequeue
	public void Dequeue()
	{
		//1. Queue Empty
		if(front == -1)
		{
			System.out.println("Queue Underflow!");
			return;
		}

		//2. Store the element at the front in x
		int x = qArray[front];

		//3. Single element deletion
		if(front == rear)
		{
			front = -1;
			rear = -1;
		}

		//4. Any other element
		else
		{
			front++;
		}

		//5. Display the deleted element
		System.out.println("Element removed is: " + x);
	}

	//PeekFront
	public void PeekFront()
	{
		//1. Queue Empty
		if(front == -1)
		{
			System.out.println("Queue Underflow!");
			return;
		}
		else
		{
			System.out.println("Element at Front: " + qArray[front]);
		}		
	}

	//PeekRear
	public void PeekRear()
	{
		//1. Queue Full
		//if(rear == max-1)
		//{
			//System.out.println("Queue Overflow!");
			//return;
		//}
		//else
		//{
			System.out.println("Element at Rear: " + qArray[rear]);
		//}
	}

	//Display
	public void Display()
	{	
		//1. Queue Empty
		if(front == -1)
		{
			System.out.println("Queue Empty!");
			return;
		}
		else
		{
			System.out.print("Elements contains: ");
			for(int i = front; i<=rear;i++)
			{
				System.out.print(qArray[i] + " ");
			}
		}
	}

}//end of class AQueue

class Queue
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		AQueue q = new AQueue(4);
		int x, ch;

		do
		{
			System.out.println("\nArray Implementation of Queue\n");
			System.out.println("1. Enqueue an element");
			System.out.println("2. Dequeue an element");
			System.out.println("3. Display the queue");
			System.out.println("4. Peek Front");
			System.out.println("5. Peek Rear");
			System.out.println("6. Exit\n");

			System.out.println("Enter your Choice: ");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1:
					System.out.println("Enter an element: ");
					x = sc.nextInt();
					q.Enqueue(x);
					break;
				case 2:
					//System.out.println("Enter an element: ");
					//x = sc.nextInt();
					q.Dequeue();
					break;
				case 3:
					q.Display();
					break;
				case 4:
					q.PeekFront();
					break;
				case 5:
					q.PeekRear();
					break;
				case 6:
					System.out.println("Exiting");
					break;
				default:
					System.out.println("Incorrect Choice!");
					break;
			}
		} while (ch!=6);
	}//end of psvm
}//end of class Queue