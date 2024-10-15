package Inheritance;
class A1{
	int x=5;
}

class B1 extends A1{
	int y=10;
}

class C extends A1{
	int z=15;
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		System.out.println(b.x);
		System.out.println(b.y);
		C c=new C();
		System.out.println(c.x);
		System.out.println(c.z);

	}

}
