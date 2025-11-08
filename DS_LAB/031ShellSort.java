import java.util.*;

class ShellSort
{
	public static void main(String[] args)
	{
		int num, i, j, gap;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of integers to sort: ");
		num = input.nextInt();
	
		int array[] = new int[num];
		System.out.println("Enter "+ num + " integers");
		for(i=0; i<num; i++)
		{
			array[i] = input.nextInt();
		}
                                                                                                                                                                                                                                                                                                          
		for(gap= num/2; gap>0; gap=gap/2)
		{
			for(i=gap; i<num; i++)
			{
				int temp = array[i];
				j=i;
				while(j>=gap && array[j-gap]> temp)
				{
					array[j] = array[j-gap];
					j = j-gap;
				}

				array[j] = temp;
			}//end of for i
		}//end of for gap

		System.out.println("Sorted Array");

		for(i=0; i<num; i++)
		{
			System.out.println(array[i]);
		}
	}//end of psvm
}//end of class