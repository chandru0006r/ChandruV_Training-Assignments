package JavaAssignment1;

import java.util.Scanner;
import java.util.Arrays;

public class leftRotateArrayByN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the number of positions to left rotate (N): ");
		int n = sc.nextInt();
		
		n = n % size; 
		
		int[] rotatedArr = new int[size];
		
		for (int i = 0; i < size - n; i++) {
			rotatedArr[i] = arr[n + i];
		}
		System.out.println("mid Array: " + Arrays.toString(rotatedArr));

		for (int i = 0; i < n; i++) {
			rotatedArr[size - n + i] = arr[i];
		}
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Left Rotated by " + n + ": " + Arrays.toString(rotatedArr));
		
		sc.close();
	}
}