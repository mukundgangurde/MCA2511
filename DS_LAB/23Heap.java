import java.util.Scanner;

class MaxHeap
{
	int[] arr;	//Array to store the heap elements
	int cnt;	//Current number of elements in the heap
	int n;		//maximum capacity of the heap - size of array

	//Constructor
	public MaxHeap(int size)
	{
		n = size;
		arr = new int[n];
		cnt = 0;
	}

	//Get parent index
	public int parent(int i)
	{
		return ((i-1)/2);
	}

	//Get Left Child
	public int leftChild(int i)
	{
		return ((2*i)+1);
	}

	//Get Right Child
	public int rightChild(int i)
	{
		return ((2*i)+2);
	}

	//Insert an element in the top
	public void Insert(int x)
	{
		if(cnt==n)
		{
			System.out.println("Heap is Full!..");
			return;
		}

		//Insert at the end of the Array
		arr[cnt] = x;
		int curr = cnt;
		cnt++;

		//reheapUp to maintain order property
		while(curr>=0 && arr[curr]>arr[parent(curr)])
		{
			swap(curr,parent(curr));
			curr = parent(curr);
		}
	}//end of insert

	//Swap
	public void swap(int i, int j)
	{
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	//Display
	public void Display()
	{
		System.out.print("Heap: ");

		for(int i=0; i<cnt; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	//Delete - return the element at the root - largest element
	public void Delete()
	{
		if(cnt==0)
		{
			System.out.println("Heap is empty!....");
			return;
		}

		int tmp = arr[0];	//Hold largest value in tmp
		arr[0] = arr[cnt-1];	//Replace root with last leaf node -- almost complete
		cnt--;			//Reduce count of elements
		reheapDown(0);		//reheapDown from root
		System.out.println("Element deleted: "+tmp);
	}

	//reheapDown to maintain order property of the heap
	public void reheapDown(int i)
	{
		int max = i;
		int left = leftChild(i);
		int right = rightChild(i);

		//Find the maximum of root, left and right child
		if(left<cnt && arr[left] > arr[max])
		{
			max = left;
		}
		if(right<cnt && arr[right] > arr[max])
		{
			max = right;
		}

		//If max is not at root, reheapDown and continue
		if(max!=i)
		{
			swap(i,max);
			reheapDown(max);
		}
	}
}//end of MaxHeap

//MAIN
class Heap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		MaxHeap h = new MaxHeap(10);
		int ch;

		do
		{
			System.out.println("\n---------Max-Heap---------\n");

			System.out.println("1. Insert in the Heap");
			System.out.println("2. Delete from the Heap");
			System.out.println("3. Display the Heap");
			System.out.println("4. Exit\n");

			System.out.print("Enter your choice: ");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1:
					System.out.print("Enter a value: ");
					int x = sc.nextInt();
					h.Insert(x);
				break;

				case 2:
					h.Delete();
				break;

				case 3:
					h.Display();
				break;

				case 4:
					System.out.println("Exiting....");
				break;

				default:
					System.out.println("Incorrect Choice ");
				break;
			}	
		} while(ch!=4);
	}
}