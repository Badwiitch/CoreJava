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
		
		int a[]= {1,2,3,4,5,6,0};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int pos=2;
		int element=7;
		for(int i=a.length-2;i>=pos;i--) {
			a[i+1]=a[i];
		}
		a[pos]=element;
		System.out.println(Arrays.toString(a));
		
		
		int b[]= {0,1,2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
		int pos1=2;
		int element1=7;
		for(int i=0;i<=pos1;i++) {
			b[i]=b[i+1];
		}
		b[pos1]=element1;
		System.out.println(Arrays.toString(b));

	}

}
