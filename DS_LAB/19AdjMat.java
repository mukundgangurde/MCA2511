import java.util.Scanner;

class AdjMat
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		//No. of vertices
		System.out.print("Enter the number of vertices in the graph: ");
		int v = sc.nextInt();

		//Initialize adjacency matrix
		int[][] mat = new int[v][v];

		//No of edges
		System.out.print("Enter the number of edges: ");
		int e = sc.nextInt();

		//Read the edges
		for(int i = 1; i<=e; i++)
		{
			System.out.println("Edge "+ i +" source destination: ");
			int source = sc.nextInt();
			int dest = sc.nextInt();
			mat[source][dest] = 1;
			mat[dest][source] = 1;	//Comment this line for a Directed Graph
		}//end of for

		//Display
		System.out.println("\nAdjacency Matrix: ");
		for(int i = 0; i<v; i++)
		{
			for(int j = 0; j<v; j++)
			{
				System.out.print(mat[i][j] + " ");
			}//end of for j
		System.out.println();
		}//end of for i
	}//edn of psvm
}//end of AdjMat