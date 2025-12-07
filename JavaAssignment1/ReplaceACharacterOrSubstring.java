package JavaAssignment1;

import java.util.Scanner;

public class ReplaceACharacterOrSubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the original string: ");
		String original = sc.nextLine();
		
		System.out.print("Enter the character to replace: ");
		char oldChar = sc.next().charAt(0);
		
		System.out.print("Enter the replacement character: ");
		char newChar = sc.next().charAt(0);
		
		String replacedChar = original.replace(oldChar, newChar);
		
		System.out.println("Original: " + original);
		System.out.println("Replaced: " + replacedChar);
		
		sc.close();
	}
}