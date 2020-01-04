package bufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TEST1 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Given Input:");
		try {
			int num1 = Integer.parseInt(br.readLine());
			int num2 = Integer.parseInt(br.readLine());

			for (int i = num1; i <= num2; i++) {

				if ((i % 3 == 0) && (i % 7 == 0)) {
					System.out.println("CLOUDNIX");
				} else if (i % 3 == 0) {
					System.out.println("CLOUD");
				} else if (i % 7 == 0) {
					System.out.println("NIX");

				} else {
					System.out.println(i);
				}

			}

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
