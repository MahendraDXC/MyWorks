package simpletest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		int temp = 0;
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < n; j++) {
				temp += Math.pow(2, j);
				System.out.print(a + temp * b + " ");
			}
//			System.out.println();
			a = in.nextInt();
			b = in.nextInt();
			n = in.nextInt();
			temp = 0;

		}
		in.close();

	}

}







