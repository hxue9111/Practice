package CodeJam;

import java.util.Scanner;

public class StoreCredit {

	public static void main(String[] args) {
		priceMatch("3"
				+ "\n100"
				+ "\n3"
				+ "\n5 75 25"
				+ "\n200"
				+ "\n7"
				+ "\n150 24 79 50 88 345 3"
				+ "\n8"
				+ "\n8"
				+ "\n2 1 9 4 4 56 90 3");

	}
	public static void priceMatch(String s){
		Scanner sc = new Scanner(s);
		int cases = sc.nextInt();
		for(int ct = 0; ct < cases; ct++){
			int credit = sc.nextInt();
			int items = sc.nextInt();
			int[] prices= new int[items];
			for(int idx = 0; idx<items;idx++){
				prices[idx] = sc.nextInt();
			}

			for(int fi = 0; fi < items; fi++){
				for(int si = fi+1; si < items;si++){
					if(credit-prices[fi] == prices[si]){
						System.out.println("Case #"+(ct+1)+": " + (fi+1) + " " +(si+1));
					}
				}
			}
		}
	}

}
