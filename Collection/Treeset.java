package Collection;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet();
		t.add(1);
		t.add(2);
		t.add(5);
		t.add(1);
		t.add(4);
		System.out.println("Ceiling:-"+t.ceiling(6));
		System.out.println("Floor:-"+t.floor(3));
		//t.add(null);
		//t.add("java");
		System.out.println(t);
		
		//Remove duplicates from a string
		String s2="java";
		TreeSet h4=new TreeSet();
		for(int i=0;i<s2.length();i++) {
			h4.add(s2.charAt(i));
		}
		System.out.println();
		System.out.println("Using TreeSet:-"+h4);

	}

}
