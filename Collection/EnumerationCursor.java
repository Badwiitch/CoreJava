package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationCursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> l=new Vector<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		
		//Iterate using enumerator cursor
		System.out.println("---------Enumerator cursor-------------");
		Enumeration e=l.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//Iterate using Iterator cursor
		System.out.println("---------Iterator cursor-------------");
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//Iterate using ListIterator cursor
		System.out.println("---------ListIterator cursor-------------");
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println();
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
