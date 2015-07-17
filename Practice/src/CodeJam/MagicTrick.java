package CodeJam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class MagicTrick {
	public static void main(String args[]){
		trick("3"
				+ "\n2"
				+ "\n1 2 3 4"
				+ "\n5 6 7 8"
				+ "\n9 10 11 12"
				+ "\n13 14 15 16"
				+ "\n3"
				+ "\n1 2 5 4"
				+ "\n3 11 6 15"
				+ "\n9 10 7 12"
				+ "\n13 14 8 16"
				+ "\n2"
				+ "\n1 2 3 4"
				+ "\n5 6 7 8"
				+ "\n9 10 11 12"
				+ "\n13 14 15 16"
				+ "\n2"
				+ "\n1 2 3 4"
				+ "\n5 6 7 8"
				+ "\n9 10 11 12"
				+ "\n13 14 15 16"
				+ "\n2"
				+ "\n1 2 3 4"
				+ "\n5 6 7 8"
				+ "\n9 10 11 12"
				+ "\n13 14 15 16"
				+ "\n3"
				+ "\n1 2 3 4"
				+ "\n5 6 7 8"
				+ "\n9 10 11 12"
				+ "\n13 14 15 16");
	}
	public static void trick(String s){
		Scanner sc = new Scanner(s);
		int cases = Integer.parseInt(sc.nextLine());

		for(int c = 0; c<cases; c++){
			System.out.println("Case #"+(c+1)+": "+process(sc));

		}	
	}
	public static String process(Scanner sc){
		int inRow = Integer.parseInt(sc.nextLine()), match = -1, possibilities = 0;
		Collection<Integer> found = new ArrayList<Integer>();
		String[] rowTokens;

		
		for(int r = 0; r < 4; r++){
			if(inRow-1 == r){
				rowTokens = sc.nextLine().split(" ");
				for(String s: rowTokens){
					found.add(Integer.parseInt(s));
				}
			}else{
				sc.nextLine();
			}
		}
		inRow = Integer.parseInt(sc.nextLine());
		
		for(int r = 0; r < 4; r++){
			if(inRow-1 == r){
				rowTokens = sc.nextLine().split(" ");
				for(String s: rowTokens){
					if(found.contains(Integer.parseInt(s))){
						possibilities++;
						match = Integer.parseInt(s);
					}
				}
			}else{
				sc.nextLine();
			}
		}
		String result = (possibilities==0)? "Volunteer cheated!" :(possibilities>1)? "Bad magician!" : ""+match;

		return result;
	}
	public static String get(Scanner sc){
		int inRow = Integer.parseInt(sc.nextLine());
		int pos = 0;
		int match = -1;
		boolean[] found = new boolean[16];
		for(int r = 0; r < 4; r++){
			String[] row=sc.nextLine().split(" ");
			if((inRow-1)==r){
				for(String s: row){
					found[s.charAt(0)-'0']= true;
				}
			}
		}
		inRow = Integer.parseInt(sc.nextLine());
		for(int r = 0; r < 4; r++){
			String[] row=sc.nextLine().split(" ");
			if((inRow-1)==r){
				for(String s: row){
					if(found[s.charAt(0)-'0']){
						match = s.charAt(0) - '0';
						pos++;
					}
				}
			}
		}
		String result = (pos==0)? "Volunteer cheated!" :(pos>1)? "Bad magician!" : ""+match;

		return result;
		
	}

}
