package collections;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapPgm {
	
	
	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(102, "mahesh");
		tm.put(104,"Chiru");
		tm.put(101, "Pk");
		tm.put(103, "Charan");
		
		System.out.println(tm);
		
		for(Entry<Integer, String> m:tm.entrySet())	{
		System.out.println(m.getKey()+" "+m.getValue());
		
		}
			
		

	}


}
