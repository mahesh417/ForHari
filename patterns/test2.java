package patterns;

public class test2 {

	static String str = "1234ABCD5678";
	static String st = " ";
	static String middle = "";
	static String reverse = " ";
	static String original = " ";
	static String amk = " ";

	public static String reverse(String s) {

		for (int i = 0; i < s.length(); i++) {
			st = s.charAt(i) + st;
		}
		return st;
	}

	public static void main(String[] args) {

		String[] mk = str.split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))");

		middle = mk[1];

		reverse = reverse(middle);

		original = mk[0] + reverse + mk[2];

		for (int i = 0; i < original.length(); i++) {
			char c = original.charAt(i);
			if (c == ' ') {

			} else {

				amk = amk + c;
			}

		}
		System.out.println(amk);

	}

}
