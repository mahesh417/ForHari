package patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Integers_Adding_In_List {

	static List<Integer> list;
	static String original = " ";

	public static void main(String[] args) {

		int arr1[] = { 1, 3, 5, 7 };
		int arr2[] = { 2, 4, 6, 8 };

		list = new ArrayList<>(arr1.length);
		for (int i : arr1) {
			list.add(Integer.valueOf(i));
		}

		for (int j : arr2) {
			list.add(Integer.valueOf(j));
		}

		Collections.sort(list);
		System.out.println(list);

	}
}
