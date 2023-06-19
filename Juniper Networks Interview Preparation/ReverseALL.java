public class ReverseALL {
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}

	}
	public static Node head;
	public static Node tail;

	public static Node findReverse(Node head){
		if(head == null){
			System.out.println("LL is empty");
			return null;
		}
		Node curr = head;
		Node prev = null;
		while(curr != null){
			Node newNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = newNode;
		}
		return prev;
	}

	public static void printLL(Node head){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println();
	}


	public static void main(String[] args){
	Node head = new Node(1);
	head.next = new Node(2);
	head.next.next = new Node(3);
	head.next.next.next = new Node(4);
	head.next.next.next.next = new Node(5);
	Node temp = findReverse(head);
	printLL(temp);

	}
    
}
