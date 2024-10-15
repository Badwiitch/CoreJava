package Inheritance;
class rectangle{
	int lenght;
	int breadth;
	//constructor overloading
	rectangle(int lenght,int breadth)
	{
		this.lenght=lenght;
		this.breadth=breadth;
	}
	void areaOfrectangle()
	{
		System.out.println(lenght*breadth);
	}
}
class Trianglee extends rectangle{
	int height;
	Trianglee(int lenght,int breadth,int height)
	{
		super(lenght, breadth);
		this.height=height;
	}
	void areaOftriangle()
	{
		System.out.println(lenght*breadth*height);
	}
	
}

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trianglee t=new Trianglee(2,3,4);
		t.areaOfrectangle();
		t.areaOftriangle();

	}

}