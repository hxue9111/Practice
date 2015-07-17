package CodeJam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {
	public static void main(String args[]){
		reverse("3"
				+ "\nthis  is a test"
				+ "\nfoobar"
				+ "\nall your base");
	}
	public static void reverse(String s){
		Scanner sc = new Scanner(s);
		int cases = Integer.parseInt(sc.nextLine());
		for(int c = 0; c< cases; c++){
			List l = Arrays.asList(sc.nextLine().split("\\s+"));
			Collections.reverse(l);
			System.out.println("Case #"+(c+1)+": "+l.toString());
		}
	}


}
