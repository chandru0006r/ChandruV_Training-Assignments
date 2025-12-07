package JavaAssignment1;

import java.util.Scanner;

public class CountDigitsAlphabetsSpecialCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		
		int digitCount = 0;
		int alphabetCount = 0;
		int specialCharCount = 0;
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if (Character.isDigit(ch)) {
				digitCount++;
			} else if (Character.isLetter(ch)) {
				alphabetCount++;
			} else if (!Character.isWhitespace(ch)) {
				specialCharCount++;
			}
		}
		
		System.out.println("Digits: " + digitCount);
		System.out.println("Alphabets: " + alphabetCount);
		System.out.println("Special Characters: " + specialCharCount);
		
		sc.close();
	}
}