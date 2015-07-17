package Bases;

public class StringToBase {
	public static void main(String args[]){
		System.out.println(strToInt("A", 11));
	}
	public static int strToInt(String s, int base){
		if(s == null && base < 2 || base > 36){
			return -1;
		}else{
			int result = 0, factor = 1;
			char[] digits = s.toCharArray();

			for(int idx = digits.length; idx > 0 ; idx--){
				if(digits[idx-1] < 48 || (digits[idx-1] > 57 && digits[idx-1] < 65) || digits[idx-1] > 90){
					return -1;
				}
				if(digits[idx-1] >= 65 && base <= ((int)digits[idx-1] - 55) || digits[idx-1] <= 57 && base <= digits[idx-1] - 48){
					return -1;
				}

				result+=((int)digits[idx-1] - (((int)digits[idx-1]<= 57)? 48 : 55)) * factor;
				factor*=base;
			}

			return result;
		}
	}
}
