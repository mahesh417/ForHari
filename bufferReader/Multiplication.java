package bufferReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Multiplication {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number");
		String s = br.readLine();
		int n = Integer.parseInt(s);
		//System.out.println("Enter Second number");
		//int t = Integer.parseInt(br.readLine());
		// System.out.println(n * t);

		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println(i + " " + "*" + " " + j + " " + "=" + " " + i * j);
				

			}
			System.out.println(" "+" ");
		}

	}

}
