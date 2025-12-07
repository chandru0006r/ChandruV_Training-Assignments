package JavaAssignment1;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicateElementsFromArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		if (size == 0) {
			System.out.println("Array without Duplicates: []");
			sc.close();
			return;
		}

		Arrays.sort(arr);

		int j = 0;
		int[] temp = new int[size];
		
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		
		temp[j++] = arr[size - 1];
		
		int[] uniqueArr = new int[j];
		for (int i = 0; i < j; i++) {
			uniqueArr[i] = temp[i];
		}
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Array without Duplicates: " + Arrays.toString(uniqueArr));
		
		sc.close();
	}
}