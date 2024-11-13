package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		System.out.println("Collection 1:-"+c);
		Collection c1=new ArrayList();
		c1.add(4);
		c1.add(5);
		c1.add(6);
		System.out.println("Collection 2:-"+c1);
		c.addAll(c1);
		System.out.println("Merger c1 collection in c:-"+c);
		c.remove(2);
		System.out.println("Remove an element:-"+c);
		//c.removeAll(c1);
		//System.out.println("Remove entier c1:-"+c);
		System.out.println("Contains:-"+c.contains(4));
		
		System.out.println("Contains All:-"+c.containsAll(c1));
		System.out.println("Empty:-"+c.isEmpty());
		System.out.println("Equals:-"+c.equals(c1));
		System.out.println("HashCode:-"+c.hashCode());
		System.out.println("Size:-"+c.size());
		

	}

}
