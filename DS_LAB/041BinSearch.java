import java.util.Scanner;

class BinSearch
{
	public static void main(String[] args)
	{
		int num, i, key, first, last, mid;
		boolean flag = false;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of integers: ");
		num = input.nextInt();

		int array[] = new int[num];
		System.out.println("Enter "+num+" integers in Ascending order:");
		for (i=0; i<num; i++)
		{
			array[i] = input.nextInt();
		}
		
		System.out.println("Enter the key: ");
		key = input.nextInt();

		//Binary Search
		first = 0;
		last = num-1;
		mid = (first+last)/2;
		
		while(first<=last)
		{
			if(key<array[mid])
			{
				last = mid-1;
			}
			else if(key>array[mid])
			{
				first = mid+1;
			}
			else //data found
			{
				System.out.println(key + " found at index "+mid);
				flag = true;
				break;
			}
			mid = (first+last)/2;
		}//end of while 		
		
		if(flag == false)
		{
			System.out.println(key + " is not found");
		}
	}
}