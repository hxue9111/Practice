package LinkedList;
import LinkedList.LinkedList.Node;

public class nthFromEnd {
	public static void main(String args[]){
		LinkedList l = new LinkedList();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		l.push(5);
		l.push(6);
		l.printList();
		System.out.println("1FromEnd: "+ nthFromEnd(l,1));
		System.out.println("2FromEnd: "+ nthFromEnd(l,2));
		System.out.println("3FromEnd: "+ nthFromEnd(l,3));
		System.out.println("4FromEnd: "+ nthFromEnd(l,4));
		System.out.println("5FromEnd: "+ nthFromEnd(l,5));
		System.out.println("6FromEnd: "+ nthFromEnd(l,6));
	}
	
	public static int nthFromEnd(LinkedList l, int n){
		Node ptr1 = l.head;
		Node ptr2 = l.head;
		
		while(n-- > 0 && ptr2 != null){
			ptr2 = ptr2.next;
		}
		
		while(ptr2 != null){
			ptr2 = ptr2.next;
			ptr1 = ptr1.next;
		}
		
		return ptr1.data;
	}
}
