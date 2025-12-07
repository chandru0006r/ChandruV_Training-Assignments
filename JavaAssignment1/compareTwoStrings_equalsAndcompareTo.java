package JavaAssignment1;

import java.util.Scanner;

public class compareTwoStrings_equalsAndcompareTo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string 1: ");
		String s1 = sc.nextLine();
		
		System.out.print("Enter string 2: ");
		String s2 = sc.nextLine();
		
		System.out.println("Equals: " + s1.equals(s2));
		
		int result = s1.compareTo(s2);
		System.out.println("CompareTo result: " + result);
		
		sc.close();
	}
}