package assignment_1;

import java.util.*;

interface In1 {
	public void display(int p);
}

class testClass implements In1 {
	public void display(int p) {
		int i, flag = 0;
		for (i = 2; i <= p / 2; i++) {
			if (p % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(p + " is a prime number ...");
		} else {
			System.out.println(p + " is not a prime number ...");
		}
	}
}

public class Q3 {
	public static void main(String[] args) {
		int n, t;
		Scanner s = new Scanner(System.in);
		testClass obj = new testClass();
		System.out.println("Enter how many times you want to run: ");
		t = s.nextInt();
		for (int i = 1; i <= t; i++) {
			System.out.println("Enter the number: ");
			n = s.nextInt();
			obj.display(n);
		}
	}
}
