package JavaAssignment1;

import java.util.Scanner;

public class CountWordsInAString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string (sentence): ");
		String input = sc.nextLine();
		
		String trimmed = input.trim();
		
		if (trimmed.isEmpty()) {
			System.out.println("Word count: 0");
		} else {
			String[] words = trimmed.split("\\s+");
			
			System.out.println("Word count: " + words.length);
		}
		
		sc.close();
	}
}