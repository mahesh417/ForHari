package patterns;

/* Write a program to print each word in a new line from 
	the given string “This is my java world” */

public class SystemLineSeparator {

	public static void main(String[] args) {
		String s = "";
		String s1 = "This is my java world";
		// String output1 = s1.replace(" ",System.lineSeparator());
		// System.out.println(output1);

		String s2[] = s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			s = s2[i];
			System.out.println(s);
		}

	}
}