package Integers;

public class ReverseDigits {
	public static void main(String args[]){
		System.out.println("Reversed(123): "+reverse(123));
		System.out.println("Reversed(123456): "+reverse(123456));
		System.out.println("Reversed(54321): "+reverse(54321));
		
		
	}
	public static int reverse(int i){
		int reversed = 0;
			
		while(i>0){
			reversed *= 10;
			reversed += i%10;
			i/=10;
		}
		return reversed;
	}
}
