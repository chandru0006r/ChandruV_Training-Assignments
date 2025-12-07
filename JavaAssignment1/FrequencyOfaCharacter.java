package JavaAssignment1;

import java.util.Scanner;

public class FrequencyOfaCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		
		System.out.print("Enter the character to find the frequency of: ");

		char targetChar = sc.next().charAt(0);
		
		int frequency = 0;
		
		String lowerCaseInput = input.toLowerCase();
		char lowerCaseTarget = Character.toLowerCase(targetChar);

		for (int i = 0; i < lowerCaseInput.length(); i++) {
			if (lowerCaseInput.charAt(i) == lowerCaseTarget) {
				frequency++;
			}
		}
		
		System.out.println("The character '" + targetChar + "' appears " + frequency + " times.");
		
		sc.close();
	}
}