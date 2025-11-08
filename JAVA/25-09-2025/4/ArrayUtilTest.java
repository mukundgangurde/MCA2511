//Design a class arrayutilities with following functionalities
//1. Maximum of array.
//2. Minimum of array.
//3. Find Mean of an array.
//4. Find standard deviation of an array.

class ArrayUtilities
{
	//instance variable
	int[] data;
	int size;
	
	//constructor
	ArrayUtilities(int size)
	{
		data = new int[size];
		this.size = size;
	}

	void setData(int[] data)
	{
		this.data = data;
	}

	//function to find max element of an array
	int findmax()
	{
		int max = data[0];
		for(int i = 1; i<size; i++)
		{
			//check for max
			if(data[i]>max)
			{
				max = data[i];
			}
		}
		return max;
	}

	//function to find min element of an array
	int findmin()
	{
		int min = data[0];
		for(int i = 1; i<size; i++)
		{
			//check for min
			if(data[i]<min)
			{
				min = data[i];
			}
		}
		return min;
	}

	//function to find mean of an array
	double findmean()
	{
		double sum = 0;
		for(int i = 0; i<size; i++)
		{
			sum = sum + data[i];
		}

		return sum/size;
	}

	//function to find Standard Deviation
	double findsd()
	{
		double num = 0;
		for(int i=0; i<size; i++)
		{
			num = num + Math.pow((data[i]-findmean()),2);
		}
		return Math.sqrt(num/size);
	}

	
}
class ArrayUtilTest
{
	public static void main(String[] args)
	{
		int arr[] = {12,35,45,23,14};
		//int arr[] = {12,7,32,9,8};
		
		ArrayUtilities a1 = new ArrayUtilities(5);
		a1.setData(arr);
		System.out.println("Maximum of Array: " + a1.findmax());
		System.out.println("Minimum of Array: " + a1.findmin());
		System.out.println("Mean of Array: " + a1.findmean());
		System.out.println("Standard Deviation: " + a1.findsd());

	}
}










