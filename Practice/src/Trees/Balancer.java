package Trees;

import java.util.Scanner;

public class Balancer {
//	type item = 
//			|Node of int*item*item
//			|Weight of int
//			|Empty
	static class Node{
		Node(){};
		int wl,wr;
		int l = -1,r = -1;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Node[] nodes= new Node[Integer.parseInt(sc.nextLine())];
		
		for(int x = 0; x < nodes.length ; x++){
			nodes[x] = new Node();
			for(int twice = 0; twice < 2; twice++){
				String[] linetoks = sc.nextLine().trim().split(" ");
				if(twice==0){
					nodes[x].wl = Integer.parseInt(linetoks[0]);
					if(linetoks.length > 1) nodes[x].l=Integer.parseInt(linetoks[1]);
				}
				else{
					nodes[x].wr=Integer.parseInt(linetoks[0]);
					if(linetoks.length > 1) nodes[x].r=Integer.parseInt(linetoks[1]);
				}
			}
		}
		//toString(nodes,0);
		balance(nodes,0);
	}
	
	public static int weight(Node[] n, int i){
		if(i == -1) return 0;

		return n[i].wl+n[i].wr +weight(n,n[i].l) + weight(n,n[i].r)  + 10;
	}
	
	public static void balance(Node[] n, int i){
		if(i == -1) return;
		balance(n,n[i].l);
		balance(n,n[i].r);

		int diff = weight(n,n[i].l)+n[i].wl -n[i].wr - weight(n,n[i].r);
		
		if(diff==0)
			System.out.println("Node "+ i+" is already balanced");
		else if(diff > 0){
			System.out.println("Adding "+diff+" to right of node "+i);
			n[i].wr+=diff;
		}else{
			System.out.println("Adding "+(diff*-1)+" to left of node "+i);
			n[i].wl+=(diff*-1);
		}
	}
	
	public static void toString(Node[] n, int id){
		
		System.out.println("Node: "+id);

		System.out.println("Left: "+n[id].l + " Right: "+n[id].r);
		System.out.println("wLeft: "+n[id].wl + " wRight: "+n[id].wr);
		
		if(id+1 < n.length) toString(n,id+1);
	}
}
