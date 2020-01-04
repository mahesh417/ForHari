package collections;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap_pgm {

	public static void main(String[] args) {

		HashMap<Object,Object> t = new HashMap<>();
		t.put("099", "mnnfdf");
		t.put("100", "balayaya");
		t.put("101","mahesh");
		t.put("102","kumar");
		t.put("105", "kalyan");
		t.put("106", "pawan");
		t.put("103","chiru");
		t.put("104", "venky");
		System.out.println("hash"+t);
		
		TreeMap<Object, Object>tree=new TreeMap<>();
		tree.putAll(t);
		//t.put(null, "mahesh");//NullPointerException key must not be Null
		tree.put("101", null);//Value can be null and new value replace to the old value
		System.out.println("treemap"+tree);
		System.out.println("after"+tree.headMap("105"));//<
		System.out.println("after2"+tree.tailMap("102"));//>=
		System.out.println(tree.containsKey("103"));
		t.clear();
		System.out.println(tree);
	}

}
