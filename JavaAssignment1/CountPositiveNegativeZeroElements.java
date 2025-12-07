package JavaAssignment1;

import java.util.Scanner;

public class CountPositiveNegativeZeroElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;
		
		for (int element : arr) {
			if (element > 0) {
				positiveCount++;
			} else if (element < 0) {
				negativeCount++;
			} else {
				zeroCount++;
			}
		}
		
		System.out.println("\n--- Results ---");
		System.out.println("Positive elements: " + positiveCount);
		System.out.println("Negative elements: " + negativeCount);
		System.out.println("Zero elements: " + zeroCount);
		
		sc.close();
	}
}