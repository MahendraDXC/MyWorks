package sum_of_digits;

public class Demo {
	
	static int sumOfDigits(int n) {
		if(n<=0) {
			
			return 0;
		}
		
		return n%10 + sumOfDigits(n/10);
	}

	public static void main(String[] args) {
		System.out.println(Demo.sumOfDigits(0002));

	}

}
