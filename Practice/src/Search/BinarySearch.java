package Search;

public class BinarySearch {

	static int binarySearch(int[] a, int s, int e, int ele){
		if(s<=e){
			int idx = (s+e)/2;
			if(a[idx] == ele){
				return idx;
			}else if (a[idx] < ele){
				return binarySearch(a, idx + 1, e, ele );
			} else if(a[idx] > ele){
				return binarySearch(a, s, idx - 1, ele);
			}
		}
		return -1;
	}
	
}	
