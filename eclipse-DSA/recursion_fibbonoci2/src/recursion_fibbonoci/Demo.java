package recursion_fibbonoci;

//public class Demo {

//	int count = 0;
//
//	static void fibbIteration(int l) {
//		int f1 = 0, f2 = 1;
//		int f3 = 0;
//
//		System.out.print(f1 + " " + f2 + " ");
//		for (int i = 0; i < l; i++) {
//			f3 = f1 + f2;
//			f1 = f2;
//			f2 = f3;
//			System.out.print(f3 + " ");
//		}
//	}
//
//	void fibbRecursion(int limit, int f1, int f2) {
//		int f3 = f1 + f2;
//		if (f3 > limit) {
////			return 0;
//		} else {
//			count++;
//			System.out.print(f3 + " ");
//			f1 = f2;
//			f2 = f3;
//			fibbRecursion(limit, f1, f2);
////			return fibbRecursion(limit, f1, f2);
//		}
//
//	}
//
//	public static void main(String[] args) {
//		Demo.fibbIteration(3);
//		System.out.println();
//		Demo demo = new Demo();
//		System.out.print(0 + " " + 1 + " ");
//		demo.fibbRecursion(10_00_00_000, 0, 1);
//		System.out.println("\n" + demo.count + " times called");
//
//	}
//
//}

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Demo recursion = new Demo();
	    var rec = recursion.fibonacci(10);
	    System.out.println(rec);
		
		System.out.println(Demo.fib(5));;

	}

	public int fibonacci(int n) {
	    if (n<0) {
	      return -1;
	    }
	    if (n==0 || n==1) {
	      return n;
	    }
	    return fibonacci(n-1) + fibonacci(n-2);
	  }
	
	public static int fib(int n) {
		if (n <0) {
			return -1;
		}if(n ==0 || n==1) {
			return n;
		}
		int num =fib(n - 1) + fib(n - 2);
		System.out.print(n+" ");
		
		return num;

	}

}