package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet_Iterator {

	public static void main(String[] args) {

		Set<String> hash_Set = new HashSet<String>();
		hash_Set.add("ide");
		hash_Set.add("rc");
		hash_Set.add("wd");
		hash_Set.add("grid");
		hash_Set.add("wd");

		// Get Set interface into iterators
		Iterator<String> itr = hash_Set.iterator();

		String toolname = itr.next();
		System.out.println(toolname);

	}

}
