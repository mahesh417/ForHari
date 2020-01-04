package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_interface {

	public static void main(String[] args) {

		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("ide");
		hash_Set.add("rc");
		hash_Set.add("wd");
		hash_Set.add("grid");
		hash_Set.add("wd");

		int len = hash_Set.size();
		System.out.println(len);
		for (String toolname : hash_Set) {
			System.out.println(toolname);
		}

		Set<String> tree_Set = new TreeSet<String>();
		tree_Set.add("Arun");
		tree_Set.add("zAjay");
		tree_Set.add("pranil");
		tree_Set.add("kumar");

		for (String names : tree_Set) {
			System.out.println(names);
		}

		Set<String> Newtools = new TreeSet<String>(hash_Set);
		for (String tools : Newtools) {
			System.out.println(tools);
		}

	}

}
