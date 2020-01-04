package javaPrograms;

public class StringMethods {

	public static void main(String[] args) {
		/*String str= "geeksforgeeks";
        char c = 'e';
        System.out.println(count(str, c));
		*/
		
		
		String str = "This is a is book";
		
		int n = str.indexOf("is");
		int n2 = str.lastIndexOf("is");
	//	System.out.println(n + " " + n2);
	//	System.out.println(n2);
		String s = new String("Java Program");
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 8));

/*		String Email = "amahesh417@gmail.com";
		int res = Email.indexOf("@");
		String res2 = Email.substring(0, res);
		System.out.println(res2);
		String res3 = Email.substring(0, 10);
		System.out.println(res3);
*/	}

	private static char[] count(String str, char c) {
		// TODO Auto-generated method stub
		return null;
	}

}
