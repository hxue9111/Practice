package Test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		weird_print(sc.nextLine().toCharArray(), 1, 1, 0);
	}
	public static void weird_print(char[] a, int lineLen, int nth, int total){
		if(total<a.length && nth>0){
			System.out.print(a[total++]);
			if(--nth==0){
				System.out.print("\n");
				nth=++lineLen;
			}
			weird_print(a, lineLen, nth, total);
		}
	}
}