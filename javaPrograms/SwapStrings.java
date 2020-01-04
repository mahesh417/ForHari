package javaPrograms;

public class SwapStrings {

	public static void main(String[] args) {
		String s1="mahesh";
		String s2="kumar";
		System.out.println("Before Swapping:");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
/*		String tempstr =s1;
		s1=s2;
		s2=tempstr;
		System.out.println("After Swapping:");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
*/		
		s1=s1+s2;
		System.out.println("s1:"+s1);
		s2=s1.substring(0, s1.length()-s2.length());
		System.out.println("s2:"+s2);
		s1=s1.substring(s2.length());
		System.out.println("s1:"+s1);
		/*System.out.println("After Swapping:");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
*/		

	}

}
