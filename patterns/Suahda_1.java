package patterns;

public class Suahda_1 {

	static int i, j, k;

	public static void main(String[] args) {

		int a[] = { 8,7,3,2 };
		int b[] = { 1,2,3,5 };
		int c[] = { 2,5,3,1 };
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < b.length; j++) {
				for (k = 0; k < c.length; k++) {
					if (((a[i] == b[j] && b[j] == c[k] && c[k] == a[i])) ) {
						System.out.print(a[i] + " ");
					}
				}
			}

		}
		System.out.println();
		System.out.println("Duplicate Numbers");
	}

}
