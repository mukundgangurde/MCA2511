import java.util.Scanner;

//Node Template
class Node
{
	int data;
	Node left;
	Node right;

	//Parameterized Constructor	
	public Node(int d)
	{
		data = d;
		left = null;
		right = null;
	}
}//end of Node

//Tree Template
class BSTree
{
	Node root;
	int cnt;

	//Default Constructor
	public BSTree()
	{
		root = null;
		cnt = 0; 
	}

	//Insert
	public void Insert(int x)
	{
		//Make a new node
		Node t = new Node(x);

		//First node in the BST
		if(root == null)
		{
			root = t;
			cnt++;
			return;
		}

		//Traverse
		Node prev = null;
		Node tmp = root;

		while (tmp!=null)
		{
			prev=tmp;

			if(t.data < tmp.data)
			{
				tmp = tmp.left;
			}
			else if(t.data > tmp.data)
			{
				tmp = tmp.right;
			}
			else
			{
				System.out.println("Duplicate!");
				return;
			}
		}//end of while

		//Attach t to parent node
		if(t.data<prev.data)
		{
			prev.left = t;
		}
		else
		{
			prev.right = t;
		}
		cnt++;
	}//end of Insert

	//Display
	public void Display()
	{
		System.out.print("Preorder Traversal: ");
		Preorder(root);
		System.out.println();

		System.out.print("Inorder Traversal: ");
		Inorder(root);
		System.out.println();

		System.out.print("Postorder Traversal: ");
		Postorder(root);
		System.out.println();
	}//end of Display

	//Preorder
	void Preorder(Node r)
	{
		if(r!=null)
		{
			System.out.print(r.data + " ");
			Preorder(r.left);
			Preorder(r.right);
		}
	}//end of Preorder

	//Inorder
	void Inorder(Node r)
	{
		if(r!=null)
		{
			Inorder(r.left);
			System.out.print(r.data + " ");
			Inorder(r.right);
		}
	}//end of Inorder

	//Postorder
	void Postorder(Node r)
	{
		if(r!=null)
		{
			Postorder(r.left);
			Postorder(r.right);
			System.out.print(r.data + " ");
		}
	}//end of Postorder

	// Count
	public void Count()
	{
		System.out.println("Total nodes in BST: " + cnt);
	}

	//Search
	public void Search(int x)
	{
		boolean flag = false;
		Node tmp = root;

		while(tmp!=null)
		{
			if(x<tmp.data)
			{
				tmp = tmp.left;
			}
			else if(x>tmp.data)
			{
				tmp = tmp.right;
			}
			else
			{
				flag = true;
				break;
			}
		}

		if(flag==true)
		{
			System.out.println(x + " is found");
		}
		else
		{
			System.out.println(x + " is not found");
		}
	}//end of Search

	//FindMax
	public void FindMax()
	{
		if(root==null)
		{
			System.out.println("Empty BST!");
			return;
		}
		Node tmp = root;
		while(tmp.right != null)
		{
			tmp = tmp.right;
		}

		System.out.println("Maximum node: "+ tmp.data);
	}//end of FindMax

	//FindMin
	public void FindMin()
	{
		if(root==null)
		{
			System.out.println("Empty BST!");
			return;
		}
		Node tmp = root;
		while(tmp.left != null)
		{
			tmp = tmp.left;
		}

		System.out.println("Minimum node: "+ tmp.data);
	}//end of FindMin

}//end of BsearchTree

class BST
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BSTree t = new BSTree();
		int ch,x;
		do
		{
			System.out.println("\n------------------------------------------");
			System.out.println("------------Binary Search Tree------------");
			System.out.println("------------------------------------------");
			System.out.println("1. Insert a Value");
			System.out.println("2. Display the BST");
			System.out.println("3. Search for a node in the BST");
			System.out.println("4. Count the number of nodes in the BST");
			System.out.println("5. Find Max");
			System.out.println("6. Find Min");
			System.out.println("7. Exit\n");

			System.out.print("Enter Your Choice: ");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1:
					System.out.print("Enter Data Value: ");
					x = sc.nextInt();
					t.Insert(x);
				break;

				case 2:
					t.Display();
				break;

				case 3:
					System.out.print("Enter Data Value to Search: ");
					x = sc.nextInt();
					t.Search(x);
				break;

				case 4:
					t.Count();
				break;

				case 5:
					t.FindMax();
				break;

				case 6:
					t.FindMin();
				break;

				case 7:
					System.out.println("Exiting .... ");
				break;

				default:
					System.out.println("Incorrect Choice Try Again.... ");
				break;
			}
			
		} while(ch!=7);
	}//end of psvm
}//end of BST
