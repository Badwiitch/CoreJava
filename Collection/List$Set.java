package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class List$Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------List-------");
		List<Integer> l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println("Add:-"+l);
		l.add(3);
		System.out.println("Contain duplicate:-"+l);
		l.add(null);
		System.out.println("Contain null values:-"+l);
		
		System.out.println("----------------------");
		System.out.println("By using for each loop");
		for(Integer i:l) {
			System.out.println(i);
		}
		
		System.out.println("----------------------");
		System.out.println("By using for loop");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("----------------------");
		System.out.println("By using Iterator");
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("----------------------");
		System.out.println("By using ListIterator");
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("----------------------");
		System.out.println("By using While loop");
		int j=0;
		while(j<l.size()) {
			System.out.println(l.get(j));
			j++;
		}
		System.out.println("-------Set-------");
		Set<Integer> s=new HashSet();
		s.add(11);
		s.add(12);
		s.add(13);
		System.out.println("Add:-"+s);
		s.add(13);
        
		//Can't contain any duplicate value
		System.out.println(s);
		s.add(null);
		s.add(null);
		//Can contain only 1 null value
		//it does not follow insertion order
		System.out.println(s);
		System.out.println("----------------------");
		System.out.println("By using Iterator");
		Iterator i1=s.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("----------------------");
		System.out.println("By using for each");
		for(Integer i2:s) {
			System.out.println(i2);
		}
		
		

	}

}
