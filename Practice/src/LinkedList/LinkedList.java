package LinkedList;

public class LinkedList {
	public class Node{
		Node next;
		int data;
		public Node(int data, Node next){
			this.next = next;
			this.data = data;
		}
	}
	
	Node head;
	
	public void push(int data){
		if(head == null){
			head = new Node(data, null);
		}else{
			Node n = head;
			while(n.next != null) n = n.next;
			n.next = new Node(data, null);
		}
	}
	public void printList(){
		Node n = head;
		while(n != null){
			System.out.print(n.data + " - ");
			n=n.next;
		}
		System.out.println("null");
	}
}
