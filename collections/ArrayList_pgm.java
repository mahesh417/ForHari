package collections;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayList_pgm {

	public static void main(String[] args) {

		 program1();
		// program2();
		// program3();
		// Iterator_pgm();
		// Array1();
	}

	public static void program1() {

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(11);
		ar.add(22);
		ar.add(11);
		ar.add(33);
		ar.add(null);
		ar.add(null);
		ar.add(new Integer(44));
		ar.set(1, 17);
		System.out.println(ar);
		System.out.println("size:" + ar.size());
		ar.remove(2);
		System.out.println(ar);

		boolean s = ar.contains(17);
		System.out.println(s);

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));

		}

	}

	public static void program2() {

		ArrayList<Object> al = new ArrayList<>();

		al.add(11);
		al.add("mahesh");
		al.add(true);
		al.add(null);

		System.out.println(al.size());

	}

	public static void program3() {

		Vector<Object> vl = new Vector<>();
		vl.addElement(12);
		vl.addElement("kumar");
		vl.addElement(32);
		vl.removeElement(32);
		vl.removeAllElements();

		System.out.println(vl);
		// vl.removeAllElements();
		// System.out.println("aftre"+vl);

	}

	public static void Iterator_pgm() {
		ArrayList<Object> al = new ArrayList<>();
		al.add(10);
		al.add("mahehs");
		al.add(20);
		al.add(30);
		al.add("kumar");
		al.add(10);

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		/*
		 * Iterator it=al.iterator(); 
		 * while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */

	}

	
}
