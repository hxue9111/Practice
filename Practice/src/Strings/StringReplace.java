package Strings;

public class StringReplace {
	public static String replaceNth(String s, String replace, String replaceWith, int nth){
		String[] tokens = s.split(replace);
		StringBuilder replaced = new StringBuilder();
		
		for(int idx = 0; idx < tokens.length; idx++){
			replaced.append(tokens[idx]);
			if(idx+1 == nth){
				replaced.append(replaceWith);
			}else{
				replaced.append(replace);
			}
		}
		return s;
	}
	public static String replaceFirst(String s, String replace, String replaceWith){
		StringBuilder replaced = new StringBuilder();
		
		replaced.append(s.substring(0,s.indexOf(replace)));
		replaced.append(replaceWith);
		replaced.append(s.substring(s.indexOf(replace)+replace.length(), s.length()));
		return replaced.toString();
	}
	public static void main(String args[]){
		System.out.println(replaceFirst("abcdefg", "abc", "cba"));
	}
}
