package assignment_1;

import java.util.*;

public class Q8 {
	static void removeindexInArray(int[] arr, int n) {
		int elementToBeRemoved = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] == elementToBeRemoved) {
				for (int j = i; j < n - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[n - 1] = 0;
			}
		}
		System.out.println("Array after removing index: ");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[100];
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		removeindexInArray(arr, n);
	}

}
