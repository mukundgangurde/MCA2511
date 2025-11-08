import java.util.Scanner;

class SelSort
{
	public static void main(String[] args)
	{
		int num, i, j, minIdx, temp;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of integers to sort: ");
		num = input.nextInt();

		int array[] = new int[num];
		System.out.println("Enter " + num + " integers: ");
		for(i = 0; i<num; i++)
		{
			array[i] = input.nextInt();
		}//end of for to take input in array

		//Selection Sort
		for(i=0; i<num-1;i++)
		{
			minIdx = i;

			//Find Minimum Index
			for(j=i+1; j<num; j++)
			{
				if(array[j] < array[minIdx])
				{
					minIdx = j;
				}
			}// end of for j

			//Exchange number at minIdx and start of Unsorted Region(i)
			temp = array[i];
			array[i] = array[minIdx];
			array[minIdx] = temp;
		}//end of for i

		System.out.println("Sorted Array");
		for(i=0; i<num; i++)
		{
			System.out.println(array[i]);
		}
	}//end of pvsm
}//end of class











