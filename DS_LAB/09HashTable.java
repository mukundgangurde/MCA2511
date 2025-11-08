class HashTable
{
	private Integer[] table;
	private int size;
	private int capacity;

	public HashTable(int capacity)
	{
		this.capacity = capacity;
		size = 0;
		table = new Integer[capacity];
	}

	//Hash Function - Modulo Division
	private int hash(int key)
	{
		return key%capacity;
	}//end of hash

	//Insert key using Hash Function
	public void insert(int key)
	{
		if(size >= capacity)
		{
			System.out.println("Hash Table is full! Cannot insert key");
			return;
		}

		int index = hash(key);
		while(table[index] != null)
		{
			//Linear Passing
			index = (index+1) % capacity;
		}

		table[index] = key;
		size++;
	}//end of insert

	//Display the Hash Table
	public void display()
	{
		for(int i=0; i<capacity; i++)
		{
			if(table[i] != null)
			{
				System.out.println("Index " + i + " : " + table[i]);
			}
			else
			{
				System.out.println("Index " + i + " : null");
			}
		}//end of for
	}//end of display

	public static void main(String[] args)
	{
		HashTable h = new HashTable(10);

		//Sample keys to insert
		int[] keys = {10,20,30,40,57,61,63,79,83,98,99};

		for(int key:keys)
		{
			h.insert(key);
		}

		//Display
		h.display();
	}//end of psvm
}//end of HashTable