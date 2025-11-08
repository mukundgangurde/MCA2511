import java.util.Scanner;

class LinSearch
{
	public static void main(String[] args)
	{
		int num, i, key;
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of the integers: ");
		num = input.nextInt();

		int array[] = new int[num];
		System.out.println("Enter "+num+" integers");
		for(i=0; i<num; i++)
		{
			array[i] = input.nextInt();
		}
		
		System.out.println("Enter the key: ");

		key = input.nextInt();

		//Linear Search
		for(i=0; i<num;i++)
		{
			if(array[i] == key)
			{
				flag = true;
				System.out.println(key + " is present at index " + i);
				break;
			}
		}
		if(flag == false)
		{
			System.out.println(key + " is not present in the array");
		}
	}//end of pvsm
}//end of class
