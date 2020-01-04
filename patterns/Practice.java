package patterns;

public class Practice {

	public static void main(String[] args) {
		String str = "m1m2ahesh1234";
		String[] mk = str.split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))");
		System.out.println(mk[0]);
		System.out.println(mk[1]);

	}
}
