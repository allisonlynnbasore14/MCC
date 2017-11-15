

class LinkedList{

	Node head;

	class Node{

		int data;
		Node next;
		Node(int d){
			data = d;
			next =null;
		}
	}

	void printMiddle(){
		Node singleJump = head;
		Node doubleJump = head;
		if(head != null){
			while(doubleJump != null && doubleJump.next != null){
				doubleJump = doubleJump.next.next;
				singleJump = singleJump.next;
			}
			System.out.println(singleJump.value);
		}

	}


}