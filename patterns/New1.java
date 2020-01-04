package patterns;

public class New1 {

	static String str = "WY20B0009";
	static String lastchar=" ";
	static int result;
	static int finalValue;

	public static void main(String[] args) {
		
		System.out.println(str);
		lastchar=str.substring(str.length()-1);
		for(int i=1;i<10;i++) {
			if(lastchar.equals("9"));
			result=Integer.parseInt(lastchar);
			finalValue=result+i;
			System.out.println("WY20B00"+finalValue);
		}
		
		
	}
}
