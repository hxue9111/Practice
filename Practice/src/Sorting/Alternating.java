package Sorting;

import java.util.Arrays;
//1 2 3 4 5 6 7 8
//1 5 3 7 2 6 4 8

//1 2 3 4 5 6 7
//1 5 3 7 2 6 4

//1 2 3
//1 3 2

//1 2 3 4 5 6 7 8 9
//1 6 3 8 5 2 7 4 9

public class Alternating {
	public static void main(String args[]){
		System.out.println(Arrays.toString(sort(new int[]{8,7,6,5,4,3,2,1})));
		System.out.println(Arrays.toString(sort(new int[]{7,6,5,4,3,2,1})));
	}
	
	public static int[] sort(int a[]){
		Arrays.sort(a);
		
		for(int idx = 1; idx < a.length/2.0 ; idx+=2){
			swap(a, idx, (int)(Math.ceil(a.length/2.0) + idx - 1));
		}
		return a;
	}
	private static void swap(int[] a, int idx1, int idx2){
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
}
