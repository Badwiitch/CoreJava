package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new LinkedList();
		l.add(5);
		l.add(6);
		l.add(7);
		ArrayList al=new ArrayList<>(l);
		al.add(1);
		al.add(2);
		al.add("rahee");
		al.add("mandaa");
		al.add(3, "is");
		System.out.println(al);
		
		ArrayList ans=new ArrayList();
		int count=0;
		for(int i=1;i<=100;i++) {
			
			if(i%2==0) {
				ans.add(i);
				count++;
			}
		}
		System.out.println(ans);
		System.out.println(count);

	}

}
