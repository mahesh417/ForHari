package patterns;

public class Sudha_2 {

	public static void main(String[] args) {
	
		String str="harikumarreddy";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')) {
				System.out.print(c+",");
			}
		}
		
		
	}
	
}
