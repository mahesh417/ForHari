package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPgm {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(101, "mahesh");
		hm.put(103,"Chiru");
		hm.put(102, "Pk");
		hm.put(104, "Charan");
		System.out.println(hm);
		
		for(Entry<Integer, String> m:hm.entrySet())	{
		System.out.println(m.getKey()+" "+m.getValue());
		
		}
			
		

	}

}
