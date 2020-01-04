package patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MK_String_Patterns {

	public static void main(String[] args) {

		// One_to_N_Numbers();
		// reverse_N_to_One();
		// sum_of_N_numbers();
		// check_even_Odd();
		// prime_Numbers_1_to_N();
		// checks_Prime_orNot();
		// multiplication();
		// multiplication2();
		// palindrome();
		// Addition_matrix();
		// String_Reverse();
		// vowels_count();
		// removing_numbers_In_String();
		// adding_Numbers_In_String();
		// FibonacciSeries();
		// Factorial();
		// Armstrong();
		// RemovingVowelsPosition();
		// Removing_Spaces();
		// EleminatingEverySecondVowel();
		 removeDuplicates();
		// StringSorting();
		// countingWords();
		// charContainsInString();
		// CountingEachCharacter();
		// uppercase();
		// leapYear();
		// random();
		// wordsRevers();
	}

	public static void wordsRevers() {

		String str = "Mahesh kumar amara";
		String[] words = str.split(" ");

		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(reverseString);
	}

	// =============================================================================================================
	public static void charContainsInString() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String");
		String str = sc.nextLine();
		System.out.println("Enter any Character");
		String str2 = sc.nextLine();
		char ch = str2.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (ch == c) {
				count++;
				System.out.print(c + " ");
			}
		}
		System.out.println("count:" + count);
		sc.close();
	}

	// =============================================================================================================
	public static void countingWords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		int count = 1;

		for (int i = 1; i < str.length(); i++) {

			char c = str.charAt(i);
			if ((c == ' ') && ((c + 1) != ' ')) {

				// if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of Words in a Given String are:" + count);
		sc.close();

		/**
		 * String[]d=str.trim().split(" "); 
		 * System.out.println(d.length); sc.close();
		 */
	}

	// ==============================================================================================================================
	public static void StringSorting() {

		String s = "mahesh kumar amara";
		char[] c = s.toCharArray();
		int temp;
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < s.length(); j++) {

				if (c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = (char) temp;
				}
			}
			System.out.print(c[i] + " ");
		}
	}

	// ==============================================================================================================================
	public static void removeDuplicates() {
		String str = "Mahesh Kumar Amara";
		str = str.toLowerCase();
		Set<Character> set = new LinkedHashSet<>();
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				str2 = str2 + c;
			}
		}
		//System.out.println(set);
		System.out.print(str2 + " ");

	}

	/**
	* int a[] = { 1, 2, 3, 3, 6, 7, 8, 8, 9, 9 };
	 * 
	 * Set<Integer> unique = new HashSet<Integer>();
	 * 
	 * for (int i = 0; i < a.length; i++) { 
	 * 	unique.add(a[i]); 
	 * }
	 * 
	 * for (Integer s : unique) {
	 *  	System.out.println(s);
	 *  }
	 *    }
	 * 
	 * }
	 * 
	 */

	/**
	 * Scanner sc = new Scanner(System.in); 
	 * System.out.println("Enter String Value");
	 * String str = sc.nextLine();
	 * str=str.toLowerCase(); 
	 * String str2 ="";
	 * for( int i = 0;i<str.length();i++) {
	 * 		 char c = str.charAt(i);
	 * if (c != ' '){ 
	 * str2 = str2 + c; 
	 * str = str.replace(c, ' ');
	 *  }
	 * }
	 * System.out.println(str2); 
	 * sc.close();
	 * 
	 * }
	 */
	// =====================================================================================================================================
	public static void Armstrong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		int temp = num;
		int c = 0, a;
		while (num > 0) {
			a = num % 10;
			num = num / 10;
			c = c + (a * a * a);
		}
		if (temp == c) {
			System.out.println("Given number is Amstrong");
		} else {
			System.out.println("Given number not Amstrong");
		}
		sc.close();

	}

	// ================================================================================================================
	public static void Factorial() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		sc.close();
	}

	// =========================================================================================================================================================================================================================
	public static void FibonacciSeries() {

		int n1 = 0, n2 = 1, n3, i, count = 15;
		System.out.print(n1 + " " + n2);

		for (i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

	// ===========================================================================================================================================================================
	public static void prime_Numbers_1_to_N() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		System.out.println("Prime Numbers between 1 and" + " " + n);
		for (int i = 1; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i + " ");
			}
		}
		sc.close();
	}
	// =======================================================================================================================================================

	public static void checks_Prime_orNot() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value:");
		int i;
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("Prime starts from 2");
		}
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("not a prime");
				break;
			}
		}
		if (n == i) {
			System.out.println("Prime number");
		}
		sc.close();
	}

	// =======================================================================================================================================================================

	public static void palindrome() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + (n % 10);
			n = n / 10;
		}

		if (rev == temp) {
			System.out.println(temp + " " + "is a palindrome");
		} else {
			System.out.println(temp + " " + "is not a palindrome");
		}
		sc.close();

		/*
		 * Scanner sc = new Scanner(System.in); 
		 * System.out.println("Enter any String/Number to check whether palindrome or not"); 
		 * String str = sc.nextLine(); 
		 * String rev = ""; 
		 * for (int i = str.length() - 1; i >= 0; i--) 
		 * { 
		 * rev = rev + str.charAt(i); 
		 * } 
		 * if (str.equals(rev)) {
		 * System.out.println("Given number is a palindrome"); 
		 * } else {
		 * System.out.println("Given number not a palindrome"); 
		 * } 
		 * sc.close();
		 */
	}

	// =================================================================================================================
	public static void One_to_N_Numbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		sc.close();
	}

	// ===================================================================================================================
	public static void reverse_N_to_One() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			System.out.print(i + " ");
		}
		sc.close();
	}
	// ===================================================================================================================

	public static void sum_of_N_numbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			// sum+= i;
			sum = sum + i;
		}
		System.out.println("sum of n numbers are:" + sum);
		sc.close();
	}
	// =========================================================================================================================================

	public static void check_even_Odd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		sc.close();
	}

	// ============================================================================================================================================
	public static void multiplication() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
		sc.close();
	}

	// ==================================================================================================================================================================
	public static void multiplication2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

	// =============================================================================================================================================================================
	public static void Addition_matrix() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int rows = sc.nextInt();
		System.out.println("enter cols");
		int cols = sc.nextInt();

		int[][] a = new int[rows][cols];
		int[][] b = new int[rows][cols];

		System.out.println("enter First matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter Second matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("After addition");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + b[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

	// ======================================================================================================================================================
	public static void String_Reverse() {

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Any String");
		// String str = sc.nextLine();
		/*
		 * String str2 = ""; 
		 * for (int i = 0; i < str.length(); i++) 
		 * { 
		 * char newChar =
		 * str.charAt(i); str2 = newChar + str2; 
		 * } 
		 * System.out.println(str2); 
		 * sc.close();
		 */

		/*
		 * for(int i=str.length()-1;i>=0;i--) { 
		 * char c=str.charAt(i);
		 * System.out.print(c);
		 *  }
		 */

		/*
		 * StringBuffer sbf=new StringBuffer(str); 
		 * System.out.println(sbf.reverse());
		 */
		String input = "mahesh";
		char[] hello = input.toCharArray();
		List<Character> trial1 = new ArrayList<>();
		for (char c : hello)
			trial1.add(c);
		System.out.println(trial1);
		Collections.reverse(trial1);
		ListIterator<Character> li = trial1.listIterator();
		while (li.hasNext())
			System.out.print(li.next());
	}

	// ================================================================================================================================
	public static void vowels_count() {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter String Value"); 
		 * String str = sc.nextLine(); 
		 * int total = 0; 
		 * for (int i = 0; i < str.length(); i++) { 
		 * char c = str.toLowerCase().charAt(i); 
		 * if (c == 'a' || c == 'e' || c == 'i' || c == 'o'  || c == 'u') 
		 * { total++; 
		 * System.out.println("Vowels are" + " " + c); } }
		 * System.out.println("Count:" + total); 
		 * sc.close();
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int count = 0;
		char c[] = str.toCharArray();
		for (char ch : c) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			default:
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}

	// ===============================================================================================================================
	public static void removing_numbers_In_String() {
		String str = "Mahesh12mf3fd45xv67gxfg899KUMAR";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			char myChar = str.toLowerCase().charAt(i);
			if (!(myChar >= 48 && myChar <= 57)) {
				str2 = str2 + myChar;
			}
		}
		System.out.println(str2);
	}

	// =====================================================================================================================================
	public static void adding_Numbers_In_String() {
		String str = "Mahesh12mf3fd45xv67gxfg899KUMAR";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char myChar = str.toLowerCase().charAt(i);
			if (myChar >= 48 && myChar <= 57) {

				String char_String = String.valueOf(myChar);
				int num = Integer.parseInt(char_String);
				sum = sum + num;
			}
		}
		System.out.println("Total Sum:" + sum);

	}

	// ====================================================================================================================================
	public static void RemovingVowelsPosition() {

		String str = "aabbbccccccdddddddeff";
		String str2 = " ";
		char tempchar = 0;
		int totalchar = str.length();
		for (int i = 0; i < totalchar; i++) {
			char c = str.charAt(i);
			if (tempchar == c) {
				str2 = str2 + c;
				if (i == totalchar - 1) {
					System.out.print(str2);
				}
			} else {
				tempchar = c;
				if (i != 0) {
					System.out.print(str2);
				}
			}
			str2 = " " + tempchar;
		}
		System.out.println(str2);
	}

	// ===========================================================================================================================
	public static void Removing_Spaces() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any name");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
			} else {
				System.out.print(ch[i]);
			}
		}
		sc.close();
	}
	// =============================================================================================================================================================

	public static void EleminatingEverySecondVowel() {
		String str = "mahesh kumar";
		String str2 = "";
		int TotalChar = str.length();
		int Charpos = 0;
		for (int i = 0; i < TotalChar; i++) {
			char myChar = str.toUpperCase().charAt(i);
			if (myChar == 'A' || myChar == 'E' || myChar == 'I' || myChar == 'O' || myChar == 'U') {
				Charpos++;
				if (Charpos % 2 != 0) {
					str2 = str2 + str.charAt(i);
				}
			} else {
				str2 = str2 + str.charAt(i);
			}
		}
		System.out.println(str2);
	}

	// ===========================================================================================================================================================
	public static void CountingEachCharacter() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int count = 0;
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);

			} else {
				count = map.get(c);
				count++;
				map.put(c, count);

			}

		}
		for (Character key : map.keySet()) {
			System.out.println("Character: " + key + " " + "Count: " + map.get(key));
		}
		sc.close();
	}

	// ============================================================================================================================

	public static void uppercase() {
		int Upper = 0;
		int Lower = 0;
		String str = "MAHESH kumar Amara";
		String UCase = " ";
		String LCase = " ";

		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if (c >= 65 && c <= 90) {
				Upper++;
				UCase = UCase + c;
			}
			if (c >= 97 && c <= 122) {
				Lower++;
				LCase = LCase + c;
			}
		}
		System.out.println("Ucount:" + Upper);
		System.out.println("UpperCase:" + UCase + " ");
		System.out.println("Lcount:" + Lower);
		System.out.println("LCase:" + LCase);

	}
	// ===========================================================================================================================================

	public static void leapYear() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Year");
		int year = sc.nextInt();

		// if(((year % 4==0)&&(year % 100 !=0))||(year%400==0)) {
		if (year % 400 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("not a Leap Year");
		}
		sc.close();
	}

	// =======================================================================================================================================================
	public static void random() {
		int i = 100;
		Random r = new Random();
		int b = r.nextInt(i);
		System.out.println(b);

	}
	// =============================================================================================================================================================

}
