package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iterator_listIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------List-------");
		List<Integer> l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		
		System.out.println("----------------------");
		System.out.println("Next");
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("----------------------");
		System.out.println("Previous(Reverse)");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
