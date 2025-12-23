class BFT
{
	int[][] adj;		//Adjacency Matrix For Graph
	boolean[] visited;	//Track Visited Status
	int[] queue;		//Array Based Queue
	int front, rear;

	//Constructor	
	public BFT(int v)
	{
		adj = new int[v][v];
		visited = new boolean[v];
		queue = new int[v];
		front = -1;
		rear = -1;
	}//end of constructor
		
	//Add an edge to the graph
	public void addEdge(int src, int dest)
	{
		adj[src][dest] = 1;
		adj[dest][src] = 1;
	}//end of addEdge
		
	//Perform BFT
	public void performBFT(int x)
	{
		Enqueue(x);	//Enqueue The Starting Node
		visited[x] = true;
		
		System.out.print("Breadth First Traversal: ");
		while(front!=-1)
		{
			int curr = Dequeue();	//Dequeue
			System.out.print(curr + " ");
			
			//Enqueue Those Neighbout Of Curr That Are Not Visited
			for(int i=0; i<adj.length; i++)
			{
				if(adj[curr][i] == 1 && !visited[i])
				{
					Enqueue(i);
					visited[i] = true;
				}//end of if
			}//end of for
		}//end of while
	}//end of performBFT

	//Enqueue
	public void Enqueue(int node)
	{
		if(front == -1)
		{
			front++;
		}
		queue[++rear] = node;
	}//end of Enqueue
	
	//Dequeue
	public int Dequeue()
	{
		int tmp = queue[front];
		if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else
		{
			front++;
		}
		return tmp;
	}//end of Dequeue

	//Main
	public static void main(String[] args)
	{
		BFT g = new BFT(7);
/*
		//Add edges
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(2,6);
		g.addEdge(3,5);
		g.addEdge(4,5);
		g.performBFT(0);

*/
		g.addEdge(2,4);
		g.addEdge(1,5);
		g.addEdge(0,5);
		g.addEdge(2,3);
		g.addEdge(3,5);
		g.performBFT(0);

	}//end of psvm
}//end of BFT
