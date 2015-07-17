package Strings;

public class Reverse {
	public static void main(String args[]){
		System.out.println("Reversed: "+ reverseWords("Sup Dog"));
	}
	public static String reverseWords(String s){
		String[] tokens = s.split(" ");
		StringBuilder reversed = new StringBuilder();
		reversed.append(new StringBuilder(tokens[0]).reverse());
		for(int x = 1; x < tokens.length; x++){
			reversed.append(' ');
			reversed.append(new StringBuilder(tokens[x]).reverse());
		}
		return reversed.toString();
	}
}
