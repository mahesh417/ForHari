package javaPrograms;

import java.util.Scanner;

public class CountingStringValues {

	public static void main(String[] args) {

		String str = "abc";
		Scanner ac = new Scanner(System.in);
		int total = 10;
		int i;
		for (i = 1; i < total; i++) {
			System.out.println("Enter String Name");
			String str2 = ac.next();
			if (str2.equalsIgnoreCase(str)) {
				break;
			}

		}

		System.out.println("Expected Value found at row number:" + i);
		ac.close();
	}
}
