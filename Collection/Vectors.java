package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add(1);
		v.addElement(2);
		v.add(2, 3);
		v.add(null);
		v.add(null);
		v.add(1);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		//Iterate using Iterator cursor
		System.out.println("---------Iterator cursor-------------");
		Iterator i=v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//Iterate using ListIterator cursor
		System.out.println("---------ListIterator cursor-------------");
		ListIterator li=v.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println();
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		//Iterate using enumerator cursor
		System.out.println("---------Enumerator cursor-------------");
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}		
		
	}

}
