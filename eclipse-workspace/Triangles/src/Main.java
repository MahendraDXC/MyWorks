import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		try {

			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if (x > y) {
				if (x > z) {
					if ((2 * x * x) == (x * x) + (y * y) + (z * z)) {
						// right angled triangle
						System.out.println(2);
					}
					if ((2 * x * x) < (x * x) + (y * y) + (z * z)) {
						// acute
						System.out.println(1);
					}
					if ((2 * x * x) > (x * x) + (y * y) + (z * z)) {
						// obtuse
						System.out.println(3);
					}

				} else if (z > x) {
					if ((2 * z * z) == (z * z) + (x * x) + (y * y)) {
						// right angled triangle
						System.out.println(2);
					}
					if ((2 * z * z) < (z * z) + (x * x) + (y * y)) {
						// acute
						System.out.println(1);
					}
					if ((2 * z * z) > (z * z) + (x * x) + (y * y)) {
						// obtuse
						System.out.println(3);
					}

				} else if (z == x) {

					if ((2 * z * z) == (z * z) + (x * x) + (y * y)) {
						// right angled triangle
						System.out.println(2);
					}
					if ((2 * z * z) < (z * z) + (x * x) + (y * y)) {
						// acute
						System.out.println(1);
					}
					if ((2 * z * z) > (z * z) + (x * x) + (y * y)) {
						// obtuse
						System.out.println(3);
					}
				}

			}

			// ---------
			else if (x < y) {
				if (y > z) {
					if ((2 * y * y) == (y * y) + (z * z) + (x * x)) {
						// right angled triangle
						System.out.println(2);
					}
					if ((2 * y * y) < (y * y) + (z * z) + (x * x)) {
						// acute
						System.out.println(1);
					}
					if ((2 * y * y) > (y * y) + (z * z) + (x * x)) {
						// obtuse
						System.out.println(3);
					}

				}
				if (z > y) {
					if ((2 * z * z) == (z * z) + (x * x) + (y * y)) {
						// right angled triangle
						System.out.println(2);
					}
					if ((2 * z * z) < (z * z) + (x * x) + (y * y)) {
						// acute
						System.out.println(1);
					}
					if ((2 * z * z) > (z * z) + (x * x) + (y * y)) {
						// obtuse
						System.out.println(3);
					}

				}
				if (z == y) {

					if ((2 * z * z) == (z * z) + (x * x) + (y * y)) {
						// right angled triangle
						System.out.println(2);
					}
					if ((2 * z * z) < (z * z) + (x * x) + (y * y)) {
						// acute
						System.out.println(1);
					}
					if ((2 * z * z) > (z * z) + (x * x) + (y * y)) {
						// obtuse
						System.out.println(3);
					}
				}

			}
//        // ----------------------------------------------------------------------------------
			else if (x == y) {
				if (z > x) {

					if ((2 * z * z) == (z * z) + (x * x) + (y * y)) {
						// right angled triangle
						System.out.println(2);
					}
					if ((2 * z * z) < (z * z) + (x * x) + (y * y)) {
						// acute
						System.out.println(1);
					}
					if ((2 * z * z) > (z * z) + (x * x) + (y * y)) {
						// obtuse
						System.out.println(3);
					}
				} else if (z < x) {
					if ((2 * y * y) == (y * y) + (z * z) + (x * x)) {
						// right angled triangle
						System.out.println(2);
					}
					if ((2 * y * y) < (y * y) + (z * z) + (x * x)) {
						// acute
						System.out.println(1);
					}
					if ((2 * y * y) > (y * y) + (z * z) + (x * x)) {
						// obtuse
						System.out.println(3);
					}
				} else if (x == z) {
					if ((2 * y * y) == (y * y) + (z * z) + (x * x)) {
						// right angled triangle
						System.out.println(2);
					}
					if ((2 * y * y) < (y * y) + (z * z) + (x * x)) {
						// acute
						System.out.println(1);
					}
					if ((2 * y * y) > (y * y) + (z * z) + (x * x)) {
						// obtuse
						System.out.println(3);
					}
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
