package Inheritance;
class A
{
	int x=5;
	void printX() {
		System.out.println(x);
	}
}

class B extends A
{
	int y=10;
	void printY()
	{
		System.out.println(y);
	}
}

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Note:-
		//By creating the child class obj we can access the properties
		//of parent class 
		//But by creating the parent class obj we can't access the 
		//properties of child class
//		A a=new A();
//		System.out.println(a.x);
//		a.printX();
		B b=new B();
		System.out.println(b.y);
		System.out.println(b.x);
		b.printX();
		b.printY();

	}

}
