package UniqueElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueCharacters {

	public static void main(String[] args) {
		System.out.println(noLibUnique("bal"));
	}
	public static boolean unique(String s){
		HashSet<Character> set = new HashSet<Character>();

		for(char c: s.toCharArray()){
			if(!set.add(c)){
				return false;
			}
		}
		return true;
	}
	public static boolean noLibUnique(String s){
		boolean[] map = new boolean[256];
		char[] chararray=s.toCharArray(); 
		for(char c: chararray){
			if(map[(int)c]){
				return false;
			}
			map[(int)c] = true;
		}
		return true;
	}

}
