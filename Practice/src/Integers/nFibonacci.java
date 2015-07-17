package Integers;

public class nFibonacci {

	public static void main(String args[]){
		System.out.println("nFib(1): "+ nFib(3, 1));
		System.out.println("nFib(2): "+ nFib(3, 2));
		System.out.println("nFib(3): "+ nFib(3, 3));
		System.out.println("nFib(4): "+ nFib(3, 4));
		System.out.println("nFib(5): "+ nFib(3, 5));
		System.out.println("nFib(6): "+ nFib(3, 6));
	}
	public static int nFib(int n, int to){
		if(to <= n)
			return 1;
		int[] fibs = new int[to];
		for(int x = 0; x < n; x++){
			fibs[x] = 1;
		}
		for(int idx = n; idx < to; idx ++){
			for(int x = 1; x <= n; x++){
				fibs[idx] += fibs[idx - x];
			}
		}
		return fibs[to-1];
	}

}
