package Arrays;

public class LargestConsecutiveSum {
	public static void main(String args[]){
		int[] x = {4,-5,1,2,3,-6,9,-10,5};
		System.out.println(lsum(x));
		int[] y = {-1,2,-3,4,5,6,-7};
		System.out.println(lsum(y));
	}
	public static int lsum(int[] a){
		int max = 0, lastmax = 0, start = 0, end = a.length-1, laststart = 0, lastend = 0;;
		
		for(int idx = 0; idx < a.length; idx++){
			int tmp = max + a[idx];
			if(tmp <= 0){
				lastmax = Math.max(max, lastmax);
				max = 0;
				start = idx;
			}else if (tmp < max){
				lastmax = Math.max(max, lastmax);
				end = idx;
			}else{
				max = tmp;
			}
			
		}
		System.out.println("Start: ("+start+"): End("+end+")");
		return Math.max(max, lastmax);
	}
}
