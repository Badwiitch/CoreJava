package Polymorphism;
class A{
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	void sub(int a,int b) {
		System.out.println(a-b);
	}
}

class B extends A{
	@Override
	void sum(int a,int b) {
		super.sum(a, b);
		super.sub(a, b); 
		System.out.println("Sum of a+b: "+(a+b));
	}
	@Override
	void sub(int a,int b) {
		
		System.out.println("Sub of a-b: "+(a-b));
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.sum(5, 6);
		b.sub(7, 4);

	}

}
