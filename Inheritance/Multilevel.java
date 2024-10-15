package Inheritance;
class Rectangle{
	int length;
	int breadth;
	Rectangle(){
		System.out.println("Rectangle class constructor");
	}
	void areaOfRec() {
		System.out.println(length*breadth);
	}
}

class Triangle extends Rectangle{
	int height;
	Triangle(){
		System.out.println("Triangle class constructor");
	}
	void areaOfTri() {
		System.out.println(0.5*breadth*height);
	}
}
class Circle extends Triangle{
	int radius;
	Circle(){
		System.out.println("Circle class constructor");
	}
	void areaOfCir() {
		System.out.println(2*3.14*radius);
	}
	
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle();
		c.length=2;
		c.breadth=4;
		c.height=2;
		c.radius=5;
		c.areaOfRec();
		c.areaOfTri();
		c.areaOfCir();

	}

}




