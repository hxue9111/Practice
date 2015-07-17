package Arrays;

public class kThSmallestInNArrays {
	public static int findKth(int k, int[] a, int[] b){
		int idxA = k/2 - 1, idxB = k-k/2 - 1;
		if(k>a.length+b.length) return 0;
		
		while(idxA < a.length && idxB < b.length){
			if(idxA < 0) return b[idxB];
			if(idxB < 0) return a[idxA];
			if(a[idxA] > b[idxB] && a[idxA] < b[idxB+1]){
				return a[idxA];
			}
			
			if(b[idxA] > a[idxB] && b[idxA] < a[idxB+1]){
				return b[idxA];
			}
			
			if(a[idxA] > b[idxB] && a[idxA] > b[idxB+1]){
				idxA--;
				idxB++;
			}else {
				idxA++;
				idxB--;
			}
			System.out.println("idxA: "+ idxA+": idxB: "+ idxB);
		}
		return 0;
	}
	public static void main(String args[]){
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		int[] c = {1,3,5,7,9};
		int[] d = {2,4,6,8,10};
		
		System.out.println(findKth(5, a, b));
		System.out.println(findKth(5, c, d));
	}
}
