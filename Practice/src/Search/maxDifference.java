package Search;

public class maxDifference {
	public static void main(String args[]){
		System.out.println(maxDiff(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}));

		System.out.println(maxDiff(new int[]{8, 1, 2, 5}));
	}
	
	public static int maxDiff(int a[]){
		int min = 0, max = a.length - 1;
		for(int idx = 0; min<a.length-1-idx && max>idx && idx < a.length ; idx++){
			if(a[min] > a[idx])
				min = a[idx];
			if(a[max] < a[a.length-1 - idx]){
				max = a.length-1 -idx;
			}
		}
		return a[max]-a[min];
	}
}
