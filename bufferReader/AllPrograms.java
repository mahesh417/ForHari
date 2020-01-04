package bufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllPrograms {

	public static void main(String[] args) throws Exception {
		// m1();
		// m2();
		// m3();
		// m4();
		m5();
	}

	public static void m1() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");

		try {
			int a = Integer.parseInt(br.readLine());
			if (a % 2 == 0) {
				System.out.println("Even number");
			} else {
				System.out.println("Odd number");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void m2() {

		BufferedReader Prime = new BufferedReader(new InputStreamReader(System.in));
		int i, n;
		System.out.print("Check Number to Prime or Not : ");
		try {
			String s = Prime.readLine();
			n = Integer.parseInt(s);
			for (i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.println(n + " Number is not Prime");
					break;
				}
			}
			if (n == i) {
				System.out.println(n + " Number is a Prime Number");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void m3() throws Exception {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("checks the number prime or not");

		String s = br.readLine();
		int n = Integer.parseInt(s);
		int i;

		for (i = 2; i < n; i++) {

			if (n % i == 0) {
				System.out.println("Not a prime");
				break;
			}

		}
		if (n == i) {
			System.out.println("Prime" + " " + i);
		}

	}

	public static void m4() throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Enter range");
		int n = Integer.parseInt(br.readLine());
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
				System.out.print(i + " ");
			}
		}
	}

	public static void m5() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string ");
		String str = br.readLine();
		String str2 = br.readLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == str2.charAt(0)) {
				count++;
				System.out.print(c + " ");
			}
		}
		System.out.println();
		System.out.println(count);

	}
	
	}
