
class Node{
	// making the node class
	// The overall class is just class
	// The inst. function is public and only takes a value
	// The left and right are set by calling NodeVariable.left = 3 etc.

	int data;
	Node left, right;

	public Node(int val){
		data = val;
		left = right = null;
	}
}

public class solution(){
	// Making the root variable that can be set by calling SolutionVariable.root = 3
	Node root;

	// This first LCA find is called bacause it does not have the root variable yet

	Node findLCA1(n1, n2){
		findLCA2(root, n1, n2)
	}

	// This second function is called inside the class so as to get the preset root value

	Node findLCA2(currentNode, n1, n2){
		//Check if nodes are null
		if(currentNode == null){
			return null;
		}
		//Check if it equals n1 or n2
		if(n1 == node || n2 = node){
			return node;
		}
		//Call recursion

		Node lucy = findLCA2(node.left, n1 , n2);
		Node ricky = findLCA2(node.right, n1 , n2);
		//Check if neither of them are null

		if (lucy!= null && ricky != null){
			return node;
		}
		//Return left or right if either are not null
		if(lucy!=null){
			return lucy;
		}else{
			return ricky;
		}
	}

	public static void Main(String args[]){
		// Making a tree and setting the root, left, and right branches
		solution tree = new solution();
		tree.root = Node(1);
		tree.right = Node(2);
		tree.left = Node(3);
		tree.right.right = Node(4);
		tree.right.left = Node(5);
		tree.left.right = Node(6);
		tree.left.left = Node(7);

		// Printing out the answer for when the values are 4 and 7

		System.out.println(tree,findLCA1(4,7));

	}
}

