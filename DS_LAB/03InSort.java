import java.util.Scanner;
class InSort
{
	public static void main(String[] args)
	{
		int num, i, j, key;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of integers to sort: ");
		num = input.nextInt();

		int array[] = new int[num];
		System.out.println("Enter "+ num + " integers");

		for(i=0; i<num; i++)
		{
			array[i] = input.nextInt();
		}//end of element inserting loop
		
		//Insertion Sort Algorithm
		for(i=1; i<num; i++)
		{
			key = array[i];
			j = i-1;

			while(j>=0 && key<array[j])
			{
				array[j+1] = array[j];
				j = j-1;
			}

		//Write the key in its correct position
		array[j+1] = key;
		}//end of for i

		System.out.println("Sorted Array: ");
		for(i=0; i<num; i++)
		{
			System.out.println(array[i]);
		}
	}//end of psvm
}//end of class