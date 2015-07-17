package CodeJam;

import java.util.Scanner;

public class T9Spelling {
	public static void main(String args[]){
		t9spelling("4"
				+ "\nhi"
				+ "\nyes"
				+ "\nfoo  bar"
				+ "\nhello world");
	}
	public static void t9spelling(String s){
		int[] map = {2, 2, 2, 3, 3, 3,
				4, 4, 4, 5, 5, 5, 6, 6, 6, 
				7, 7, 7, 7, 8, 8, 8, 9 ,9 ,9 ,9};
		Scanner sc = new Scanner(s);
		int cases = Integer.parseInt(sc.nextLine());
		for(int c = 0; c<cases; c++){
			StringBuilder code = new StringBuilder();
			char[] line = sc.nextLine().toCharArray();
			int prev = -1;
			for(Character ch: line){
				if(ch>=97 && ch<= 123){
					if(map[ch-97] == prev){
						code.append(' ');
					}
					for(int i = 0; i<=ch-97 ; i++){
						if(map[i] == map[ch-97]){
							code.append(map[i]);
						}
					}
					prev = map[ch-97];
				}
				if(ch == 32){
					if(prev==32)
						code.append(' ');
					code.append('0');
					prev = 32;
				}
			}
			System.out.println("Case #"+(c+1)+": "+code.toString());
		}
		
	}
}
