package assignment_1;

import java.util.Scanner;

public class Q11 {
	static public int sum(int a, int b) {
		return a + b;
	}

	static public int sub(int a, int b) {
		if ((a - b) < 0)
			return 0;
		return a - b;
	}

	public static void main(String[] args) {
		int x, y, r;
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 4; i++) {
			System.out.println("Enter first number: ");
			x = s.nextInt();
			System.out.println("Enter second number: ");
			y = s.nextInt();
			r = (x > y) ? (sum(x, y)) : (sub(x, y));
			System.out.println("Result is: " + r);
		}
	}
}
