package Search;

import java.util.PriorityQueue;

public class nthLargest {
	public static int nthLargest(int[] a, int n){
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		for(Integer i: a){
			p.add(i);
		}
		
		while( p.size() >= n){
			if(p.size() == n){
				return p.poll();
			}
			p.poll();
		}
		return -1;
	}
	public static void main(String args[]){
		int[] a = {1,2,3,4,5,346,23,16,13,5};
		System.out.println(nthLargest(a,2));
	}
}
