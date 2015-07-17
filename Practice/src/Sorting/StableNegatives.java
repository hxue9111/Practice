package Sorting;

import java.util.Arrays;

public class StableNegatives {
	public static void main(String args[]){
		int[] a = {-1, 1 ,-1, 1, -1 ,1 ,-1 ,1 ,-1 ,1};
		NegToFront(a);
		System.out.println(Arrays.toString(a));
	}
	public static void NegToFront(int[] a){
		int posIdx = 0;
		boolean pos = false;
		for(int idx = 0; idx < a.length; idx++){
			if(!pos && a[idx] > 0){
				pos = true;
				posIdx=idx;
			}
			if(pos && a[idx] < 0){
				int tmp = a[idx];
				for(int idx2 = idx; idx2 > posIdx; idx2--){
					a[idx2] = a[idx2-1];
				}
				a[posIdx] = tmp;
				pos = false;
				idx = posIdx;
			}
		}
	}
	
}
