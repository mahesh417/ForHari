package bufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbers {

	public static void main(String[] args) throws Exception {
		// method();
		// method2();
		method3();
	}

	public static void method() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Range");
		int n = Integer.parseInt(br.readLine());
		int i;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("not a prime");
				break;
			}
		}
		if (n == i) {
			System.out.println(n + " " + "is a prime");
		}

	}

	public static void method2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Range");
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}

	}

	public static void method3() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Range");
		int n = Integer.parseInt(br.readLine());
		System.out.println("enter second value");
		int m = Integer.parseInt(br.readLine());
		if (n * m == 6) {
			System.out.println("Gmail");
		} else if (n * m == 10) {
			System.out.println("facebook");
		} else {
			System.out.println("Invalid");
		}

	}

}
