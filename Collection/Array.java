package Collection;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("Output:-");
		System.out.println(Arrays.toString(a));
		
		System.out.println();
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
		System.out.println("Output:-");
		System.out.println(Arrays.toString(b));

	}

}
