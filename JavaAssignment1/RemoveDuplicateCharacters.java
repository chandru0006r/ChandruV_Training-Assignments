package JavaAssignment1;

import java.util.*;
public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		
		String uniqueStr = "";
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if (uniqueStr.indexOf(ch) == -1) {
				uniqueStr += ch;
			}
		}
		
		System.out.println("Original String: " + input);
		System.out.println("String without duplicates (Manual): " + uniqueStr);
		
		sc.close();
	}
}