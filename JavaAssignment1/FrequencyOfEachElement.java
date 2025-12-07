package JavaAssignment1;

import java.util.Scanner;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] frequency = new int[arr.length];
		int visited = -1;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (frequency[i] != visited) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						frequency[j] = visited;
					}
				}
				frequency[i] = count;
			}
		}
		
		System.out.println("\n--- Element Frequencies ---");
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != visited) {
				System.out.println("Element " + arr[i] + ": " + frequency[i] + " times");
			}
		}
		
		sc.close();
	}
}