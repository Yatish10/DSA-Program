package String;

public class ReverseInteger {
	
	public static long reverseInteger(int number) {
		boolean isNegative = number < 0;
		if(isNegative) {
			number = number * -1;
		}
		long reverse =0;
		int lastDigit;
		while(number > 0) {
			lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number = number /10;
		}
	    return isNegative ? reverse * -1 : reverse;
	}
	
	public static void main(String[] args) {
		System.out.println("Reverse Integer is : "+reverseInteger(-52689));
	}
}
