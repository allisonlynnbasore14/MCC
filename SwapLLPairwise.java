
class LinkedList{

	Node head;

	class Node(){
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	void pairwiseSwap(){
		Node temp = head;
		while(temp != null && temp.next != null){
			int val = temp.data;
			temp.data = temp.next.data;
			temp.next.data = val;
			temp = temp.next.next;

		}

	}

	public void push(int data_val){
		// puts a link at the front of the list
		Node newNode = new Node(data_val);

		newNode.next = head;

		head = newNode;
	}

	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		ll.push(1);
		ll.push(10);
		ll.push(2);
	}

	//public static push



}