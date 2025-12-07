package JavaAssignment1;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		if (size < 2) {
			System.out.println("Array must have at least 2 elements.");
			sc.close();
			return;
		}
		
		int[] arr = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int secondLargest = arr[size - 2];
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("The second largest element is: " + secondLargest);
		
		sc.close();
	}
}