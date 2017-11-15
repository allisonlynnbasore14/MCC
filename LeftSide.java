// Printing the left side of a binary tree
// The basic idea is to visit every set of nodes and print the left one

class Node{
	int data;
	Node left, right;

	public Node(int item){
		data = item;
		left = right = null;

	}

}

class BinaryTree{
	Node root;
	static int max_level = 0;

	void leftViewUtil(Node node, int level){
		if(node== null){
			return;
		}// Base case

		if(max_level < level){
			System.out.println("  " + node.data);
			max_level = level;
		}

		leftViewUtil(node.left, level + 1);
		leftViewUtil(node.right, level + 1);
		// recursion through all nodes

		void leftView(){
			leftViewUtil(root, 1);
		}

		public static void main(String args[]){
			BinaryTree tree = new BinaryTree();
			tree.root = new Node(12);
			tree.root.left = new Node(1);
			tree.root.right = new Node(10);
			tree.root.right.right = new Node(1);
			tree.root.right.left = new Node(2);
			tree.root.left.right = new Node(122);
			tree.root.left.left = new Node(11);

			tree.leftView();
		}
	}
}