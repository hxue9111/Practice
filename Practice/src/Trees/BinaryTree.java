package Trees;

public class BinaryTree<T extends Comparable<T>> {
	static class Node<T>{
		T v;
		Node<T> l,r;
		Node(T v){this.v = v;}
	}
	Node<T> root;
	
	public BinaryTree<T> add(Node<T> n, T v){
		if(root == null) {root = new Node<T>(v); return this;}
		int c = n.v.compareTo(v);
		
		if(c == 0) 
			return this;
		else if(c>0){
			if(n.l == null){
				n.l = new Node<T>(v);
			}else{
				add(n.l,v);
			}
		}else{
			if(n.r == null){
				n.r = new Node<T>(v);
			}else{
				add(n.r,v);
			}
		}
		return this;
	}
	public static BinaryTree<String> init1(){
		BinaryTree<String> t = new BinaryTree<String>();
		t.root = new Node<String>("B");
		t.root.l = new Node<String>("A");
		t.root.r = new Node<String>("C");
		return t;
	}
	public static BinaryTree<String> init2(){
		BinaryTree<String> t = new BinaryTree<String>();
		t.root = new Node<String>("A");
		t.root.r = new Node<String>("B");
		t.root.r.r = new Node<String>("C");
		return t;
	}
	public static boolean sameInOrder(Node<? extends Comparable> n1 , Node<? extends Comparable> n2){
		if(n1 == null && n2 == null) return true;
		if(n1.l != null && n2.l != null){
			return sameInOrder(n1.l, n2.l);
		}else if(n1.l == null && n2.l != null){
			return sameInOrder(n1, n2.l);
		}else if(n1.l == null && n2.l == null){
			return (n1.v.compareTo(n2.v) == 0) && sameInOrder(n1.r, n2.r);
		}
		
		return false;
	}
}
