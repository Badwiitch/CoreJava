package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		h.add(1);
		h.add("helo");
		h.add(3);
		h.add(2);
		h.add("Hey");
		h.add(null);
		h.add("hi");
		h.add(true);
		h.add(5);
		h.add(5);
		h.add(4);
		System.out.println(h);
		System.out.println(h.hashCode());
		h.remove(null);
		System.out.println(h); 
		
		//Remove Duplicates from an array
		System.out.println("---Remove Duplicates from an array---");
		int arr[]= {1,2,3,4,2,5,1};
		HashSet h1=new HashSet();
		for(int i=0;i<arr.length;i++) {
			h1.add(arr[i]);
		}
		System.out.println(h1);
		System.out.println();
		
		//Remove Duplicates from a String
		System.out.println("---Remove Duplicates from an String---");
		String s="java";
		HashSet h2=new HashSet();
		for(int i=0;i<s.length();i++) {
			h2.add(s.charAt(i));
		}
		System.out.println("Using HashSet:-"+h2);
		System.out.println();
		
		//Remove Duplicates from a String
		//It allows Insertion order arranging
		String s1="java";
		LinkedHashSet h3=new LinkedHashSet();
		for(int i=0;i<s1.length();i++) {
			h3.add(s1.charAt(i));
		}
		System.out.println("Using LinkedHashSet:-"+h3);
		System.out.println();
		
		String s2="java";
		TreeSet h4=new TreeSet();
		for(int i=0;i<s2.length();i++) {
			h4.add(s2.charAt(i));
		}
		System.out.println("Using TreeSet:-"+h4);
		
	}
	


}
