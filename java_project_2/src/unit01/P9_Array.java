package unit01;
import java.util.Scanner;
/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
         int n;
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the size: ");
         n = s.nextInt();
         int i,j,temp;
         for(i=0;i<n;i++)
         {
        	 for(j=0;j<n-i-1;j++)
        	 {
        		 if(arr[j]>arr[j+1])
        		 {
        			 temp = arr[j];
        			 arr[j] = arr[j+1];
        			 arr[j+1] = temp;
        		 }
        	 }
         }
         for(i=0;i<n;i++)
         {
        	 System.out.println(arr[i]+" ");
         }
	}

	void findTheDuplicateElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate element is: " + arr[i]);
				}
			}
		}
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		int largest = arr[0];
		int secondLargest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second largest element is: " + secondLargest);
	}

	void leftRotationInAnArray(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
		System.out.println("Left rotated array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n\n");
	}

	void removeElementInArray(int[] arr) {
		int elementToBeRemoved = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elementToBeRemoved) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[arr.length - 1] = 0;
			}
		}
		System.out.println("Array after removing element: ");
		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	   }

    }
