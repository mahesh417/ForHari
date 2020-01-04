package patterns;

import java.util.ArrayList;

public class RemovingDuplicatetsInArray {

	public static void main(String[] args) {
		
	
	ArrayList<Integer> arr = new ArrayList<Integer>();

		int duplicateArray[] = { 2, 2, 3, 3, 4, 5, 7, 7, 11, 12 };
				
		for (int i = 0; i < duplicateArray.length - 1; i++) {
			if (duplicateArray[i] != duplicateArray[i + 1]) {
				arr.add(duplicateArray[i]);
			}
		}
		arr.add(duplicateArray[duplicateArray.length - 1]);
		System.out.println(arr);
	}
}
