package patterns;

import java.util.Scanner;

public class MK_Number_Patterns {

	public static void main(String[] args) {
		pattern1();
		pattern2();
		pattern3();
		pattern4();
		pattern5();
		pattern6();
		pattern7();
		pattern8();
		pattern9();
		pattern10();
		pattern11();
		pattern12();
		pattern13();
		pattern14();

	}
	
	// ===============================================================================================================
    /**
     * 			1
				22
				333
				4444
				55555
     */

	public static void pattern1() {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

	// =====================================================================================================================================
	/**
	 		1
			12	
			123
			1234
			12345

	*/

	public static void pattern2() {
		int num = 4;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}

	}
	// =====================================================================================================================================

	/**
	 * 			1
				23
				456
				78910
	 */

	public static void pattern3() {
		int num = 4, count = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				count = count + 1;
				System.out.print(count);
			}
			System.out.println();
		}

	}
	// =====================================================================================================================================
	

	/**
	 * 		1
			21
			321
			4321
	  
	 */

	public static void pattern4() {
		int num = 4;
		for (int i = 1; i <= num; i++) {
			for (int j = i; j >= 1; j--) {
				// count=count+1;
				System.out.print(j);
			}
			System.out.println();
		}

	}

	// ==========================================================================================================================================
	
	/**
	  		1 
			1 2 1 
			1 2 3 2 1 
			1 2 3 4 3 2 1 
			1 2 3 4 5 4 3 2 1 

	 */

	public static void pattern5() {

		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int k = i - 1; k >= 1; k--) {

				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

	// ===========================================================================================================================================
	
	/**
	 		5 4 3 2 1 
			5 4 3 2 
			5 4 3 
			5 4 
			5 
	 */

	public static void pattern6() {

		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print(j + " ");

			}

			System.out.println();
		}

	}
	// ===========================================================================================================================================

	/**  	1 2 3 
			4 5 6 
			7 8 9 
			10 11 12 
			13 14 15 
	 */
	public static void pattern7() {
		int num = 5, count = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 3; j++) {
				count = count + 1;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}
	// ===========================================================================================================================================

	/**		11111 
			22222 
			33333 
			44444 
			55555 
	 */
	public static void pattern8() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
	// ===========================================================================================================================================
	/**		12345 
			12345 
			12345 
			12345 
			12345 
	 */

	public static void pattern9() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}
	
	// ===========================================================================================================================================
	/** 	enter number
	    	5
	 			555555555 
	  		      4444444 
	   			    33333 
	                  222 
	     		        1 
	*/
	public static void pattern10() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int count = n;
		int x = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * n - x); k++) {
				System.out.print(count);
			}
			count--;
			x = 2 + x;
			System.out.println(" ");
		}
		sc.close();
	}

	// ===========================================================================================================================================

	/** 	1 
	             101 
 	            10101 
               1010101
	*/
	public static void pattern11() {

		int n = 4;
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				int rem = col % 2;
				System.out.print(rem);
			}
			System.out.println(" ");
		}
	}
	// ===========================================================================================================================================

	/**  Enter any number
	     5
				 975313579 
	 			  9753579 
	  		   	   97579 
	   			    979 
	    		     9 
	 */
	public static void pattern12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int x = 1;
		for (int i = 1; i <= n; i++) {
			int value = (2 * n - 1);
			int y = value;

			for (int j = 1; j <= i - 1; j++) {

				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * n - x; k++) {
				if (k <= n - i) {
					System.out.print(value);
					value = value - 2;
				} else if (k <= y) {
					System.out.print(value);
					value = value + 2;
				}
			}
			System.out.println(" ");
			x = x + 2;
		}
		sc.close();
	}
	
	// ===========================================================================================================================================

	/**  enter any neumber
	 	 3
		    1 
		   234 
		  56789 
	 */	
	public static void pattern13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any neumber");
		int n = sc.nextInt();
		int count = 1;
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print(count);
				count++;

			}
			System.out.println(" ");
		}
		sc.close();
	}
	
	// ===========================================================================================================================================
	/**	enter number
	    4
   		    1 
  		   aei 
 		  23456 
		 ouaeiou 
	 */	
	public static void pattern14() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		char ch[] = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;
		int count1 = 1;
		int x = 1;

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 1) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (2 * i - 1); k++) {
					System.out.print(ch[count]);
					count++;
					if (count > 4) {
						count = 0;
					}
				}
			} else if (i % 2 == 1) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (2 * i - 1); k++) {
					if (count1 <= 9) {
						System.out.print(count1);
						count1++;
					} else if (count1 > 9) {
						System.out.print(x);
						x++;
					}
				}
			}
			System.out.println(" ");
			sc.close();
		}
	}
	
}
