package Polymorphism;

final class A5{           //class as final
	final void sum(int a,int b) {     //method as final
		System.out.println(a+b);
	}
}

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.sum(3, 6);
		final int x=5;      //variable as method

	}

}
