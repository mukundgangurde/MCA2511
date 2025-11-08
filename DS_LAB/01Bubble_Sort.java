import java.util.Scanner;

class BubbleSort
{
	public static void main(String[] args)
	{
		int num,i,j,temp;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of integer to sort: ");
		num = input.nextInt();
		
		int array[] = new int[num];
		System.out.println("Enter " + num + " integers: ");

		for(i = 0; i<num ; i++)
		{
			array[i] = input.nextInt();
		}//end of for


		//Bubble Sort Algorithm
		for(i=0; i<(num-1); i++)
		{
			for(j=0; j<num-i-1; j++)
			{
				if(array[j] > array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}//end of if
			}//end of inner j
		}//end of outer i


		//Print the sorted array
		System.out.println("Sorted Array");
		for(i=0; i<num; i++)
		{
			System.out.println(array[i]);
		}//end of for
	}//end of psvm
}//end of the class