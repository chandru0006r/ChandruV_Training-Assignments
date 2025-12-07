package JavaAssignment1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String original = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(original);
		
		sb.reverse();
		
		String reversed = sb.toString();
		
		System.out.println("Original String: " + original);
		System.out.println("Reversed String: " + reversed);
		
		sc.close();
	}
}