package LinkedList;
import LinkedList.LinkedList.Node;
public class Reverse {
	public static void main(String args[]){
		LinkedList l = new LinkedList();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		l.push(5);
		l.push(6);
		l.printList();
		reverse(l);
		System.out.println("Reversing...");
		l.printList();
	}
	public static void reverse(LinkedList l){
		Node curr = l.head;
		Node prev = null;
		
		while(curr != null){
			Node tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
		}
		l.head = prev;
	}
}
