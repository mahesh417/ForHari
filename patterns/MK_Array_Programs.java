package patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MK_Array_Programs {

	public static void main(String[] args) {
		// Sum_Avg();
		// sorted_numbers();
		// smallest_Number();
		// alphabets();
		// copy_method1();
		// Using_ForLoop();
		// Usign_Arrays_Copy();
		// clone_method();
		// using_ArrayCopy();
		// missing_number();
		removing_duplicate_Numbers();
		// sumOfArray();
		// ToFindAvg();
		// max_number();
		// min_number();
		// second_largestNumber();
		// second_smallestNumber();

	}

	// =====================================================================================================================================
	public static void Sum_Avg() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range values");
		int row = sc.nextInt();
		int sum = 0;
		double avg = 0;
		System.out.println("Enter values");
		int arr[] = new int[row];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("sum:" + sum);
		System.out.println("Length:" + arr.length);
		System.out.println("Avg:" + avg);
		sc.close();
	}

	// ================================================================================================================================================
	/**
	 * Maximum num is:90
	 * 
	 */

	public static void max_number() {
		int a[] = { 20, 40, 50, 90, 10, 5 };
		int max = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (max < a[i]) {
				max = a[i];
			}

		}
		System.out.println("Maximum num is:" + max);

	}

	// ===================================================================================================================================================
	/**
	 * Minimum num is:5
	 * 
	 */

	public static void min_number() {
		int a[] = { 20, 40, 50, 90, 10, 5 };
		int min = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Minimum num is:" + min);
	}
	// =========================================================================================================================================================

	/**
	 * 
	 * 90 50 40 30 20 10 5 Second largest number is:50
	 * 
	 * 
	 */

	public static void second_largestNumber() {
		int temp;
		int a[] = { 20, 40, 50, 90, 10, 5, 30 };
		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					// System.out.print(temp + "temp");
				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}

		System.out.println("Second largest number is:" + a[1]);

	}
	// =====================================================================================================================================================================================================

	public static void second_smallestNumber() {

		int temp;
		int a[] = { 20, 40, 50, 90, 10, 5, 30 };
		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("Smallest number is:" + a[1]);
	}

	// =========================================================================================================================================

	public static void ToFindAvg() {

		int sum = 0;
		double avg;
		int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}
		System.out.println(sum);
		avg = sum / array1.length;
		System.out.println(avg);
	}

	// =====================================================================================================================================
	public static void sumOfArray() {
		int sum = 0;
		int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// System.out.println(Arrays.toString(array1));
		/*
		 * for(int i:array1) { //System.out.println(i); sum += i;
		 * System.out.println(sum);
		 */
		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}
		System.out.println(sum);
	}

	// ==========================================================================================================================================
	public static void removing_duplicate_Numbers() {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		int duplicateArray[] = { 2, 2, 3, 3, 4, 5, 7, 7, 11, 12 };
				
		for (int i = 0; i < duplicateArray.length - 1; i++) {
			if (duplicateArray[i] != duplicateArray[i + 1]) {
				arr.add(duplicateArray[i]);
			}
		}
		arr.add(duplicateArray[duplicateArray.length - 1]);
		System.out.println(arr);
		
	}

	// ==============================================================================================================================================
	public static void missing_number() {
		int numbers[] = new int[] { 1, 2, 3, 4, 6, 7 };
		int totalnums = numbers.length;
		int exp_num = totalnums * ((totalnums + 1) / 2);
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		System.out.println(sum - exp_num);
	}

	// ======================================================================================================================================================
	// =====================================================================================================================================================

	public static void sorted_numbers() {

		int x[] = { 10, 15, 20, 30, 9, 5, 45, 50 };
		Arrays.sort(x);
		System.out.println("Sorted Array:" + Arrays.toString(x));
		System.out.println("Smallest number:" + x[0]);
	}

	// ===========================================================
	public static void smallest_Number() {

		int x[] = { 10, 15, 30, 9, 5, 45, 50 };

		int len = x.length;
		int small = x[0];
		int big = x[0];
		for (int i = 0; i < len; i++) {
			if (small > x[i]) {
				small = x[i];
			}
			if (big < x[i]) {
				big = x[i];
			}
		}

		System.out.println("smallest number:" + small);
		System.out.println("Biggest number:" + big);
	}

	// =====================================================================================================================
	public static void alphabets() {

		for (char c = 'a'; c <= 'z'; c++) {

			System.out.print(c);
		}

	}
	// ==============================================================================================================================

	public static void copy_method1() {

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = a;

		// System.out.println(b.length);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");

		}

		b[1] = 200;
		System.out.println("@@" + "a value:" + a[1]);
	}
	// ========================================================================================================================

	public static void Using_ForLoop() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			System.out.print(b[i]);

		}
		System.out.println("");
		a[1] = 25;
		System.out.println(b[1]);
		b[1] = 52;
		System.out.println(a[1]);

	}

	// ==========================================================================================================================================
	public static void Usign_Arrays_Copy() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b[] = Arrays.copyOf(a, a.length);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}
	// ======================================================================================================================================

	public static void clone_method() {
		int a[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int b[] = a.clone();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	// =============================================================================================================================================
	public static void using_ArrayCopy() {
		int a[] = { 112, 221, 323, 421, 531, 642, 754, 821, 932 };
		int b[] = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
