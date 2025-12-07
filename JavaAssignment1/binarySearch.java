package JavaAssignment1;

import java.util.Scanner;
import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the element to search: ");
		int target = sc.nextInt();
		
		Arrays.sort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));

		int low = 0;
		int high = arr.length - 1;
		int resultIndex = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				resultIndex = mid;
				break;
			}
			
			if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		if (resultIndex != -1) {
			System.out.println("Element " + target + " found at index " + resultIndex);
		} else {
			System.out.println("Element " + target + " not found in the array.");
		}
		
		sc.close();
	}
}