package com.mg;
public class PowerOfANumber {

	public static double power(double n, int p) {
		int count = 0;
		double ans = 1;
		if (p >= 0) {
			if (count != p) {
				count++;
				ans = 1 * n * power(n, p - 1);
				return ans;

			} else {

				return 1;
			}
		} else {

			if (count != p) {
				count++;
				ans = 1 / n * power(n, p + 1);
				return ans;

			} else {

				return 1;
			}

		}

	}

	public static void main(String[] args) {
		System.out.println(PowerOfANumber.power(6, 2));

	}

}
