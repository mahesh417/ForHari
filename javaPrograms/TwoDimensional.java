package javaPrograms;

public class TwoDimensional {

	public static void main(String[] args) {

		// m1();
		 m2();
		//m3();
	}

	public static void m1() {


		int a[][] = new int[2][3];
		int i, j, k = 0;
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = k;
				k++;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void m2() {


		int a[][] = new int[4][4];
		/*
		 * a[0]=new int[1]; 
		 * a[1]=new int[2];
		 * a[2]=new int [3]; 
		 * a[3]=new int[4];
		 */
		int i, j, k = 0;
		for (i = 0; i < 4; i++) {
			for (j = 0; j < i + 1; j++) {
				a[i][j] = k;
				k++;
				System.out.print(a[i][j] + " ");

			}
			System.out.println();

		}

	}

	public static void m3() {

		int ar[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 6, 7,8} };
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}

}
