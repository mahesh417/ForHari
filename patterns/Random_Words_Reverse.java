package patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/** public class Random_Words_Reverse {

	
	static String org = "software QA engineer";
	static String rev = " ";
	static String finalLine = " ";
	static Scanner sc;
	static String givenWord = "";

	public static void main(String[] args) {

		System.out.println("Please enter one word from this line  --software QA engineer--");
		sc = new Scanner(System.in);
		givenWord = sc.nextLine();

		for (int i = givenWord.length() - 1; i >= 0; i--) {
			rev = rev + givenWord.charAt(i);
		}

		String singleword[] = org.split(" ");

		if (givenWord.equalsIgnoreCase("qa")) {
			finalLine = singleword[0] + " " + rev + " " + singleword[2];
			System.out.println("final op:" + finalLine);
		}

		else if (givenWord.equalsIgnoreCase("software")) {
			finalLine = rev + " " + singleword[1] + " " + singleword[2];
			System.out.println("final op:" + finalLine);
		}

		else if (givenWord.equalsIgnoreCase("engineer")) {
			finalLine = singleword[0] + " " + singleword[1] + " " + rev;
			System.out.println("final op:" + finalLine);
		}

		else {
			System.out.println("give string is not from original Line");
		}

	}*/
	 
public class Random_Words_Reverse {

	static List<String> list;
	static String option = " ";

	public static String reverse(String s) {
		String k = " ";

		for (int i = s.length() - 1; i >= 0; i--) {
			k = k + s.charAt(i);
		}
		return k;

	}

	public static void main(String[] args) {

		String s = "Software QA Engineer";

		String spl[] = s.split(" ");
		list = new ArrayList<String>(Arrays.asList(spl));
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String");
		String ip = sc.nextLine();
		option = ip;
		switch (option) {
		case "Software":
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(ip)) {
					// int index = list.get(i).indexOf(ip);
					String rev = (reverse(ip));
					list.remove(ip);
					list.add(0, rev);
					// list.add(index, rev);
					System.out.println(String.join(" ", list));

				}
			}
			break;
		case "QA":
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(ip)) {
					// int index = list.get(i).indexOf(ip);
					String rev = (reverse(ip));
					list.remove(ip);
					// list.add(index, rev);
					list.add(i, rev);
					System.out.println(String.join(" ", list));

				}
			}
			break;
		case "Engineer":
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(ip)) {
					// int index = list.get(i).indexOf(ip);
					String rev = (reverse(ip));
					list.remove(ip);
					// list.add(index, rev);
					list.add(i, rev);
					System.out.println(String.join(" ", list));

				}
			}
			break;

		default:
			System.out.println("Wrong Search");
			break;
		}
		sc.close();
	}

}
