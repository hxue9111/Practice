package Bases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BaseConversion {

	public static void main(String args[]){
		System.out.println();
	}
	public static List<Integer> getDigits(int num, int base){
		List<Integer> d = new ArrayList<Integer>();
		while(num>0){
			d.add(num%base);
			num/=base;
		}
		Collections.reverse(d);
		return d;
	}
	public static int valueFrom(List<Integer> digits, int base){
		int val = 0;
		for(int idx = 0; idx < digits.size(); idx++){
			val+= Math.pow(base, idx+1)*digits.get(idx);
		}
		return val;
	}


}
