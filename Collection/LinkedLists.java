package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		LinkedList l=new LinkedList();
		l.add(1);
		l.add(2);
		l.add("java");
		l.add("language");
		System.out.println(l);
		l.addFirst("python");
		System.out.println(l);
		l.addLast("19");
		l.add(22);
		System.out.println(l);
		l.clone();
		System.out.println(l);
		l.clear();
		System.out.println(l);
		
		//Add first and last iin arraylist
		ArrayList al=new ArrayList<>();
		al.add(1);
		al.add("java");
		al.add(2);
		System.out.println(al);
		addFirst(al, 0);
		addLast(al, 8);
		System.out.println(al);
		
		System.out.println();
		
	}
	
	static void addFirst(ArrayList<Integer> al,int element) {
		al.add(0,element);
		
	}
	
	static void addLast(ArrayList<Integer> al,int element) {
		al.add(al.size(),element);
		
	}
	
	

}
