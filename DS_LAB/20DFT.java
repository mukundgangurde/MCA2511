class DFT
{
	int[][] adj;		//Adjacency Matrix for growth
	boolean[] visited;	//Track visited status odf each vertex
	int[] stack;		//Array-based stack
	int tos;		//Top of the stack

	//Constructor to initialize the graph
	public DFT(int v)
	{
		adj = new int[v][v];
		visited = new boolean[v];
		stack = new int[v];
		tos = -1;
	}//end of DFT

	//Add an edge to the graph
	public void addEdge(int src,int dest)
	{
		adj[src][dest] = 1;	//Add Edge
		adj[dest][src] = 1;	//Remove this for directed graph
	}//end of addEdge

	//DFT Traversal
	public void performDFT(int x)
	{
		push(x);	//Push starting node on the stack
		System.out.print("Depth-First Traversal: ");
		while(tos!=-1)	//While the stack not empty
		{
			int curr = pop();	//Pop the tos
			if(!visited[curr])
			{
				visited[curr] = true;	//Mark the node visited
				System.out.print(curr + " ");

				//Push all unvisited neighbours on to the stack
				for(int i = 0; i < visited.length ; i++)
				{
					if(adj[curr][i] == 1 && !visited[i])
					{
						push(i);
					}//end of inner if
				}//end of for
			}//end of outer if
		}//end of while
	}//end of performDFT

	//Push
	public void push(int node)
	{
		stack[++tos] = node;
	}

	//Pop
	public int pop()
	{
		return stack[tos--];
	}

	public static void main(String[] args)
	{
		DFT g = new DFT(5);

		//Add edges
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(1,4);
		g.addEdge(2,3);
		g.addEdge(3,4);

		//Perform DFT
		g.performDFT(1);
/*
		g.addEdge(1,4);
		g.addEdge(1,3);
		g.addEdge(2,3);
		g.addEdge(2,4);
		g.addEdge(3,4);
		g.performDFT(1);*/
		
		
	}//end of psvm
}//end of DFT