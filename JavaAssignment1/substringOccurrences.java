package JavaAssignment1;

import java.util.Scanner;

public class substringOccurrences {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the main string: ");
		String text = sc.nextLine();
		
		System.out.print("Enter the substring to count: ");
		String pattern = sc.nextLine();
		
		int count = 0;
		int startIndex = 0;
				
		while (startIndex != -1) {
			
			startIndex = text.indexOf(pattern, startIndex);
			
			if (startIndex != -1) {
				count++;
				startIndex += pattern.length();
			}
		}
		
		System.out.println("Text: " + text);
		System.out.println("Pattern: " + pattern);
		System.out.println("Occurrences: " + count);
		
		sc.close();
	}
}